package test.java.com.kwkim.programmers.practice;

import main.java.com.kwkim.programmers.practice.SkillTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkillTreeTest {

    @Test
    void doSolution() {
        SkillTree skillTree = new SkillTree();

        assertAll("test",
                () -> assertEquals(2, skillTree.solution("CBD", new String[]{
                        "BACDE", "CBADF", "AECB", "BDA"
                }))
        );
    }
}