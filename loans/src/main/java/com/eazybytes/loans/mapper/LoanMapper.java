package com.eazybytes.loans.mapper;

import com.eazybytes.loans.dto.LoansDto;
import com.eazybytes.loans.entity.Loans;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoanMapper {

    public static Loans mapToLoan(LoansDto loansDto, Loans loans){
        loans.setLoanType(loansDto.getLoanType());
        loans.setTotalLoan(loansDto.getTotalLoan());
        loans.setAmountPaid(loansDto.getAmountPaid());
        loans.setOutstandingAmount(loans.getOutstandingAmount());
        loans.setMobileNumber(loansDto.getMobileNumber());
        return loans;
    }
    public static LoansDto mapToLoansDto(Loans loans, LoansDto loansDto){
        loansDto.setLoanType(loans.getLoanType());
        loansDto.setTotalLoan(loans.getTotalLoan());
        loansDto.setAmountPaid(loans.getAmountPaid());
        loansDto.setOutstandingAmount(loans.getOutstandingAmount());
        loansDto.setMobileNumber(loans.getMobileNumber());
        return loansDto;
    }
}
