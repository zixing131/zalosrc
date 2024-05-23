package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class NotChangePhoneNumberView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    JSONArray f75646P0;

    /* renamed from: gM */
    private void m82350gM(View view) {
        int i11;
        try {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.content_valid);
            if (this.f75646P0 != null) {
                for (int i12 = 0; i12 < this.f75646P0.length(); i12++) {
                    JSONObject optJSONObject = this.f75646P0.optJSONObject(i12);
                    if (optJSONObject != null) {
                        boolean z11 = true;
                        if (optJSONObject.optInt("valid", 0) != 1) {
                            z11 = false;
                        }
                        String optString = optJSONObject.optString("valid_text", "");
                        if (!TextUtils.isEmpty(optString)) {
                            View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.item_vaild_change_phone, (ViewGroup) linearLayout, false);
                            RecyclingImageView recyclingImageView = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.img_valid);
                            TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tv_valid);
                            if (z11) {
                                i11 = AbstractC16803z.ic_changesim_del;
                            } else {
                                i11 = AbstractC16803z.ic_changesim_checked;
                            }
                            recyclingImageView.setImageResource(i11);
                            textView.setText(optString);
                            linearLayout.addView(inflate);
                        }
                    }
                }
            }
            view.findViewById(AbstractC6918a0.btnSkip).setOnClickListener(this);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            if (m92642L3() != null) {
                String string = m92642L3().getString("EXTRA_VALID_ERROR");
                if (!TextUtils.isEmpty(string)) {
                    this.f75646P0 = new JSONArray(string);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.not_change_phone_number_view, viewGroup, false);
        m82350gM(inflate);
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_title));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "NotChangePhoneNumberView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btnSkip) {
            finish();
        }
    }
}
