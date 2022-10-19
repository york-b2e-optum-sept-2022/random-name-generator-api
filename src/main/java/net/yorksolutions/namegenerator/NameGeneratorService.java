package net.yorksolutions.namegenerator;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

@Service
public class NameGeneratorService {

    private String[] nameList;

    public NameGeneratorService() {
        this.nameList = new String[]{
                "Michael",
                "Jessica",
                "Christopher",
                "Matthew",
                "Ashley",
                "Jennifer",
                "Joshua",
                "Amanda",
                "Daniel",
                "David",
                "James",
                "Robert",
                "John",
                "Joseph",
                "Andrew",
                "Ryan",
                "Brandon",
                "Jason",
                "Justin",
                "Sarah"
        };
    }

    public String generate() {
        Random rand = new Random();
        int indexOne = rand.nextInt(this.nameList.length);
        int indexTwo = rand.nextInt(this.nameList.length);

        return this.nameList[indexOne] + " " + this.nameList[indexTwo];
    }

    public HashMap test() {
        /*
            {
                id: 0
                name: "adam",
            }
         */
        HashMap map = new HashMap();
        map.put("id", 0);
        map.put("name", "adam");

        return map;
    }

}
