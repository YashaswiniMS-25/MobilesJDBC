package com.wolken.wolkenapp.SERVICE;

import com.wolken.wolkenapp.Exception.MobilesException;
import com.wolken.wolkenapp.DTO.MobilesDTO;

public interface MobileService {

	public void validateAndSave(MobilesDTO mobilesdto) throws MobilesException;

	public void validateAndUpdate(MobilesDTO mobilesdto);

	public void validateAndDelete();

	public void get();

}
