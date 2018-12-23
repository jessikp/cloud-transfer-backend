package com.github.cloud_transfer.cloud_transfer.uploader;

import com.github.cloud_transfer.cloud_transfer.model.SpeedMeter;

import java.io.IOException;

public interface Uploader extends SpeedMeter {

    void upload() throws IOException, InterruptedException;

}
