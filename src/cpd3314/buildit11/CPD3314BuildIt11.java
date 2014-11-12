/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cpd3314.buildit11;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CPD3314BuildIt11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GradedActivity act = new GradedActivity();
        act.setScore(83);
        FinalExam exam = new FinalExam(10, 7);
        PassFailActivity pf = new PassFailActivity();
        pf.setScore(55);

        GradedActivity[] activities = {act, exam, pf};

        for (GradedActivity activity : activities) {
            if (activity instanceof FinalExam) {
                FinalExam f = (FinalExam) activity;
                System.out.println("Final Exam: " + f.getNumRight() + "/" + f.getNumQuestions() + " - " + f.getGrade());
            } else if (activity instanceof PassFailActivity) {
                PassFailActivity p = (PassFailActivity) activity;
                System.out.println("Pass/Fail Activity: " + p.getScore() + " - " + p.getGrade());
            } else if (activity instanceof GradedActivity) {
                GradedActivity g = (GradedActivity) activity;
                System.out.println("Graded Activity: " + g.getScore() + " - " + g.getGrade());
            }
        }

    }

}
