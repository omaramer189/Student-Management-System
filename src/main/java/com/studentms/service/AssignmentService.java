package com.studentms.service;

import com.studentms.model.Assignment;
import com.studentms.repository.AssignmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
    private final AssignmentRepository assignmentRepository;

    public AssignmentService(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }

    public Assignment saveAssignment(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }
}
