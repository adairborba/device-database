/*
 * Copyright 2016 Adam Stroud
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.adamstroud.devicedatabase.model;

/**
 * A device.
 *
 * @author Adam Stroud &#60;<a href="mailto:adam.stroud@gmail.com">adam.stroud@gmail.com</a>&#62;
 */
public class Device {
    private String model;
    private String nickname;
    private float memoryMb;
    private float displaySizeInches;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getMemoryMb() {
        return memoryMb;
    }

    public void setMemoryMb(float memoryMb) {
        this.memoryMb = memoryMb;
    }

    public float getDisplaySizeInches() {
        return displaySizeInches;
    }

    public void setDisplaySizeInches(float displaySizeInches) {
        this.displaySizeInches = displaySizeInches;
    }
}
