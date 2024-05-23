package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.Set;
import p229i5.AbstractC20286g;

/* loaded from: classes2.dex */
public final class jc0 extends qc0 {

    /* renamed from: u */
    static final Set f22753u = AbstractC20286g.m105922g("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: c */
    private String f22754c;

    /* renamed from: d */
    private boolean f22755d;

    /* renamed from: e */
    private int f22756e;

    /* renamed from: f */
    private int f22757f;

    /* renamed from: g */
    private int f22758g;

    /* renamed from: h */
    private int f22759h;

    /* renamed from: i */
    private int f22760i;

    /* renamed from: j */
    private int f22761j;

    /* renamed from: k */
    private final Object f22762k;

    /* renamed from: l */
    private final zq0 f22763l;

    /* renamed from: m */
    private final Activity f22764m;

    /* renamed from: n */
    private ps0 f22765n;

    /* renamed from: o */
    private ImageView f22766o;

    /* renamed from: p */
    private LinearLayout f22767p;

    /* renamed from: q */
    private final rc0 f22768q;

    /* renamed from: r */
    private PopupWindow f22769r;

    /* renamed from: s */
    private RelativeLayout f22770s;

    /* renamed from: t */
    private ViewGroup f22771t;

    public jc0(zq0 zq0Var, rc0 rc0Var) {
        super(zq0Var, "resize");
        this.f22754c = "top-right";
        this.f22755d = true;
        this.f22756e = 0;
        this.f22757f = 0;
        this.f22758g = -1;
        this.f22759h = 0;
        this.f22760i = 0;
        this.f22761j = -1;
        this.f22762k = new Object();
        this.f22763l = zq0Var;
        this.f22764m = zq0Var.zzk();
        this.f22768q = rc0Var;
    }

    /* renamed from: h */
    public final void m23596h(boolean z11) {
        synchronized (this.f22762k) {
            try {
                PopupWindow popupWindow = this.f22769r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    this.f22770s.removeView((View) this.f22763l);
                    ViewGroup viewGroup = this.f22771t;
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f22766o);
                        this.f22771t.addView((View) this.f22763l);
                        this.f22763l.mo26684O(this.f22765n);
                    }
                    if (z11) {
                        m25687g("default");
                        rc0 rc0Var = this.f22768q;
                        if (rc0Var != null) {
                            rc0Var.zzb();
                        }
                    }
                    this.f22769r = null;
                    this.f22770s = null;
                    this.f22771t = null;
                    this.f22767p = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:62:0x025b A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0015, B:12:0x001d, B:13:0x0022, B:15:0x0024, B:17:0x0030, B:18:0x0035, B:20:0x0037, B:22:0x003f, B:24:0x004d, B:25:0x005e, B:27:0x006c, B:28:0x007d, B:30:0x008b, B:31:0x009c, B:33:0x00aa, B:34:0x00bb, B:36:0x00c9, B:37:0x00d7, B:39:0x00e5, B:40:0x00e7, B:42:0x00eb, B:44:0x00ef, B:46:0x00f7, B:49:0x00ff, B:53:0x0125, B:59:0x0131, B:62:0x025b, B:63:0x0260, B:65:0x0262, B:67:0x0282, B:69:0x0286, B:71:0x0293, B:72:0x02cf, B:87:0x0388, B:88:0x03b7, B:90:0x03cf, B:91:0x03f0, B:93:0x03f8, B:94:0x03ff, B:95:0x0425, B:99:0x0428, B:101:0x044d, B:102:0x0462, B:104:0x038f, B:105:0x0396, B:106:0x039d, B:107:0x03a4, B:108:0x03aa, B:109:0x03b1, B:126:0x02cc, B:127:0x0464, B:128:0x0469, B:130:0x0139, B:132:0x013d, B:143:0x0190, B:144:0x019a, B:146:0x01ed, B:148:0x01f0, B:150:0x01f4, B:153:0x01fb, B:154:0x019e, B:155:0x01a8, B:156:0x01af, B:157:0x01bb, B:158:0x01c3, B:159:0x01d7, B:160:0x01e3, B:177:0x020c, B:180:0x0236, B:183:0x0246, B:184:0x023c, B:186:0x0244, B:187:0x022e, B:189:0x0234, B:190:0x024b, B:191:0x0252, B:192:0x046b, B:193:0x0470, B:195:0x0472, B:196:0x0477, B:198:0x0479, B:199:0x047e), top: B:3:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0262 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0015, B:12:0x001d, B:13:0x0022, B:15:0x0024, B:17:0x0030, B:18:0x0035, B:20:0x0037, B:22:0x003f, B:24:0x004d, B:25:0x005e, B:27:0x006c, B:28:0x007d, B:30:0x008b, B:31:0x009c, B:33:0x00aa, B:34:0x00bb, B:36:0x00c9, B:37:0x00d7, B:39:0x00e5, B:40:0x00e7, B:42:0x00eb, B:44:0x00ef, B:46:0x00f7, B:49:0x00ff, B:53:0x0125, B:59:0x0131, B:62:0x025b, B:63:0x0260, B:65:0x0262, B:67:0x0282, B:69:0x0286, B:71:0x0293, B:72:0x02cf, B:87:0x0388, B:88:0x03b7, B:90:0x03cf, B:91:0x03f0, B:93:0x03f8, B:94:0x03ff, B:95:0x0425, B:99:0x0428, B:101:0x044d, B:102:0x0462, B:104:0x038f, B:105:0x0396, B:106:0x039d, B:107:0x03a4, B:108:0x03aa, B:109:0x03b1, B:126:0x02cc, B:127:0x0464, B:128:0x0469, B:130:0x0139, B:132:0x013d, B:143:0x0190, B:144:0x019a, B:146:0x01ed, B:148:0x01f0, B:150:0x01f4, B:153:0x01fb, B:154:0x019e, B:155:0x01a8, B:156:0x01af, B:157:0x01bb, B:158:0x01c3, B:159:0x01d7, B:160:0x01e3, B:177:0x020c, B:180:0x0236, B:183:0x0246, B:184:0x023c, B:186:0x0244, B:187:0x022e, B:189:0x0234, B:190:0x024b, B:191:0x0252, B:192:0x046b, B:193:0x0470, B:195:0x0472, B:196:0x0477, B:198:0x0479, B:199:0x047e), top: B:3:0x0007, inners: #1 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m23597i(Map map) {
        int[] iArr;
        char c11;
        char c12;
        int i11;
        int i12;
        int i13;
        int i14;
        synchronized (this.f22762k) {
            try {
                if (this.f22764m == null) {
                    m25683c("Not an activity context. Cannot resize.");
                    return;
                }
                if (this.f22763l.mo22517p() == null) {
                    m25683c("Webview is not yet available, size is not set.");
                    return;
                }
                if (this.f22763l.mo22517p().m25539i()) {
                    m25683c("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (!this.f22763l.mo26680M()) {
                    if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                        zzt.zzp();
                        this.f22761j = zzs.zzK((String) map.get("width"));
                    }
                    if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                        zzt.zzp();
                        this.f22758g = zzs.zzK((String) map.get("height"));
                    }
                    if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                        zzt.zzp();
                        this.f22759h = zzs.zzK((String) map.get("offsetX"));
                    }
                    if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                        zzt.zzp();
                        this.f22760i = zzs.zzK((String) map.get("offsetY"));
                    }
                    if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                        this.f22755d = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                    }
                    String str = (String) map.get("customClosePosition");
                    if (!TextUtils.isEmpty(str)) {
                        this.f22754c = str;
                    }
                    if (this.f22761j >= 0 && this.f22758g >= 0) {
                        Window window = this.f22764m.getWindow();
                        if (window != null && window.getDecorView() != null) {
                            zzt.zzp();
                            int[] zzR = zzs.zzR(this.f22764m);
                            zzt.zzp();
                            int[] zzO = zzs.zzO(this.f22764m);
                            int i15 = zzR[0];
                            int i16 = zzR[1];
                            int i17 = this.f22761j;
                            if (i17 >= 50 && i17 <= i15) {
                                int i18 = this.f22758g;
                                if (i18 >= 50 && i18 <= i16) {
                                    if (i18 == i16 && i17 == i15) {
                                        yk0.zzj("Cannot resize to a full-screen ad.");
                                    } else {
                                        if (this.f22755d) {
                                            String str2 = this.f22754c;
                                            switch (str2.hashCode()) {
                                                case -1364013995:
                                                    if (str2.equals("center")) {
                                                        c12 = 2;
                                                        break;
                                                    }
                                                    c12 = 65535;
                                                    break;
                                                case -1012429441:
                                                    if (str2.equals("top-left")) {
                                                        c12 = 0;
                                                        break;
                                                    }
                                                    c12 = 65535;
                                                    break;
                                                case -655373719:
                                                    if (str2.equals("bottom-left")) {
                                                        c12 = 3;
                                                        break;
                                                    }
                                                    c12 = 65535;
                                                    break;
                                                case 1163912186:
                                                    if (str2.equals("bottom-right")) {
                                                        c12 = 5;
                                                        break;
                                                    }
                                                    c12 = 65535;
                                                    break;
                                                case 1288627767:
                                                    if (str2.equals("bottom-center")) {
                                                        c12 = 4;
                                                        break;
                                                    }
                                                    c12 = 65535;
                                                    break;
                                                case 1755462605:
                                                    if (str2.equals("top-center")) {
                                                        c12 = 1;
                                                        break;
                                                    }
                                                    c12 = 65535;
                                                    break;
                                                default:
                                                    c12 = 65535;
                                                    break;
                                            }
                                            if (c12 != 0) {
                                                if (c12 != 1) {
                                                    if (c12 != 2) {
                                                        if (c12 != 3) {
                                                            if (c12 != 4) {
                                                                if (c12 != 5) {
                                                                    i11 = ((this.f22756e + this.f22759h) + i17) - 50;
                                                                    i12 = this.f22757f;
                                                                } else {
                                                                    i11 = ((this.f22756e + this.f22759h) + i17) - 50;
                                                                    i14 = this.f22757f;
                                                                }
                                                            } else {
                                                                i11 = ((this.f22756e + this.f22759h) + (i17 >> 1)) - 25;
                                                                i14 = this.f22757f;
                                                            }
                                                        } else {
                                                            i11 = this.f22756e + this.f22759h;
                                                            i14 = this.f22757f;
                                                        }
                                                        i13 = ((i14 + this.f22760i) + i18) - 50;
                                                    } else {
                                                        i11 = ((this.f22756e + this.f22759h) + (i17 >> 1)) - 25;
                                                        i13 = ((this.f22757f + this.f22760i) + (i18 >> 1)) - 25;
                                                    }
                                                    if (i11 >= 0 && i11 + 50 <= i15 && i13 >= zzO[0] && i13 + 50 <= zzO[1]) {
                                                        iArr = new int[]{this.f22756e + this.f22759h, this.f22757f + this.f22760i};
                                                    }
                                                } else {
                                                    i11 = ((this.f22756e + this.f22759h) + (i17 >> 1)) - 25;
                                                    i12 = this.f22757f;
                                                }
                                            } else {
                                                i11 = this.f22756e + this.f22759h;
                                                i12 = this.f22757f;
                                            }
                                            i13 = i12 + this.f22760i;
                                            if (i11 >= 0) {
                                                iArr = new int[]{this.f22756e + this.f22759h, this.f22757f + this.f22760i};
                                            }
                                        } else {
                                            zzt.zzp();
                                            int[] zzR2 = zzs.zzR(this.f22764m);
                                            zzt.zzp();
                                            int[] zzO2 = zzs.zzO(this.f22764m);
                                            int i19 = zzR2[0];
                                            int i21 = this.f22756e + this.f22759h;
                                            int i22 = this.f22757f + this.f22760i;
                                            if (i21 < 0) {
                                                i21 = 0;
                                            } else {
                                                int i23 = this.f22761j;
                                                if (i21 + i23 > i19) {
                                                    i21 = i19 - i23;
                                                }
                                            }
                                            int i24 = zzO2[0];
                                            if (i22 < i24) {
                                                i22 = i24;
                                            } else {
                                                int i25 = this.f22758g;
                                                int i26 = i22 + i25;
                                                int i27 = zzO2[1];
                                                if (i26 > i27) {
                                                    i22 = i27 - i25;
                                                }
                                            }
                                            iArr = new int[]{i21, i22};
                                        }
                                        if (iArr != null) {
                                            m25683c("Resize location out of screen or close button is not visible.");
                                            return;
                                        }
                                        zzaw.zzb();
                                        int m26115y = rk0.m26115y(this.f22764m, this.f22761j);
                                        zzaw.zzb();
                                        int m26115y2 = rk0.m26115y(this.f22764m, this.f22758g);
                                        ViewParent parent = ((View) this.f22763l).getParent();
                                        if (parent != null && (parent instanceof ViewGroup)) {
                                            ViewGroup viewGroup = (ViewGroup) parent;
                                            viewGroup.removeView((View) this.f22763l);
                                            PopupWindow popupWindow = this.f22769r;
                                            if (popupWindow == null) {
                                                this.f22771t = viewGroup;
                                                zzt.zzp();
                                                Object obj = this.f22763l;
                                                ((View) obj).setDrawingCacheEnabled(true);
                                                Bitmap createBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                                                ((View) obj).setDrawingCacheEnabled(false);
                                                ImageView imageView = new ImageView(this.f22764m);
                                                this.f22766o = imageView;
                                                imageView.setImageBitmap(createBitmap);
                                                this.f22765n = this.f22763l.mo22517p();
                                                this.f22771t.addView(this.f22766o);
                                            } else {
                                                popupWindow.dismiss();
                                            }
                                            RelativeLayout relativeLayout = new RelativeLayout(this.f22764m);
                                            this.f22770s = relativeLayout;
                                            relativeLayout.setBackgroundColor(0);
                                            this.f22770s.setLayoutParams(new ViewGroup.LayoutParams(m26115y, m26115y2));
                                            zzt.zzp();
                                            PopupWindow popupWindow2 = new PopupWindow((View) this.f22770s, m26115y, m26115y2, false);
                                            this.f22769r = popupWindow2;
                                            popupWindow2.setOutsideTouchable(false);
                                            this.f22769r.setTouchable(true);
                                            this.f22769r.setClippingEnabled(!this.f22755d);
                                            this.f22770s.addView((View) this.f22763l, -1, -1);
                                            this.f22767p = new LinearLayout(this.f22764m);
                                            zzaw.zzb();
                                            int m26115y3 = rk0.m26115y(this.f22764m, 50);
                                            zzaw.zzb();
                                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m26115y3, rk0.m26115y(this.f22764m, 50));
                                            String str3 = this.f22754c;
                                            switch (str3.hashCode()) {
                                                case -1364013995:
                                                    if (str3.equals("center")) {
                                                        c11 = 2;
                                                        break;
                                                    }
                                                    c11 = 65535;
                                                    break;
                                                case -1012429441:
                                                    if (str3.equals("top-left")) {
                                                        c11 = 0;
                                                        break;
                                                    }
                                                    c11 = 65535;
                                                    break;
                                                case -655373719:
                                                    if (str3.equals("bottom-left")) {
                                                        c11 = 3;
                                                        break;
                                                    }
                                                    c11 = 65535;
                                                    break;
                                                case 1163912186:
                                                    if (str3.equals("bottom-right")) {
                                                        c11 = 5;
                                                        break;
                                                    }
                                                    c11 = 65535;
                                                    break;
                                                case 1288627767:
                                                    if (str3.equals("bottom-center")) {
                                                        c11 = 4;
                                                        break;
                                                    }
                                                    c11 = 65535;
                                                    break;
                                                case 1755462605:
                                                    if (str3.equals("top-center")) {
                                                        c11 = 1;
                                                        break;
                                                    }
                                                    c11 = 65535;
                                                    break;
                                                default:
                                                    c11 = 65535;
                                                    break;
                                            }
                                            if (c11 != 0) {
                                                if (c11 != 1) {
                                                    if (c11 != 2) {
                                                        if (c11 != 3) {
                                                            if (c11 != 4) {
                                                                if (c11 != 5) {
                                                                    layoutParams.addRule(10);
                                                                    layoutParams.addRule(11);
                                                                } else {
                                                                    layoutParams.addRule(12);
                                                                    layoutParams.addRule(11);
                                                                }
                                                            } else {
                                                                layoutParams.addRule(12);
                                                                layoutParams.addRule(14);
                                                            }
                                                        } else {
                                                            layoutParams.addRule(12);
                                                            layoutParams.addRule(9);
                                                        }
                                                    } else {
                                                        layoutParams.addRule(13);
                                                    }
                                                } else {
                                                    layoutParams.addRule(10);
                                                    layoutParams.addRule(14);
                                                }
                                            } else {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(9);
                                            }
                                            this.f22767p.setOnClickListener(new ic0(this));
                                            this.f22767p.setContentDescription("Close button");
                                            this.f22770s.addView(this.f22767p, layoutParams);
                                            try {
                                                PopupWindow popupWindow3 = this.f22769r;
                                                View decorView = window.getDecorView();
                                                zzaw.zzb();
                                                int m26115y4 = rk0.m26115y(this.f22764m, iArr[0]);
                                                zzaw.zzb();
                                                popupWindow3.showAtLocation(decorView, 0, m26115y4, rk0.m26115y(this.f22764m, iArr[1]));
                                                int i28 = iArr[0];
                                                int i29 = iArr[1];
                                                rc0 rc0Var = this.f22768q;
                                                if (rc0Var != null) {
                                                    rc0Var.mo22994a(i28, i29, this.f22761j, this.f22758g);
                                                }
                                                this.f22763l.mo26684O(ps0.m25532b(m26115y, m26115y2));
                                                int i31 = iArr[0];
                                                int i32 = iArr[1];
                                                zzt.zzp();
                                                m25686f(i31, i32 - zzs.zzO(this.f22764m)[0], this.f22761j, this.f22758g);
                                                m25687g("resized");
                                                return;
                                            } catch (RuntimeException e11) {
                                                m25683c("Cannot show popup window: " + e11.getMessage());
                                                this.f22770s.removeView((View) this.f22763l);
                                                ViewGroup viewGroup2 = this.f22771t;
                                                if (viewGroup2 != null) {
                                                    viewGroup2.removeView(this.f22766o);
                                                    this.f22771t.addView((View) this.f22763l);
                                                    this.f22763l.mo26684O(this.f22765n);
                                                }
                                                return;
                                            }
                                        }
                                        m25683c("Webview is detached, probably in the middle of a resize or expand.");
                                        return;
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                }
                                yk0.zzj("Height is too small or too large.");
                                iArr = null;
                                if (iArr != null) {
                                }
                            }
                            yk0.zzj("Width is too small or too large.");
                            iArr = null;
                            if (iArr != null) {
                            }
                        }
                        m25683c("Activity context is not ready, cannot get window or decor view.");
                        return;
                    }
                    m25683c("Invalid width and height options. Cannot resize.");
                    return;
                }
                m25683c("Cannot resize an expanded banner.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public final void m23598j(int i11, int i12, boolean z11) {
        synchronized (this.f22762k) {
            this.f22756e = i11;
            this.f22757f = i12;
        }
    }

    /* renamed from: k */
    public final void m23599k(int i11, int i12) {
        this.f22756e = i11;
        this.f22757f = i12;
    }

    /* renamed from: l */
    public final boolean m23600l() {
        boolean z11;
        synchronized (this.f22762k) {
            if (this.f22769r != null) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }
}
