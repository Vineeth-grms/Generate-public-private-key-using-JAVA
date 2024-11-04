package com.example.controller;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class PublicAndPrivateKeyGeneration {
	public static void main(String[] args) {
		try {
			KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");// EC
			generator.initialize(1024);// 256

			KeyPair keyPair = generator.generateKeyPair();
			PublicKey publicKey = keyPair.getPublic();
			PrivateKey privateKey = keyPair.getPrivate();

			String publicString = Base64.getEncoder().encodeToString(publicKey.getEncoded());
			String privateString = Base64.getEncoder().encodeToString(privateKey.getEncoded());

			System.out.println("PUBLIC KEY IS : " + publicString);
			System.out.println("PRIVATE KEY IS : " + privateString);

		} catch (Exception e) {

		}
	}

}
