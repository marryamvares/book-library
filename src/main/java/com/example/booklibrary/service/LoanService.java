package com.example.booklibrary.service;

import com.example.booklibrary.model.Loan;
import com.example.booklibrary.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;
    public List<Loan> listAllLoan() {
        return loanRepository.findAll();
    }

    public Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    public Loan getLoan(Integer id) {
        return loanRepository.findById(id).get();
    }

    public void deleteLoan(Integer id) {
        loanRepository.deleteById(id);
    }
}
