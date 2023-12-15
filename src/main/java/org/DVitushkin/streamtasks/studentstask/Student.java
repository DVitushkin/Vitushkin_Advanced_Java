package org.DVitushkin.streamtasks.studentstask;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Class describe student entity.
 */

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private Sex sex;
}
