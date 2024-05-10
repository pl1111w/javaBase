package jdk8.jdk8Stream;

import jdk8.jdk8Stream.entity.Address;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @title: pl1111w
 * @description: middle status of stream
 * [Filter Map FlatMap Peek Distinct Sort Limit]
 * @author: Kris
 * @date 2022/3/21 15:51
 */
public class MiddleStream {
    public static void main(String[] args) {
        List<String> cityListOne = new ArrayList<>();
        cityListOne.add("郑州");
        cityListOne.add("濮阳");
        cityListOne.add("驻马店");
        List<String> cityListTwo = new ArrayList<>();
        cityListTwo.add("廊坊");
        cityListTwo.add("邢台");
        cityListTwo.add("石家庄");
        List<String> cityListThree = new ArrayList<>();
        cityListThree.add("大同");
        cityListThree.add("太原");
        List<String> cityListFour = new ArrayList<>();
        cityListFour.add("南昌");
        cityListFour.add("九江");

        Address addressOne = new Address();
        addressOne.setProvince("河南");
        addressOne.setCityList(cityListOne);

        Address addressTwo = new Address();
        addressTwo.setProvince("河北");
        addressTwo.setCityList(cityListTwo);

        Address addressThree = new Address();
        addressThree.setProvince("山西");
        addressThree.setCityList(cityListThree);

        Address addressFour = new Address();
        addressFour.setProvince("江西");
        addressFour.setCityList(cityListFour);

        List<Address> addressList = new ArrayList<>();
        addressList.add(addressOne);
        addressList.add(addressTwo);
        addressList.add(addressThree);
        addressList.add(addressFour);

        //使用map：将一种流数据转换为另外一种流 输出所有的城市名称 将T类型转为R类型 Address->String
        addressList.stream()
                .map(Address::getCityList)
                .forEach(cityList -> {
                    cityList.forEach(System.out::print);
                });
        System.out.println();
        //使用flatMap输出所有城市名称 将T类型转为Stream类型
        addressList.stream()
                .flatMap(a -> a.getCityList().stream())
                .forEach(System.out::print);


        String value = "my name is jordan";
        //中间操作debug 类似foreach 不会有打印
        Stream<String> peek = Stream.of(value.split(" ")).peek(System.out::println);

        //limit 取前3个
        System.out.println("********limit*****");
        Stream<String> limit = Stream.of(value.split(" ")).limit(3);
        limit.forEach(System.out::println);
        //skip 跳过前面3个
        System.out.println("---------skip------");
        String name[] = new String[]{"my", "name", " is", "jordan"};
        Stream<String> skip = Stream.of(name).skip(3);
        skip.forEach(System.out::print);
        //sorted 排序 排序的数据需要重写compareTo
        Stream<String> sorted = Stream.of(name).sorted();
        //distinct 去重
        Stream<String> distinct = Stream.of(name).distinct();
        //filter 过滤
        Stream<String> filterStream = Stream.of(value.split(" ")).filter(s -> s.contains("m"));
        //contact 合并
        Stream<String> contactList = Stream.concat(distinct, filterStream);
        //mapToInt mapToDouble
        IntStream intStream = Arrays.stream(new Integer[]{1, 2, 3}).mapToInt(Integer::intValue);
        DoubleStream doubleStream = Arrays.stream(new Integer[]{1, 2, 3}).mapToDouble(Double::valueOf);
    }
}
