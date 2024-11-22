package priingles.personal;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class Main {
    public static void main(String[] args) {

        System.out.println("just BETTER!");

        MongoClient mongoClient = new MongoClient("mongo-dbserver");
        MongoDatabase database = mongoClient.getDatabase("personal");
        MongoCollection<Document> collection = database.getCollection("personal");
        Document doc = new Document("name", "priingles")
                .append("class", "software engineering")
                .append("year", "2024")
                .append("result", new Document("CW", 90).append("EX", 85));
        collection.insertOne(doc);

        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());
    }
}