package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.utils.ToastUtils;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.Serializable;
import java.net.URLEncoder;
import mm0.AbstractC23350e;
import p402os.C24546a;

/* loaded from: classes6.dex */
public class GameStarterView extends BaseZaloView implements InterfaceC0733x {

    /* renamed from: M0 */
    private final InterfaceC0765j f73493M0 = new C0766k();

    /* renamed from: N0 */
    private final InterfaceC20094a f73494N0 = new C14298a();

    /* renamed from: com.zing.zalo.ui.zviews.GameStarterView$a */
    /* loaded from: classes6.dex */
    class C14298a implements InterfaceC20094a {
        C14298a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC23350e.m122774d("GameStarterView", "" + c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(obj);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String m127878i;
        super.mo37111CJ(bundle);
        try {
            this.f73493M0.mo1704o8(this.f73494N0);
            if (bundle == null && m92642L3() != null) {
                Serializable serializable = m92642L3().getSerializable("com.zing.zalo.game.EXTRA_GAME_OBJECT");
                if (serializable instanceof C24546a) {
                    C24546a c24546a = (C24546a) serializable;
                    if (c24546a.m127880k() != C24546a.b.INTERNAL) {
                        if (c24546a.m127880k() == C24546a.b.WEB_GAME) {
                            if (TextUtils.isEmpty(c24546a.m127878i())) {
                                ToastUtils.m89266n(AbstractC8020f0.game_detail_activity_unsupport_text, new Object[0]);
                            } else {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.addFlags(268435456);
                                intent.setData(Uri.parse(c24546a.m127878i()));
                                if (c24546a.m127871b() != 0) {
                                    this.f73493M0.mo1558V8(c24546a.m127871b(), 2, c24546a.m127879j());
                                }
                                m92641HK(intent);
                            }
                        } else if (TextUtils.isEmpty(c24546a.m127876g())) {
                            ToastUtils.m89266n(AbstractC8020f0.game_detail_activity_unsupport_text, new Object[0]);
                        } else {
                            PackageManager packageManager = m92648SI().getPackageManager();
                            if (packageManager != null) {
                                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(c24546a.m127876g());
                                if (launchIntentForPackage != null) {
                                    launchIntentForPackage.addFlags(268435456);
                                    if (c24546a.m127871b() != 0) {
                                        this.f73493M0.mo1558V8(c24546a.m127871b(), 2, c24546a.m127879j());
                                    }
                                    if (!TextUtils.isEmpty(c24546a.m127872c())) {
                                        launchIntentForPackage.putExtra("referrer", URLEncoder.encode(c24546a.m127872c(), "UTF-8"));
                                    }
                                    m92641HK(launchIntentForPackage);
                                } else {
                                    Intent intent2 = new Intent("android.intent.action.VIEW");
                                    intent2.addFlags(268435456);
                                    if (TextUtils.isEmpty(c24546a.m127878i())) {
                                        m127878i = "market://details?id=" + c24546a.m127876g();
                                    } else {
                                        m127878i = c24546a.m127878i();
                                    }
                                    intent2.setData(Uri.parse(m127878i));
                                    if (c24546a.m127871b() != 0) {
                                        this.f73493M0.mo1558V8(c24546a.m127871b(), 1, c24546a.m127879j());
                                    }
                                    if (!TextUtils.isEmpty(c24546a.m127872c())) {
                                        intent2.putExtra("referrer", URLEncoder.encode(c24546a.m127872c(), "UTF-8"));
                                    }
                                    m92641HK(intent2);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("GameStarterView", e11);
            ToastUtils.m89266n(AbstractC8020f0.error_unknown, new Object[0]);
        }
        finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new View(m92648SI());
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GameStarterView";
    }
}
