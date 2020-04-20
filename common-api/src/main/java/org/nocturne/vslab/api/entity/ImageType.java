package org.nocturne.vslab.api.entity;

import java.io.Serializable;

public enum ImageType implements Serializable {
    PYTHON2,
    PYTHON3,
    CPP,
    JAVA;

    public String getImageName() {
        switch (this) {
            case PYTHON3: return "vlab-base";
            case PYTHON2: return "vlab-base";
            case JAVA: return "vlab-base";
            case CPP: return "vlab-cpp";
            default: return "vlab-base";
        }
    }
}
