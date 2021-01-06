package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String Name;
    private List<Skill> skills;

    public Cv(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void addSkills(Skill... skill) {

        for (int i = 0; i < skill.length; i++) {
            this.skills.add(skill[i]);
        }

    }

    public List<Skill> getSkills() {
        return this.skills;
    }

    public int findSkillLevelByName(String skillName) {

        for (Skill skill : skills ) {
            if (skill.getName().equals(skillName)) {
                return skill.getLevel();
            }
        }
        throw new IllegalArgumentException();
    }

}
