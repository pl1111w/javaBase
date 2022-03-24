package com.pl1111w.base.Jdk9;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2022/3/23 11:15
 */
public class ReactiveStream2 {

    public static void main(String[] args) {
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
        MyProcessor processor = new MyProcessor();
        publisher.subscribe(processor);

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<>() {
            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                this.subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("subscribe: " + item);
                this.subscription.request(1);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                this.subscription.cancel();
            }


            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("finished....");
            }
        };
        processor.subscribe(subscriber);
        for (int i = -100; i < 100; i++) {
            System.out.println("submit item: " + i);
            publisher.submit(i);
        }
        publisher.close();
        while (true) ;
    }
}

class MyProcessor extends SubmissionPublisher<String> implements Flow.Processor<Integer, String> {

    private Flow.Subscription subscription;


    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Integer item) {
        System.out.println("processor: " + item);
        if (item >= 0) {
            this.submit(String.valueOf(item));
        }
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
