package springboot;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1, "Java", "Introductin to Java 8"),
            new Topic(2, "Spring", "Sprin 5 in action"),
            new Topic(3, "Hibernate", "Hibernate and JPA")));

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(int id) {
        //Topic topic2 = new Topic(2, "Spring", "Sprin 5 in action");
        //topics.add(topic2); UnsupportedOperationException because list is connected to tale
        //elements mustn't be added
        Topic topic = topics.stream().filter(t -> t.getId() == id).findFirst().get();
        return topic;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, int id) {
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId() == id) {
                topics.set(i, topic);
            }
        }
    }

    public void deleteTopic(@PathVariable int id) {
        //topics.removeIf(t->t.getId() == id);

        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getId() == id) {
                topics.remove(i);
            }
        }
    }

}
