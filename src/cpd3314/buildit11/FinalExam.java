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
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numRight;
    
    public FinalExam(int numQuestions, int numRight) {
        this.numQuestions = numQuestions;
        this.numRight = numRight;
        pointsEach = 100.0 / numQuestions;
        setScore(this.numRight * pointsEach);
    }
    
    public int getNumQuestions() {
        return numQuestions;
    }
    
    public int getNumRight() {
        return numRight;
    }
    
    
}
