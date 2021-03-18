package address.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import address.dto.AddressDto;
import address.mapper.AddressMapper;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressMapper addressMapper;

	@Override
	public List<AddressDto> selectAddressList() throws Exception {
		return addressMapper.selectAddressList();
	}

	@Override
	public AddressDto selectAddressDetail(int num) throws Exception {
		
		AddressDto address = addressMapper.selectAddressDetail(num);
		return address;
	}
	
	@Override
	public void insertAddress(AddressDto address, MultipartHttpServletRequest uploadFiles) throws Exception {
		addressMapper.insertAddress(address);
	}
	
}
