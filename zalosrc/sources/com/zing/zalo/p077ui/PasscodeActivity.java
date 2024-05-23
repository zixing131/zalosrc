package com.zing.zalo.p077ui;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ap0.C2279a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.zview.widget.InsetsLayout;
import me0.AbstractC23057e7;
import me0.C23055e5;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import vg.C28023b6;

/* loaded from: classes5.dex */
public class PasscodeActivity extends BaseZaloActivity {

    /* loaded from: classes5.dex */
    public static class TmpView extends BaseZaloView implements InterfaceC0733x {
        @Override // com.zing.zalo.zview.ZaloView
        /* renamed from: GJ */
        public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            int i11;
            int i12;
            try {
                Bundle m92642L3 = m92642L3();
                if (m92642L3 != null) {
                    ContactProfile contactProfile = (ContactProfile) m92642L3.getParcelable("contactProfile");
                    String string = m92642L3.getString("notiType");
                    boolean z11 = m92642L3.getBoolean("callType", false);
                    if (contactProfile != null && !AbstractC23057e7.m118300g(MainApplication.getAppContext()) && C23055e5.m118272g(true)) {
                        if (!z11) {
                            if (m92642L3.containsKey("sourceType")) {
                                i12 = m92642L3.getInt("sourceType", 0);
                            } else if (C28023b6.m141250h0().m141297K0(string)) {
                                AbstractC23647d.m123897g("1608602");
                                i12 = 11;
                            } else {
                                i12 = 9;
                            }
                            AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, false, i12));
                        } else {
                            if (m92642L3.containsKey("sourceType")) {
                                i11 = m92642L3.getInt("sourceType", 0);
                            } else if (C28023b6.m141250h0().m141297K0(string)) {
                                AbstractC23647d.m123897g("1608602");
                                i11 = 12;
                            } else {
                                i11 = 10;
                            }
                            AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, true, i11));
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return super.mo37483GJ(layoutInflater, viewGroup, bundle);
        }

        @Override // ac.InterfaceC0733x
        public String getTrackingKey() {
            return "TmpView";
        }

        @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
        public void onResume() {
            super.onResume();
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            requestWindowFeature(1);
            super.onCreate(bundle);
            InsetsLayout insetsLayout = new InsetsLayout(this);
            insetsLayout.setApplyWindowInsetsListener(this);
            insetsLayout.setId(AbstractC6918a0.zalo_view_container);
            setContentView(insetsLayout, new ViewGroup.LayoutParams(-1, -1));
            mo35573l4(TmpView.class, getIntent().getExtras(), 0, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        finish();
    }
}
