package com.gaurav.bootstrap;

import com.gaurav.document.Address;
import com.gaurav.document.Hotel;
import com.gaurav.document.Rating;
import com.gaurav.document.Review;
import com.gaurav.repository.HotelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private HotelRepository repository;

    public DataLoader(HotelRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        Hotel mirage = new Hotel( "Mirage", Double.valueOf(1100d),
                new Address("Las Vegas", "USA"),
                Arrays.asList(new Review("zack", Rating.EXCEPTIONAL, true),
                        new Review("cody", Rating.GOOD, false)));

        Hotel bellagio = new Hotel( "Bellagio", Double.valueOf(2100d),
                new Address("Las Vegas", "USA"),
                Arrays.asList(new Review("Anna", Rating.EXCEPTIONAL, true),
                        new Review("Jacob", Rating.EXCEPTIONAL, true)));

        Hotel caesarsPalace = new Hotel( "Caesars Palace", Double.valueOf(1100d),
                new Address("Las Vegas", "USA"),
                Arrays.asList(new Review("zack", Rating.GOOD, false),
                        new Review("cody", Rating.AVERAGE, true)));

        List<Hotel> hotels = Arrays.asList(mirage,bellagio,caesarsPalace);

        this.repository.saveAll(hotels);
    }
}
