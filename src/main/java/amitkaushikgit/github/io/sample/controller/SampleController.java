package amitkaushikgit.github.io.sample.controller;

import amitkaushikgit.github.io.sample.model.SampleModel;
import amitkaushikgit.github.io.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * Created by kaushik on 06/11/17.
 */
@RestController
@Controller    // This means that this class is a Controller
@RequestMapping(path = "/base") // This means URL's start with /demo (after Application path)
public class SampleController {
    private SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping(path = "/sampleGet") // Map ONLY GET Requests
    public @ResponseBody
    SampleModel getModel(@RequestParam String param) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        return sampleService.getResponse(param);
    }

    @PostMapping(path = "/samplePost")
    public void saveAsset(@RequestParam String param){
        sampleService.save(param);
    }
}