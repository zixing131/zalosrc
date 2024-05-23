package com.adtima.ads.partner.helper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsBannerSize;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.List;
import p009a3.C0098c;
import p090d3.C17718a;
import p148f3.C18709a;
import p178g3.AbstractC19213h;
import p178g3.AbstractC19214i;
import p227i3.C20213q;
import p227i3.C20219w;
import p313l3.AbstractC22010c;

/* loaded from: classes2.dex */
public final class ZAdsGoogleNativeWrapper {
    private static final String TAG = "ZAdsGoogleNativeWrapper";

    /* loaded from: classes2.dex */
    public static class Transporter {
        public ZAdsBannerSize adSize = null;
        public Object adNative = null;
    }

    public static boolean checkNativeAd(Object obj) {
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            if (nativeAd.getImages() != null && nativeAd.getImages().size() != 0 && nativeAd.getHeadline() != null && nativeAd.getHeadline().length() != 0 && nativeAd.getBody() != null && nativeAd.getBody().length() != 0 && nativeAd.getCallToAction() != null) {
                if (nativeAd.getCallToAction().length() != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void destroy(Object obj) {
        try {
            if (obj instanceof Transporter) {
                ((Transporter) obj).adNative = null;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "destroy", e11);
        }
    }

    public static C0098c getNativeEntity(Context context, Object obj) {
        String str;
        List<NativeAd.Image> list;
        String str2;
        String str3;
        try {
            if (!(obj instanceof Transporter)) {
                return null;
            }
            Transporter transporter = (Transporter) obj;
            C0098c c0098c = new C0098c();
            Object obj2 = transporter.adNative;
            if (obj2 instanceof NativeAd) {
                NativeAd nativeAd = (NativeAd) obj2;
                list = nativeAd.getImages();
                str2 = AbstractC19213h.m100831b(transporter.adSize, nativeAd.getCallToAction());
                str3 = AbstractC19213h.m100834e(transporter.adSize, nativeAd.getHeadline());
                str = AbstractC19213h.m100833d(transporter.adSize, nativeAd.getBody());
            } else {
                str = null;
                list = null;
                str2 = null;
                str3 = null;
            }
            String[] strArr = new String[4];
            for (int i11 = 0; i11 < 4; i11++) {
                if (i11 < list.size()) {
                    try {
                        strArr[i11] = list.get(i11).getUri().toString();
                    } catch (Exception unused) {
                    }
                }
                if (strArr[i11] == null) {
                    strArr[i11] = "";
                }
            }
            c0098c.f499c = str3;
            c0098c.f503e = str2;
            c0098c.f531s = str;
            c0098c.f533t = str;
            c0098c.f529r = str3;
            c0098c.f535u = str;
            c0098c.f501d = str;
            c0098c.f537v = "admob";
            String str4 = strArr[0];
            c0098c.f519m = str4;
            c0098c.f517l = str4;
            c0098c.f527q = str;
            c0098c.f492X = null;
            c0098c.f491W = null;
            return c0098c;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "register", e11);
            return null;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static View register(Context context, Object obj, int i11) {
        String str;
        List<NativeAd.Image> list;
        String str2;
        String str3;
        String str4;
        try {
            if (!(obj instanceof Transporter)) {
                return null;
            }
            Transporter transporter = (Transporter) obj;
            RelativeLayout relativeLayout = new RelativeLayout(context);
            int i12 = AbstractC22010c.f108378a;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i12, i12);
            relativeLayout.setLayoutParams(layoutParams);
            C0098c c0098c = new C0098c();
            Object obj2 = transporter.adNative;
            if (obj2 instanceof NativeAd) {
                NativeAd nativeAd = (NativeAd) obj2;
                list = nativeAd.getImages();
                str2 = AbstractC19213h.m100831b(transporter.adSize, AbstractC19213h.m100832c(nativeAd.getCallToAction()));
                str3 = AbstractC19213h.m100834e(transporter.adSize, AbstractC19213h.m100832c(nativeAd.getHeadline()));
                str = AbstractC19213h.m100833d(transporter.adSize, AbstractC19213h.m100832c(nativeAd.getBody()));
            } else {
                str = null;
                list = null;
                str2 = null;
                str3 = null;
            }
            String[] strArr = new String[4];
            int i13 = 0;
            while (true) {
                str4 = "";
                if (i13 >= 4) {
                    break;
                }
                if (i13 < list.size()) {
                    try {
                        strArr[i13] = list.get(i13).getUri().toString();
                    } catch (Exception unused) {
                    }
                }
                if (strArr[i13] == null) {
                    strArr[i13] = "";
                }
                i13++;
            }
            c0098c.f499c = str3;
            c0098c.f503e = str2;
            c0098c.f531s = str;
            c0098c.f533t = str;
            c0098c.f529r = str3;
            c0098c.f535u = str;
            c0098c.f501d = str;
            c0098c.f537v = "admob";
            String str5 = strArr[0];
            c0098c.f519m = str5;
            c0098c.f517l = str5;
            c0098c.f527q = str;
            c0098c.f492X = null;
            c0098c.f491W = null;
            C17718a m105482a = C20213q.m105480e().m105482a(c0098c, C20219w.m105646d().m105649b(ZAdsBannerSize.toString(transporter.adSize), c0098c.f537v), transporter.adSize, false);
            C20213q m105480e = C20213q.m105480e();
            String str6 = strArr[1];
            if (str6 == null) {
                str6 = "";
            }
            String str7 = strArr[2];
            if (str7 == null) {
                str7 = "";
            }
            String str8 = strArr[3];
            if (str8 != null) {
                str4 = str8;
            }
            C17718a m105483b = m105480e.m105483b(m105482a, str6, str7, str4);
            WebView webView = new WebView(context);
            webView.setLayoutParams(layoutParams);
            AbstractC19214i.m100838d(webView, 0);
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.partner.helper.ZAdsGoogleNativeWrapper.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            relativeLayout2.setLayoutParams(layoutParams);
            C18709a c18709a = m105483b.f89803b;
            webView.loadDataWithBaseURL(null, i11 == 2 ? c18709a.f94007d : c18709a.f94006c, "text/html", "UTF-8", null);
            relativeLayout2.addView(webView, layoutParams);
            RelativeLayout relativeLayout3 = new RelativeLayout(context);
            relativeLayout3.setLayoutParams(layoutParams);
            relativeLayout3.setClickable(true);
            relativeLayout2.addView(relativeLayout3, layoutParams);
            if (transporter.adNative instanceof NativeAd) {
                NativeAdView nativeAdView = new NativeAdView(context);
                nativeAdView.setLayoutParams(layoutParams);
                nativeAdView.addView(relativeLayout2);
                nativeAdView.setNativeAd((NativeAd) transporter.adNative);
                nativeAdView.setCallToActionView(relativeLayout3);
                nativeAdView.setBodyView(relativeLayout2);
                nativeAdView.setHeadlineView(relativeLayout2);
                relativeLayout.addView(nativeAdView);
            }
            return relativeLayout;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "register", e11);
            return null;
        }
    }
}
