/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Task;
import utils.Validation;

/**
 *
 * @author duytr
 */
public class TaskInputer {

    private Task t;

    public Task getStudent() {
        return t;
    }

    private void inputInformation() {
        t = new Task();
        t.setRequirementName(Validation.getStringByRegex("Enter Requirement Name: ", "Requirement can not be empty. Enter again: ", "[A-Za-z0-9 ]+"));
        t.setTaskType(Validation.getInputTaskTypeId());
        t.setDate(Validation.getInputDate("Enter date with format dd/MM/yyyy: ", "Format dd/MM/yyyy only! "));
        t.setPlanFrom(Validation.getInputPlan("Enter From(time): ", "Plan time should be from 8.0, 8.5,...to 17.5. Enter again: "));
        t.setPlanTo(Validation.getInputPlan("Enter To(time): ", "Plan time should be from 8.0, 8.5,... to 17.5. Enter again: "));
        t.setAssignee(Validation.getStringByRegex("Enter Asignee name: ", "Name should contain only letter. Enter again: ", "[A-Za-z ]+"));
        t.setReviewer(Validation.getStringByRegex("Enter Reviewer name: ", "Name should contain only letter. Enter again: ", "[A-Za-z ]+"));

    }

    public void inputTask() {
        inputInformation();
    }
}
