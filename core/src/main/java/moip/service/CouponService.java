package moip.service;

import moip.domain.Coupon;
import moip.exception.NotFoundException;
import moip.repository.CouponRepository;

/**
 * Created by eric-nasc on 26/03/17.
 */
public class CouponService {

    private CouponRepository couponRepository;

    public CouponService(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }

    public Coupon findByKey(String key) {
        return couponRepository.findByKey(key).orElseThrow(() -> new NotFoundException("coupon not found"));
    }
}
