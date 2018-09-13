package com.hisptz.hris.core.Services;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

/**
 * Created by Guest on 8/28/18.
 */
@Service
public class RandomStringGenerator {
    public String givenUsingApache_whenGeneratingRandomAlphabeticString_thenCorrect(int length) {

        String generatedString = RandomStringUtils.randomAlphanumeric(length);

        return generatedString;
    }
}
