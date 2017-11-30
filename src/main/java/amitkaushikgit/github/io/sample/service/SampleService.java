package amitkaushikgit.github.io.sample.service;

import amitkaushikgit.github.io.sample.model.SampleModel;
import amitkaushikgit.github.io.sample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kaushik on 06/11/17.
 */
@Service
public class SampleService {

    private SampleRepository sampleRepo;

    @Autowired
    public SampleService(SampleRepository sampleRepo) {
        this.sampleRepo = sampleRepo;
    }

    public SampleModel getResponse(String url) {
        return sampleRepo.findOne(url);
    }

    public void save(String string) {
        SampleModel entity = new SampleModel();
        entity.setString(string);
        sampleRepo.save(entity);
    }
}
