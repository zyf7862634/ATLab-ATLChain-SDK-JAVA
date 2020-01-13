package com.supermap.blockchain.sdk;

import org.hyperledger.fabric.sdk.Enrollment;
import org.hyperledger.fabric_ca.sdk.exception.EnrollmentException;
import org.hyperledger.fabric_ca.sdk.exception.GenerateCRLException;
import org.hyperledger.fabric_ca.sdk.exception.InvalidArgumentException;
import org.hyperledger.fabric_ca.sdk.exception.RevocationException;

import java.util.Date;

public interface SmCA {
    String registe(SmUser userName) throws Exception;

    Enrollment enroll(String userName, String secret) throws EnrollmentException, InvalidArgumentException;

    Enrollment reenroll(SmUser userName) throws EnrollmentException, InvalidArgumentException;

    String revoke(String userName, String reason) throws InvalidArgumentException, RevocationException;

    String getCRL(Date revokedBefore, Date revokedAfter, Date expireBefore, Date expireAfter) throws GenerateCRLException, InvalidArgumentException;
}