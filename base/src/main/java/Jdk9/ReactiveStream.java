package Jdk9;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2022/3/23 10:33
 */
public class ReactiveStream {

    public static void main(String[] args) {
        SubmissionPublisher<Integer> submissionPublisher = new SubmissionPublisher<>();

        Flow.Subscriber subscriber = new Flow.Subscriber() {
            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription=subscription;
                this.subscription.request(1);
            }

            @Override
            public void onNext(Object item) {
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

            }
        };
        submissionPublisher.subscribe(subscriber);
        for (int i = 0; i < 1000; i++) {
            System.out.println("submit item: " + i);
            submissionPublisher.submit(i);
        }
        submissionPublisher.close();
        while (true) ;

    }
}
