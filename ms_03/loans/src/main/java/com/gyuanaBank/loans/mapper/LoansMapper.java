package com.gyuanaBank.loans.mapper;

import com.gyuanaBank.loans.dto.LoansDto;
import com.gyuanaBank.loans.entity.Loans;

public class LoansMapper {

    public static LoansDto mapToLoansDto(Loans loans, LoansDto loansDto) {
        loansDto.setLoanNumber(loans.getLoanNumber());
        loansDto.setLoanType(loans.getLoanType());
        loansDto.setMobileNumber(loans.getMobileNumber());
        loansDto.setAmountPaid(loans.getAmountPaid());
        loansDto.setOutstandingAmount(loans.getOutstandingAmount());
        loansDto.setTotalLoan(loans.getTotalLoan());
        return loansDto;
    }

    public static Loans mapToLoans(LoansDto loansDto, Loans loans) {
        loans.setLoanNumber(loansDto.getLoanNumber());
        loans.setLoanType(loans.getLoanType());
        loans.setMobileNumber(loans.getMobileNumber());
        loans.setAmountPaid(loans.getAmountPaid());
        loans.setOutstandingAmount(loans.getOutstandingAmount());
        loans.setTotalLoan(loans.getTotalLoan());
        return loans;
    }
}
