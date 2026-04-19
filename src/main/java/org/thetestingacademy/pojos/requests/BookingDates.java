package org.thetestingacademy.pojos.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookingDates {

    @SerializedName("checkin")
    @Expose
    private String checkin;

    @SerializedName("checkout")
    @Expose
    private String checkout;

    public void setCheckin(String checkin)
    {
        this.checkin = checkin;
    }

    public void setCheckout(String checkout)
    {
        this.checkout = checkout;
    }

    public String getCheckin()
    {
        return this.checkin;
    }

    public String getCheckout()
    {
        return this.checkout;
    }
}
