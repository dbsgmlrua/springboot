package com.fastcampus.java.controller.api;

import com.fastcampus.java.controller.CrudController;
import com.fastcampus.java.model.entity.Partner;
import com.fastcampus.java.model.network.request.PartneApiRequest;
import com.fastcampus.java.model.network.response.PartneApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/partner")
public class PartnerApiController extends CrudController<PartneApiRequest, PartneApiResponse, Partner> {
}
