package address.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import address.dto.AddressDto;

public interface AddressService {
	List<AddressDto> selectAddressList() throws Exception;
	AddressDto selectAddressDetail(int num) throws Exception;
	public void insertAddress(AddressDto board, MultipartHttpServletRequest files) throws Exception;
}
