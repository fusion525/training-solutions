package exam02.cv;

import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills;

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
