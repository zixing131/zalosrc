package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7103j1;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import java.util.ArrayList;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p716zh.C32018m5;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class IntroAndSuggestGroupContentView extends BaseZaloView implements ZaloView.InterfaceC17421f, View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    View f74410M0;

    /* renamed from: N0 */
    RecyclerView f74411N0;

    /* renamed from: O0 */
    C7103j1 f74412O0;

    /* renamed from: P0 */
    C23528a f74413P0;

    /* renamed from: Q0 */
    View f74414Q0;

    /* renamed from: R0 */
    ArrayList f74415R0 = new ArrayList();

    /* renamed from: S0 */
    String f74416S0;

    /* renamed from: T0 */
    String f74417T0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eM */
    public /* synthetic */ void m80895eM(RecyclerView recyclerView, int i11, View view) {
        try {
            C32018m5 c32018m5 = (C32018m5) this.f74415R0.get(i11);
            if (c32018m5.f147387a == 0) {
                int i12 = c32018m5.f147397k;
                C17487o0 c17487o0 = null;
                if (i12 == 0) {
                    AbstractC23647d.m123897g("1001636");
                    if (m92676n2() != null) {
                        c17487o0 = m92676n2().mo35579p();
                    }
                    if (c17487o0 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("EXTRA_POST_CONTENT", c32018m5.f147392f);
                        bundle.putString("EXTRA_EMOJI", c32018m5.f147390d);
                        bundle.putString("EXTRA_SUGGEST_ID", this.f74416S0);
                        bundle.putString("extra_preload_data", this.f74417T0);
                        bundle.putBoolean("extra_pin_post", true);
                        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", 7);
                        if (!c32018m5.f147396j && c32018m5.f147393g <= -1) {
                            bundle.putString("EXTRA_LINK", c32018m5.f147394h);
                            c17487o0.m93069k2(GroupPostComposeViewV2.class, bundle, 1, true);
                            return;
                        }
                        bundle.putLong("EXTRA_START_TIME", c32018m5.f147393g);
                        bundle.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 2);
                        c17487o0.m93069k2(GroupReminderComposeView.class, bundle, 1, true);
                        return;
                    }
                    return;
                }
                if (i12 == 1) {
                    AbstractC23647d.m123897g("10010021");
                    if (m92676n2() != null) {
                        c17487o0 = m92676n2().mo35579p();
                    }
                    if (c17487o0 != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("EXTRA_QUESTION", c32018m5.f147392f);
                        bundle2.putStringArrayList("EXTRA_ANSWER", c32018m5.f147391e);
                        bundle2.putString("EXTRA_SUGGEST_ID", this.f74416S0);
                        bundle2.putString("extra_preload_data", this.f74417T0);
                        c17487o0.m93069k2(GroupPollCreatingView.class, bundle2, 1, true);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        JSONArray optJSONArray;
        try {
            super.mo37111CJ(bundle);
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                String string = m92642L3.getString("extra_icon");
                String string2 = m92642L3.getString("extra_title");
                this.f74417T0 = m92642L3.getString("extra_preload_data");
                this.f74416S0 = m92642L3.getString("EXTRA_SUGGEST_ID", "");
                JSONObject jSONObject = new JSONObject(this.f74417T0);
                if (jSONObject.has("contentFirst")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("contentFirst");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("data");
                    this.f74415R0 = new ArrayList();
                    String optString = optJSONObject.optString("intro");
                    C32018m5 c32018m5 = new C32018m5(1);
                    c32018m5.f147389c = string;
                    c32018m5.f147388b = string2;
                    c32018m5.f147392f = optString;
                    this.f74415R0.add(c32018m5);
                    int optInt = optJSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    if (optInt == 1) {
                        AbstractC23647d.m123897g("10010020");
                    } else if (optInt == 0) {
                        AbstractC23647d.m123897g("1001635");
                    }
                    if (optJSONObject2 != null && (optJSONArray = optJSONObject2.optJSONArray("suggest")) != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            this.f74415R0.add(new C32018m5(optInt, (JSONObject) optJSONArray.get(i11)));
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f74413P0 = new C23528a(getContext());
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_intro_suggest_group_content, viewGroup, false);
        this.f74410M0 = inflate;
        View findViewById = inflate.findViewById(AbstractC6918a0.btn_close);
        this.f74414Q0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f74411N0 = (RecyclerView) this.f74410M0.findViewById(AbstractC6918a0.recycler_view);
        C7103j1 c7103j1 = new C7103j1(this.f74413P0);
        this.f74412O0 = c7103j1;
        this.f74411N0.setAdapter(c7103j1);
        this.f74411N0.setHasFixedSize(true);
        this.f74411N0.setLayoutManager(new LinearLayoutManager(m92648SI()));
        this.f74412O0.m36194N(this.f74415R0);
        C31784b.m152808a(this.f74411N0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.hr
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                IntroAndSuggestGroupContentView.this.m80895eM(recyclerView, i11, view);
            }
        });
        return this.f74410M0;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "IntroAndSuggestGroupContentView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_close) {
            finish();
        }
    }
}
