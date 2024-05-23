package me0;

import ag0.AbstractC0826k;
import ag0.C0824j;
import ag0.C0843s0;
import ai.InterfaceC0861a;
import am.AbstractC0906d0;
import am.AbstractC0939u;
import am.C0943w;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.AbstractC1388a;
import androidx.core.util.C1483e;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import ga0.C19322f1;
import ga0.InterfaceC19305a;
import gw.C19669z;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p142ey.C18631a;
import p142ey.C18635e;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p461qu.AbstractC25495a;
import p612wk.AbstractC29069a;
import p716zh.C31901e8;
import p716zh.C31973j5;
import p716zh.C32076q5;
import p716zh.C32093r8;
import p716zh.C32178x9;
import vg.C28203u6;

/* renamed from: me0.x6 */
/* loaded from: classes4.dex */
public abstract class AbstractC23262x6 {

    /* renamed from: me0.x6$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f112753a;

        /* renamed from: b */
        final /* synthetic */ AbstractC29069a.a f112754b;

        a(String str, AbstractC29069a.a aVar) {
            this.f112753a = str;
            this.f112754b = aVar;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m132088m = AbstractC25495a.m132088m(this.f112753a);
            if (!TextUtils.isEmpty(m132088m)) {
                C31973j5 m4472f = C0943w.m4462l().m4472f(m132088m);
                if (m4472f != null && !TextUtils.isEmpty(m4472f.m153793y())) {
                    String str = this.f112753a;
                    String m153793y = m4472f.m153793y();
                    this.f112754b.m145162z(m4472f.m153793y());
                    C7959d.m41638d1().m41787g3(str, m153793y);
                    return;
                }
                C0843s0.m2286r().m2294e(new AbstractC0826k.a(this.f112753a, 0));
            }
        }
    }

    /* renamed from: me0.x6$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f112755a;

        /* renamed from: b */
        final /* synthetic */ AbstractC29069a.a f112756b;

        b(String str, AbstractC29069a.a aVar) {
            this.f112755a = str;
            this.f112756b = aVar;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String str;
            ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f112755a);
            if (m141809c != null && !TextUtils.isEmpty(m141809c.f42437s) && !TextUtils.isEmpty(m141809c.f42446v)) {
                if (!AbstractC25495a.m132084i(this.f112755a) && !AbstractC25495a.m132081f(this.f112755a) && !AbstractC25495a.m132078c(this.f112755a) && !AbstractC25495a.m132080e(this.f112755a)) {
                    str = m141809c.m40383Q(true, false).trim();
                } else {
                    str = m141809c.f42437s;
                }
                String str2 = m141809c.f42446v;
                this.f112756b.m145162z(str);
                this.f112756b.m145154r(str2);
                C7959d.m41638d1().m41766Y2(this.f112755a, str2, str);
                return;
            }
            C0843s0.m2286r().m2294e(new AbstractC0826k.b(this.f112755a, new TrackingSource((short) 1001)));
        }
    }

    /* renamed from: A */
    public static /* synthetic */ int m119966A(String str, String str2) {
        if (str.length() > str2.length()) {
            return -1;
        }
        if (str.length() < str2.length()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: B */
    public static String[] m119967B(String str) {
        return C23024b7.m118035G(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:263)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0021. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0024. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0027. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x002a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String[] m119968C(java.lang.String r6) {
        /*
            char[] r6 = r6.toCharArray()
            int r0 = r6.length
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 0
        L9:
            int r3 = r6.length
            if (r2 >= r3) goto L86
            char r3 = r6[r2]
            r4 = 204(0xcc, float:2.86E-43)
            if (r3 == r4) goto L7f
            r4 = 205(0xcd, float:2.87E-43)
            if (r3 == r4) goto L7f
            r4 = 217(0xd9, float:3.04E-43)
            if (r3 == r4) goto L7a
            r4 = 218(0xda, float:3.05E-43)
            if (r3 == r4) goto L7a
            switch(r3) {
                case 33: goto L75;
                case 34: goto L75;
                case 35: goto L75;
                case 36: goto L75;
                case 37: goto L75;
                case 38: goto L75;
                case 39: goto L75;
                case 40: goto L75;
                case 41: goto L75;
                case 42: goto L75;
                case 43: goto L75;
                case 44: goto L75;
                case 45: goto L75;
                case 46: goto L75;
                case 47: goto L75;
                case 137: goto L70;
                case 208: goto L70;
                case 221: goto L6b;
                case 232: goto L66;
                case 233: goto L66;
                case 234: goto L66;
                case 236: goto L61;
                case 237: goto L61;
                case 242: goto L5c;
                case 243: goto L5c;
                case 244: goto L5c;
                case 245: goto L5c;
                case 249: goto L57;
                case 250: goto L57;
                case 253: goto L52;
                case 258: goto L4d;
                case 259: goto L48;
                case 272: goto L70;
                case 273: goto L43;
                case 296: goto L7f;
                case 297: goto L61;
                case 360: goto L7a;
                case 361: goto L57;
                case 416: goto L3e;
                case 417: goto L5c;
                case 431: goto L7a;
                case 432: goto L57;
                case 461: goto L4d;
                case 462: goto L48;
                case 514: goto L4d;
                case 515: goto L48;
                case 518: goto L39;
                case 519: goto L66;
                case 526: goto L3e;
                case 527: goto L5c;
                case 7840: goto L4d;
                case 7841: goto L48;
                case 7842: goto L4d;
                case 7843: goto L48;
                case 7844: goto L4d;
                case 7845: goto L48;
                case 7846: goto L4d;
                case 7847: goto L48;
                case 7848: goto L4d;
                case 7849: goto L48;
                case 7850: goto L4d;
                case 7851: goto L48;
                case 7852: goto L4d;
                case 7853: goto L48;
                case 7854: goto L4d;
                case 7855: goto L48;
                case 7856: goto L4d;
                case 7857: goto L48;
                case 7858: goto L4d;
                case 7859: goto L48;
                case 7860: goto L4d;
                case 7861: goto L48;
                case 7862: goto L4d;
                case 7863: goto L48;
                case 7864: goto L39;
                case 7865: goto L66;
                case 7866: goto L39;
                case 7867: goto L66;
                case 7868: goto L39;
                case 7869: goto L66;
                case 7870: goto L39;
                case 7871: goto L66;
                case 7872: goto L39;
                case 7873: goto L66;
                case 7874: goto L39;
                case 7875: goto L66;
                case 7876: goto L39;
                case 7877: goto L66;
                case 7878: goto L39;
                case 7879: goto L66;
                case 7880: goto L7f;
                case 7881: goto L61;
                case 7882: goto L7f;
                case 7883: goto L61;
                case 7884: goto L3e;
                case 7885: goto L5c;
                case 7886: goto L3e;
                case 7887: goto L5c;
                case 7888: goto L3e;
                case 7889: goto L5c;
                case 7890: goto L3e;
                case 7891: goto L5c;
                case 7892: goto L3e;
                case 7893: goto L5c;
                case 7894: goto L3e;
                case 7895: goto L5c;
                case 7896: goto L3e;
                case 7897: goto L5c;
                case 7898: goto L3e;
                case 7899: goto L5c;
                case 7900: goto L3e;
                case 7901: goto L5c;
                case 7902: goto L3e;
                case 7903: goto L5c;
                case 7904: goto L3e;
                case 7905: goto L5c;
                case 7906: goto L3e;
                case 7907: goto L5c;
                case 7908: goto L7a;
                case 7909: goto L57;
                case 7910: goto L7a;
                case 7911: goto L57;
                case 7912: goto L7a;
                case 7913: goto L57;
                case 7914: goto L7a;
                case 7915: goto L57;
                case 7916: goto L7a;
                case 7917: goto L57;
                case 7918: goto L7a;
                case 7919: goto L57;
                case 7920: goto L7a;
                case 7921: goto L57;
                case 7922: goto L6b;
                case 7923: goto L52;
                case 7924: goto L6b;
                case 7925: goto L52;
                case 7926: goto L6b;
                case 7927: goto L52;
                case 7928: goto L6b;
                case 7929: goto L52;
                default: goto L21;
            }
        L21:
            switch(r3) {
                case 58: goto L75;
                case 59: goto L75;
                case 60: goto L75;
                case 61: goto L75;
                case 62: goto L75;
                case 63: goto L75;
                case 64: goto L75;
                default: goto L24;
            }
        L24:
            switch(r3) {
                case 91: goto L75;
                case 92: goto L75;
                case 93: goto L75;
                case 94: goto L75;
                case 95: goto L75;
                case 96: goto L75;
                default: goto L27;
            }
        L27:
            switch(r3) {
                case 123: goto L75;
                case 124: goto L75;
                case 125: goto L75;
                case 126: goto L75;
                default: goto L2a;
            }
        L2a:
            switch(r3) {
                case 192: goto L4d;
                case 193: goto L4d;
                case 194: goto L4d;
                case 195: goto L4d;
                default: goto L2d;
            }
        L2d:
            switch(r3) {
                case 200: goto L39;
                case 201: goto L39;
                case 202: goto L39;
                default: goto L30;
            }
        L30:
            switch(r3) {
                case 210: goto L3e;
                case 211: goto L3e;
                case 212: goto L3e;
                case 213: goto L3e;
                default: goto L33;
            }
        L33:
            switch(r3) {
                case 224: goto L48;
                case 225: goto L48;
                case 226: goto L48;
                case 227: goto L48;
                default: goto L36;
            }
        L36:
            r0[r2] = r3
            goto L83
        L39:
            r3 = 69
            r0[r2] = r3
            goto L83
        L3e:
            r3 = 79
            r0[r2] = r3
            goto L83
        L43:
            r3 = 100
            r0[r2] = r3
            goto L83
        L48:
            r3 = 97
            r0[r2] = r3
            goto L83
        L4d:
            r3 = 65
            r0[r2] = r3
            goto L83
        L52:
            r3 = 121(0x79, float:1.7E-43)
            r0[r2] = r3
            goto L83
        L57:
            r3 = 117(0x75, float:1.64E-43)
            r0[r2] = r3
            goto L83
        L5c:
            r3 = 111(0x6f, float:1.56E-43)
            r0[r2] = r3
            goto L83
        L61:
            r3 = 105(0x69, float:1.47E-43)
            r0[r2] = r3
            goto L83
        L66:
            r3 = 101(0x65, float:1.42E-43)
            r0[r2] = r3
            goto L83
        L6b:
            r3 = 89
            r0[r2] = r3
            goto L83
        L70:
            r3 = 68
            r0[r2] = r3
            goto L83
        L75:
            r3 = 32
            r0[r2] = r3
            goto L83
        L7a:
            r3 = 85
            r0[r2] = r3
            goto L83
        L7f:
            r3 = 73
            r0[r2] = r3
        L83:
            int r2 = r2 + 1
            goto L9
        L86:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r0 = " "
            java.lang.String[] r6 = r6.split(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r6.length
            r3 = 0
        L9c:
            if (r3 >= r2) goto Lac
            r4 = r6[r3]
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto La9
            r0.add(r4)
        La9:
            int r3 = r3 + 1
            goto L9c
        Lac:
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me0.AbstractC23262x6.m119968C(java.lang.String):java.lang.String[]");
    }

    /* renamed from: D */
    public static C1483e m119969D(String str) {
        String m120002o;
        boolean z11;
        System.nanoTime();
        C1483e c1483e = null;
        try {
            m120002o = m120002o(str);
        } catch (Exception e11) {
            AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e11.getMessage());
        }
        if (m120002o.length() < 1) {
            return null;
        }
        if (m120002o.charAt(m120002o.length() - 1) == ' ') {
            z11 = true;
        } else {
            z11 = false;
        }
        String trim = m120002o.trim();
        if (trim.length() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z12 = false;
        boolean z13 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < trim.length(); i12++) {
            if (AbstractC23244v8.m119755s(trim.charAt(i12))) {
                if (z12 && !z13) {
                    arrayList.add(trim.substring(i11, i12));
                    z12 = false;
                    z13 = true;
                }
            } else {
                if (!z12) {
                    i11 = i12;
                    z12 = true;
                    z13 = false;
                }
                if (i12 == trim.length() - 1) {
                    arrayList.add(trim.substring(i11, i12 + 1));
                    z12 = false;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        sb2.append("'\"");
        if (arrayList.size() > 1) {
            for (int i13 = 0; i13 < arrayList.size() - 1; i13++) {
                if (((String) arrayList.get(i13)).length() > 0) {
                    sb2.append((String) arrayList.get(i13));
                    sb2.append(" ");
                    sb3.append((String) arrayList.get(i13));
                    sb3.append(" ");
                }
            }
            String str2 = (String) arrayList.get(arrayList.size() - 1);
            if (str2.length() > 0) {
                sb2.append(str2);
                if (!z11) {
                    sb2.append("*");
                }
                sb3.append(str2);
            }
        } else {
            sb2.append((String) arrayList.get(0));
            if (!z11) {
                sb2.append("*");
            }
            sb3.append((String) arrayList.get(0));
        }
        sb2.append("\"'");
        arrayList2.add(sb3.toString());
        if (!arrayList2.contains(trim)) {
            arrayList2.add(trim);
        }
        c1483e = new C1483e(sb2.toString(), arrayList2);
        System.nanoTime();
        return c1483e;
    }

    /* renamed from: E */
    public static String[] m119970E(String str) {
        return m119971F(str, false);
    }

    /* renamed from: F */
    public static String[] m119971F(String str, boolean z11) {
        return C23024b7.m118036H(str, z11);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:263)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0020. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0023. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0026. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0029. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x002c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String[] m119972G(java.lang.String r4, boolean r5) {
        /*
            char[] r4 = r4.toCharArray()
            int r0 = r4.length
            char[] r0 = new char[r0]
            r1 = 0
        L8:
            int r2 = r4.length
            if (r1 >= r2) goto L85
            char r2 = r4[r1]
            r3 = 204(0xcc, float:2.86E-43)
            if (r2 == r3) goto L7e
            r3 = 205(0xcd, float:2.87E-43)
            if (r2 == r3) goto L7e
            r3 = 217(0xd9, float:3.04E-43)
            if (r2 == r3) goto L79
            r3 = 218(0xda, float:3.05E-43)
            if (r2 == r3) goto L79
            switch(r2) {
                case 33: goto L74;
                case 34: goto L74;
                case 35: goto L74;
                case 36: goto L74;
                case 37: goto L74;
                case 38: goto L74;
                case 39: goto L74;
                case 40: goto L74;
                case 41: goto L74;
                case 42: goto L74;
                case 43: goto L74;
                case 44: goto L74;
                case 45: goto L74;
                case 46: goto L74;
                case 47: goto L74;
                case 137: goto L6f;
                case 208: goto L6f;
                case 221: goto L6a;
                case 232: goto L65;
                case 233: goto L65;
                case 234: goto L65;
                case 236: goto L60;
                case 237: goto L60;
                case 242: goto L5b;
                case 243: goto L5b;
                case 244: goto L5b;
                case 245: goto L5b;
                case 249: goto L56;
                case 250: goto L56;
                case 253: goto L51;
                case 258: goto L4c;
                case 259: goto L47;
                case 272: goto L6f;
                case 273: goto L42;
                case 296: goto L7e;
                case 297: goto L60;
                case 360: goto L79;
                case 361: goto L56;
                case 416: goto L3d;
                case 417: goto L5b;
                case 431: goto L79;
                case 432: goto L56;
                case 461: goto L4c;
                case 462: goto L47;
                case 514: goto L4c;
                case 515: goto L47;
                case 518: goto L38;
                case 519: goto L65;
                case 526: goto L3d;
                case 527: goto L5b;
                case 7840: goto L4c;
                case 7841: goto L47;
                case 7842: goto L4c;
                case 7843: goto L47;
                case 7844: goto L4c;
                case 7845: goto L47;
                case 7846: goto L4c;
                case 7847: goto L47;
                case 7848: goto L4c;
                case 7849: goto L47;
                case 7850: goto L4c;
                case 7851: goto L47;
                case 7852: goto L4c;
                case 7853: goto L47;
                case 7854: goto L4c;
                case 7855: goto L47;
                case 7856: goto L4c;
                case 7857: goto L47;
                case 7858: goto L4c;
                case 7859: goto L47;
                case 7860: goto L4c;
                case 7861: goto L47;
                case 7862: goto L4c;
                case 7863: goto L47;
                case 7864: goto L38;
                case 7865: goto L65;
                case 7866: goto L38;
                case 7867: goto L65;
                case 7868: goto L38;
                case 7869: goto L65;
                case 7870: goto L38;
                case 7871: goto L65;
                case 7872: goto L38;
                case 7873: goto L65;
                case 7874: goto L38;
                case 7875: goto L65;
                case 7876: goto L38;
                case 7877: goto L65;
                case 7878: goto L38;
                case 7879: goto L65;
                case 7880: goto L7e;
                case 7881: goto L60;
                case 7882: goto L7e;
                case 7883: goto L60;
                case 7884: goto L3d;
                case 7885: goto L5b;
                case 7886: goto L3d;
                case 7887: goto L5b;
                case 7888: goto L3d;
                case 7889: goto L5b;
                case 7890: goto L3d;
                case 7891: goto L5b;
                case 7892: goto L3d;
                case 7893: goto L5b;
                case 7894: goto L3d;
                case 7895: goto L5b;
                case 7896: goto L3d;
                case 7897: goto L5b;
                case 7898: goto L3d;
                case 7899: goto L5b;
                case 7900: goto L3d;
                case 7901: goto L5b;
                case 7902: goto L3d;
                case 7903: goto L5b;
                case 7904: goto L3d;
                case 7905: goto L5b;
                case 7906: goto L3d;
                case 7907: goto L5b;
                case 7908: goto L79;
                case 7909: goto L56;
                case 7910: goto L79;
                case 7911: goto L56;
                case 7912: goto L79;
                case 7913: goto L56;
                case 7914: goto L79;
                case 7915: goto L56;
                case 7916: goto L79;
                case 7917: goto L56;
                case 7918: goto L79;
                case 7919: goto L56;
                case 7920: goto L79;
                case 7921: goto L56;
                case 7922: goto L6a;
                case 7923: goto L51;
                case 7924: goto L6a;
                case 7925: goto L51;
                case 7926: goto L6a;
                case 7927: goto L51;
                case 7928: goto L6a;
                case 7929: goto L51;
                default: goto L20;
            }
        L20:
            switch(r2) {
                case 58: goto L74;
                case 59: goto L74;
                case 60: goto L74;
                case 61: goto L74;
                case 62: goto L74;
                case 63: goto L74;
                case 64: goto L74;
                default: goto L23;
            }
        L23:
            switch(r2) {
                case 91: goto L74;
                case 92: goto L74;
                case 93: goto L74;
                case 94: goto L74;
                case 95: goto L74;
                case 96: goto L74;
                default: goto L26;
            }
        L26:
            switch(r2) {
                case 123: goto L74;
                case 124: goto L74;
                case 125: goto L74;
                case 126: goto L74;
                default: goto L29;
            }
        L29:
            switch(r2) {
                case 192: goto L4c;
                case 193: goto L4c;
                case 194: goto L4c;
                case 195: goto L4c;
                default: goto L2c;
            }
        L2c:
            switch(r2) {
                case 200: goto L38;
                case 201: goto L38;
                case 202: goto L38;
                default: goto L2f;
            }
        L2f:
            switch(r2) {
                case 210: goto L3d;
                case 211: goto L3d;
                case 212: goto L3d;
                case 213: goto L3d;
                default: goto L32;
            }
        L32:
            switch(r2) {
                case 224: goto L47;
                case 225: goto L47;
                case 226: goto L47;
                case 227: goto L47;
                default: goto L35;
            }
        L35:
            r0[r1] = r2
            goto L82
        L38:
            r2 = 69
            r0[r1] = r2
            goto L82
        L3d:
            r2 = 79
            r0[r1] = r2
            goto L82
        L42:
            r2 = 100
            r0[r1] = r2
            goto L82
        L47:
            r2 = 97
            r0[r1] = r2
            goto L82
        L4c:
            r2 = 65
            r0[r1] = r2
            goto L82
        L51:
            r2 = 121(0x79, float:1.7E-43)
            r0[r1] = r2
            goto L82
        L56:
            r2 = 117(0x75, float:1.64E-43)
            r0[r1] = r2
            goto L82
        L5b:
            r2 = 111(0x6f, float:1.56E-43)
            r0[r1] = r2
            goto L82
        L60:
            r2 = 105(0x69, float:1.47E-43)
            r0[r1] = r2
            goto L82
        L65:
            r2 = 101(0x65, float:1.42E-43)
            r0[r1] = r2
            goto L82
        L6a:
            r2 = 89
            r0[r1] = r2
            goto L82
        L6f:
            r2 = 68
            r0[r1] = r2
            goto L82
        L74:
            r2 = 32
            r0[r1] = r2
            goto L82
        L79:
            r2 = 85
            r0[r1] = r2
            goto L82
        L7e:
            r2 = 73
            r0[r1] = r2
        L82:
            int r1 = r1 + 1
            goto L8
        L85:
            java.lang.String r4 = new java.lang.String
            if (r5 == 0) goto L91
            r4.<init>(r0)
            java.lang.String r4 = r4.toLowerCase()
            goto L94
        L91:
            r4.<init>(r0)
        L94:
            java.lang.String r5 = " "
            java.lang.String[] r4 = r4.split(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me0.AbstractC23262x6.m119972G(java.lang.String, boolean):java.lang.String[]");
    }

    /* renamed from: H */
    public static String[] m119973H(String str) {
        char[] charArray = str.toCharArray();
        char[] cArr = new char[charArray.length];
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c11 = charArray[i11];
            if (c11 >= 'a' && c11 <= 'z') {
                cArr[i11] = c11;
            } else if (c11 >= 'A' && c11 <= 'Z') {
                cArr[i11] = c11;
            } else if (c11 >= '0' && c11 <= '9') {
                cArr[i11] = c11;
            } else {
                switch (c11) {
                    case 137:
                    case 208:
                    case 272:
                        cArr[i11] = 'D';
                        break;
                    case 192:
                    case 193:
                    case 194:
                    case 195:
                    case 258:
                    case 461:
                    case 514:
                    case 7840:
                    case 7842:
                    case 7844:
                    case 7846:
                    case 7848:
                    case 7850:
                    case 7852:
                    case 7854:
                    case 7856:
                    case 7858:
                    case 7860:
                    case 7862:
                        cArr[i11] = 'A';
                        break;
                    case 200:
                    case 201:
                    case 202:
                    case 518:
                    case 7864:
                    case 7866:
                    case 7868:
                    case 7870:
                    case 7872:
                    case 7874:
                    case 7876:
                    case 7878:
                        cArr[i11] = 'E';
                        break;
                    case 204:
                    case 205:
                    case 296:
                    case 7880:
                    case 7882:
                        cArr[i11] = 'I';
                        break;
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 416:
                    case 526:
                    case 7884:
                    case 7886:
                    case 7888:
                    case 7890:
                    case 7892:
                    case 7894:
                    case 7896:
                    case 7898:
                    case 7900:
                    case 7902:
                    case 7904:
                    case 7906:
                        cArr[i11] = 'O';
                        break;
                    case 217:
                    case 218:
                    case 360:
                    case 431:
                    case 7908:
                    case 7910:
                    case 7912:
                    case 7914:
                    case 7916:
                    case 7918:
                    case 7920:
                        cArr[i11] = 'U';
                        break;
                    case 221:
                    case 7922:
                    case 7924:
                    case 7926:
                    case 7928:
                        cArr[i11] = 'Y';
                        break;
                    case 224:
                    case 225:
                    case 226:
                    case 227:
                    case 259:
                    case 462:
                    case 515:
                    case 7841:
                    case 7843:
                    case 7845:
                    case 7847:
                    case 7849:
                    case 7851:
                    case 7853:
                    case 7855:
                    case 7857:
                    case 7859:
                    case 7861:
                    case 7863:
                        cArr[i11] = 'a';
                        break;
                    case 232:
                    case 233:
                    case 234:
                    case 519:
                    case 7865:
                    case 7867:
                    case 7869:
                    case 7871:
                    case 7873:
                    case 7875:
                    case 7877:
                    case 7879:
                        cArr[i11] = 'e';
                        break;
                    case 236:
                    case 237:
                    case 297:
                    case 7881:
                    case 7883:
                        cArr[i11] = 'i';
                        break;
                    case 242:
                    case 243:
                    case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                    case 245:
                    case 417:
                    case 527:
                    case 7885:
                    case 7887:
                    case 7889:
                    case 7891:
                    case 7893:
                    case 7895:
                    case 7897:
                    case 7899:
                    case 7901:
                    case 7903:
                    case 7905:
                    case 7907:
                        cArr[i11] = 'o';
                        break;
                    case 249:
                    case 250:
                    case 361:
                    case 432:
                    case 7909:
                    case 7911:
                    case 7913:
                    case 7915:
                    case 7917:
                    case 7919:
                    case 7921:
                        cArr[i11] = 'u';
                        break;
                    case 253:
                    case 7923:
                    case 7925:
                    case 7927:
                    case 7929:
                        cArr[i11] = 'y';
                        break;
                    case 273:
                        cArr[i11] = 'd';
                        break;
                    default:
                        cArr[i11] = ' ';
                        break;
                }
            }
        }
        String[] split = new String(cArr).toLowerCase().split(" ");
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < split.length; i12++) {
            if (!TextUtils.isEmpty(split[i12])) {
                arrayList.add(split[i12]);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:263)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0036. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0039. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x003c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x003f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:3:0x0008, B:5:0x000b, B:9:0x0015, B:24:0x0036, B:25:0x0039, B:26:0x003c, B:27:0x003f, B:28:0x0042, B:29:0x0045, B:30:0x0048, B:31:0x004b, B:33:0x004e, B:35:0x0053, B:37:0x0058, B:39:0x005d, B:41:0x0062, B:43:0x0067, B:45:0x006c, B:47:0x0071), top: B:2:0x0008 }] */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String m119974I(java.lang.String r4) {
        /*
            char[] r4 = r4.toCharArray()
            int r0 = r4.length
            char[] r0 = new char[r0]
            r1 = 0
        L8:
            int r2 = r4.length     // Catch: java.lang.Exception -> L1c
            if (r1 >= r2) goto L7b
            char r2 = r4[r1]     // Catch: java.lang.Exception -> L1c
            r3 = 65
            if (r2 < r3) goto L1e
            r3 = 90
            if (r2 > r3) goto L1e
            char r2 = java.lang.Character.toLowerCase(r2)     // Catch: java.lang.Exception -> L1c
            r0[r1] = r2     // Catch: java.lang.Exception -> L1c
            goto L75
        L1c:
            r4 = move-exception
            goto L78
        L1e:
            r3 = 37
            if (r2 == r3) goto L71
            r3 = 38
            if (r2 == r3) goto L71
            r3 = 204(0xcc, float:2.86E-43)
            if (r2 == r3) goto L6c
            r3 = 205(0xcd, float:2.87E-43)
            if (r2 == r3) goto L6c
            r3 = 217(0xd9, float:3.04E-43)
            if (r2 == r3) goto L67
            r3 = 218(0xda, float:3.05E-43)
            if (r2 == r3) goto L67
            switch(r2) {
                case 33: goto L71;
                case 35: goto L71;
                case 40: goto L71;
                case 41: goto L71;
                case 42: goto L71;
                case 43: goto L71;
                case 44: goto L71;
                case 45: goto L71;
                case 46: goto L71;
                case 47: goto L71;
                case 137: goto L62;
                case 208: goto L62;
                case 221: goto L5d;
                case 224: goto L58;
                case 225: goto L58;
                case 226: goto L58;
                case 227: goto L58;
                case 232: goto L53;
                case 233: goto L53;
                case 234: goto L53;
                case 236: goto L6c;
                case 237: goto L6c;
                case 242: goto L4e;
                case 243: goto L4e;
                case 244: goto L4e;
                case 245: goto L4e;
                case 249: goto L67;
                case 250: goto L67;
                case 253: goto L5d;
                case 258: goto L58;
                case 259: goto L58;
                case 272: goto L62;
                case 273: goto L62;
                case 296: goto L6c;
                case 297: goto L6c;
                case 360: goto L67;
                case 361: goto L67;
                case 416: goto L4e;
                case 417: goto L4e;
                case 431: goto L67;
                case 432: goto L67;
                case 461: goto L58;
                case 462: goto L58;
                case 514: goto L58;
                case 515: goto L58;
                case 518: goto L53;
                case 519: goto L53;
                case 526: goto L4e;
                case 527: goto L4e;
                case 7840: goto L58;
                case 7841: goto L58;
                case 7842: goto L58;
                case 7843: goto L58;
                case 7844: goto L58;
                case 7845: goto L58;
                case 7846: goto L58;
                case 7847: goto L58;
                case 7848: goto L58;
                case 7849: goto L58;
                case 7850: goto L58;
                case 7851: goto L58;
                case 7852: goto L58;
                case 7853: goto L58;
                case 7854: goto L58;
                case 7855: goto L58;
                case 7856: goto L58;
                case 7857: goto L58;
                case 7858: goto L58;
                case 7859: goto L58;
                case 7860: goto L58;
                case 7861: goto L58;
                case 7862: goto L58;
                case 7863: goto L58;
                case 7864: goto L53;
                case 7865: goto L53;
                case 7866: goto L53;
                case 7867: goto L53;
                case 7868: goto L53;
                case 7869: goto L53;
                case 7870: goto L53;
                case 7871: goto L53;
                case 7872: goto L53;
                case 7873: goto L53;
                case 7874: goto L53;
                case 7875: goto L53;
                case 7876: goto L53;
                case 7877: goto L53;
                case 7878: goto L53;
                case 7879: goto L53;
                case 7880: goto L6c;
                case 7881: goto L6c;
                case 7882: goto L6c;
                case 7883: goto L6c;
                case 7884: goto L4e;
                case 7885: goto L4e;
                case 7886: goto L4e;
                case 7887: goto L4e;
                case 7888: goto L4e;
                case 7889: goto L4e;
                case 7890: goto L4e;
                case 7891: goto L4e;
                case 7892: goto L4e;
                case 7893: goto L4e;
                case 7894: goto L4e;
                case 7895: goto L4e;
                case 7896: goto L4e;
                case 7897: goto L4e;
                case 7898: goto L4e;
                case 7899: goto L4e;
                case 7900: goto L4e;
                case 7901: goto L4e;
                case 7902: goto L4e;
                case 7903: goto L4e;
                case 7904: goto L4e;
                case 7905: goto L4e;
                case 7906: goto L4e;
                case 7907: goto L4e;
                case 7908: goto L67;
                case 7909: goto L67;
                case 7910: goto L67;
                case 7911: goto L67;
                case 7912: goto L67;
                case 7913: goto L67;
                case 7914: goto L67;
                case 7915: goto L67;
                case 7916: goto L67;
                case 7917: goto L67;
                case 7918: goto L67;
                case 7919: goto L67;
                case 7920: goto L67;
                case 7921: goto L67;
                case 7922: goto L5d;
                case 7923: goto L5d;
                case 7924: goto L5d;
                case 7925: goto L5d;
                case 7926: goto L5d;
                case 7927: goto L5d;
                case 7928: goto L5d;
                case 7929: goto L5d;
                default: goto L39;
            }     // Catch: java.lang.Exception -> L1c
        L39:
            switch(r2) {
                case 58: goto L71;
                case 59: goto L71;
                case 60: goto L71;
                case 61: goto L71;
                case 62: goto L71;
                case 63: goto L71;
                case 64: goto L71;
                default: goto L3c;
            }     // Catch: java.lang.Exception -> L1c
        L3c:
            switch(r2) {
                case 91: goto L71;
                case 92: goto L71;
                case 93: goto L71;
                case 94: goto L71;
                case 95: goto L71;
                default: goto L3f;
            }     // Catch: java.lang.Exception -> L1c
        L3f:
            switch(r2) {
                case 123: goto L71;
                case 124: goto L71;
                case 125: goto L71;
                case 126: goto L71;
                default: goto L42;
            }     // Catch: java.lang.Exception -> L1c
        L42:
            switch(r2) {
                case 192: goto L58;
                case 193: goto L58;
                case 194: goto L58;
                case 195: goto L58;
                default: goto L45;
            }     // Catch: java.lang.Exception -> L1c
        L45:
            switch(r2) {
                case 200: goto L53;
                case 201: goto L53;
                case 202: goto L53;
                default: goto L48;
            }     // Catch: java.lang.Exception -> L1c
        L48:
            switch(r2) {
                case 210: goto L4e;
                case 211: goto L4e;
                case 212: goto L4e;
                case 213: goto L4e;
                default: goto L4b;
            }     // Catch: java.lang.Exception -> L1c
        L4b:
            r0[r1] = r2     // Catch: java.lang.Exception -> L1c
            goto L75
        L4e:
            r2 = 111(0x6f, float:1.56E-43)
            r0[r1] = r2     // Catch: java.lang.Exception -> L1c
            goto L75
        L53:
            r2 = 101(0x65, float:1.42E-43)
            r0[r1] = r2     // Catch: java.lang.Exception -> L1c
            goto L75
        L58:
            r2 = 97
            r0[r1] = r2     // Catch: java.lang.Exception -> L1c
            goto L75
        L5d:
            r2 = 121(0x79, float:1.7E-43)
            r0[r1] = r2     // Catch: java.lang.Exception -> L1c
            goto L75
        L62:
            r2 = 100
            r0[r1] = r2     // Catch: java.lang.Exception -> L1c
            goto L75
        L67:
            r2 = 117(0x75, float:1.64E-43)
            r0[r1] = r2     // Catch: java.lang.Exception -> L1c
            goto L75
        L6c:
            r2 = 105(0x69, float:1.47E-43)
            r0[r1] = r2     // Catch: java.lang.Exception -> L1c
            goto L75
        L71:
            r2 = 32
            r0[r1] = r2     // Catch: java.lang.Exception -> L1c
        L75:
            int r1 = r1 + 1
            goto L8
        L78:
            r4.printStackTrace()
        L7b:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r4 = r4.trim()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me0.AbstractC23262x6.m119974I(java.lang.String):java.lang.String");
    }

    /* renamed from: J */
    static void m119975J(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            if (contactProfile != null) {
                contactProfile.f42363O = contactProfile.m40383Q(true, false);
            }
        }
    }

    /* renamed from: K */
    public static float m119976K(String str, String str2, List list, long j11, int i11, StringBuilder sb2) {
        int i12;
        String str3;
        Map map = AbstractC23304d.f113425q;
        if (map.containsKey(str) && map.get(str) != null) {
            i12 = ((C32093r8) map.get(str)).f147886c;
        } else {
            i12 = 0;
        }
        int i13 = 20;
        if (i12 <= 20) {
            i13 = i12;
        }
        if (C19322f1.f95953d && sb2 != null) {
            if (sb2.length() != 0) {
                str3 = ", ";
            } else {
                str3 = "";
            }
            sb2.append(str3);
            sb2.append("clickCount: ");
            sb2.append(i13);
        }
        int i14 = 0;
        float f11 = 0.0f;
        for (int i15 = 0; i15 < list.size(); i15++) {
            try {
                C32093r8 c32093r8 = (C32093r8) list.get(i15);
                if (c32093r8 != null && str.equals(c32093r8.f147884a)) {
                    try {
                        if (AbstractC23210s6.m119560a(i11, 33554432)) {
                            try {
                                if (TextUtils.equals(str2, c32093r8.f147887d)) {
                                }
                            } catch (Exception e11) {
                                e = e11;
                                e.printStackTrace();
                            }
                        }
                        if (c32093r8.f147886c > 0) {
                            float m120009v = m120009v(c32093r8.f147892i);
                            ArrayList arrayList = c32093r8.f147893j;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                for (int i16 = 0; i16 < c32093r8.f147893j.size(); i16++) {
                                    int m118042N = C23024b7.m118042N(j11 - ((Long) c32093r8.f147893j.get(i16)).longValue());
                                    f11 += m118042N * m120009v;
                                    if (C19322f1.f95953d && sb2 != null) {
                                        sb2.append("*");
                                        sb2.append(m120009v);
                                        sb2.append("-");
                                        sb2.append(m118042N);
                                    }
                                    i14++;
                                }
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                }
            } catch (Exception e13) {
                e = e13;
            }
        }
        if (i14 <= 0) {
            return 0.0f;
        }
        return (i13 * f11) / i14;
    }

    /* renamed from: L */
    public static void m119977L(Context context, String str, List list, List list2, int i11, InterfaceC19305a interfaceC19305a) {
        ContactProfile contactProfile;
        String[] strArr = AbstractC23304d.f113367c;
        if (strArr == null || strArr.length == 0) {
            AbstractC23304d.f113367c = context.getResources().getStringArray(AbstractC16775v.array_language_as_code);
        }
        String[] strArr2 = AbstractC23304d.f113367c;
        ArrayList arrayList = new ArrayList();
        ContactProfile m141809c = C28203u6.f131407a.m141809c("204278670");
        String str2 = AbstractC23304d.f113377e;
        if (m141809c == null) {
            C0843s0.m2286r().m2294e(new AbstractC0826k.c("204278670", new TrackingSource((short) 1047)));
        } else {
            str2 = m141809c.f42446v;
        }
        String str3 = str2;
        for (String str4 : strArr2) {
            ContactProfile contactProfile2 = new ContactProfile("204278670");
            String m114548o = AbstractC21935u.m114548o(str4);
            if (!TextUtils.isEmpty(m114548o)) {
                contactProfile2.f42437s = m114548o;
                contactProfile2.f42359M1 = true;
                if (!TextUtils.isEmpty(str3)) {
                    contactProfile2.f42446v = str3;
                }
                arrayList.add(contactProfile2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i12 = i11 | 98;
        m119979N(str, arrayList, arrayList2, C19669z.f97573U, list2, i12, interfaceC19305a);
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    ContactProfile contactProfile3 = (ContactProfile) it.next();
                    if (contactProfile3.mo2475c().equals(AbstractC21935u.m114547n())) {
                        list.add(contactProfile3);
                        break;
                    }
                } else {
                    list.add((ContactProfile) arrayList2.get(0));
                    break;
                }
            }
            Collections.sort(list, ContactProfile.f42319Z1);
            return;
        }
        if (AbstractC21935u.m114549p()) {
            arrayList.clear();
            for (String str5 : strArr2) {
                ContactProfile contactProfile4 = new ContactProfile("204278670");
                String m114546m = AbstractC21935u.m114546m(str5);
                if (!TextUtils.isEmpty(m114546m)) {
                    contactProfile4.f42437s = m114546m;
                    contactProfile4.f42359M1 = true;
                    if (!TextUtils.isEmpty(str3)) {
                        contactProfile4.f42446v = str3;
                    }
                    arrayList.add(contactProfile4);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            m119979N(str, arrayList, arrayList3, C19669z.f97573U, list2, i12, interfaceC19305a);
            if (!arrayList3.isEmpty()) {
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        contactProfile = (ContactProfile) it2.next();
                        if (contactProfile.mo2475c().equals(AbstractC21935u.m114545l())) {
                            break;
                        }
                    } else {
                        contactProfile = null;
                        break;
                    }
                }
                if (contactProfile == null) {
                    contactProfile = (ContactProfile) arrayList3.get(0);
                }
                String string = context.getResources().getString(AbstractC8020f0.label_search_old_thread_name_prefix);
                SpannableString spannableString = new SpannableString(contactProfile.f42437s);
                if (!contactProfile.f42399a1.isEmpty()) {
                    try {
                        ArrayList arrayList4 = contactProfile.f42399a1;
                        for (int i13 = 0; i13 < arrayList4.size() - 1; i13 += 2) {
                            if (((Integer) arrayList4.get(i13)).intValue() >= 0) {
                                int i14 = i13 + 1;
                                if (((Integer) arrayList4.get(i14)).intValue() > ((Integer) arrayList4.get(i13)).intValue()) {
                                    AbstractC23217t2.m119663o(spannableString, ((Integer) arrayList4.get(i13)).intValue(), ((Integer) arrayList4.get(i14)).intValue(), 0);
                                }
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    contactProfile.f42436r1 = new SpannableStringBuilder(TextUtils.concat(new SpannableString(string), spannableString));
                    list.add(contactProfile);
                }
                Collections.sort(list, ContactProfile.f42319Z1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0448 A[Catch: Exception -> 0x002c, TryCatch #2 {Exception -> 0x002c, blocks: (B:3:0x0004, B:4:0x001a, B:6:0x0020, B:10:0x0033, B:13:0x003e, B:14:0x0042, B:16:0x0048, B:18:0x0051, B:24:0x005a, B:26:0x0064, B:28:0x0068, B:30:0x006e, B:37:0x0076, B:40:0x0081, B:42:0x008b, B:46:0x0092, B:47:0x0096, B:49:0x00de, B:51:0x00ea, B:53:0x00f2, B:58:0x0106, B:87:0x017f, B:94:0x017c, B:102:0x0186, B:104:0x019d, B:106:0x01b3, B:108:0x01c8, B:110:0x01ce, B:111:0x01eb, B:113:0x01f6, B:115:0x01fe, B:117:0x0206, B:118:0x0216, B:119:0x0442, B:121:0x0448, B:127:0x0225, B:129:0x022f, B:131:0x0242, B:133:0x0269, B:150:0x02ec, B:151:0x02ef, B:153:0x0319, B:155:0x032f, B:157:0x0356, B:162:0x0364, B:164:0x036c, B:166:0x0390, B:168:0x03b3, B:169:0x03cb, B:171:0x03d3, B:172:0x0414, B:174:0x041d, B:176:0x0425, B:178:0x042d, B:179:0x043d, B:204:0x0459), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0319 A[Catch: Exception -> 0x002c, LOOP:6: B:152:0x0317->B:153:0x0319, LOOP_END, TryCatch #2 {Exception -> 0x002c, blocks: (B:3:0x0004, B:4:0x001a, B:6:0x0020, B:10:0x0033, B:13:0x003e, B:14:0x0042, B:16:0x0048, B:18:0x0051, B:24:0x005a, B:26:0x0064, B:28:0x0068, B:30:0x006e, B:37:0x0076, B:40:0x0081, B:42:0x008b, B:46:0x0092, B:47:0x0096, B:49:0x00de, B:51:0x00ea, B:53:0x00f2, B:58:0x0106, B:87:0x017f, B:94:0x017c, B:102:0x0186, B:104:0x019d, B:106:0x01b3, B:108:0x01c8, B:110:0x01ce, B:111:0x01eb, B:113:0x01f6, B:115:0x01fe, B:117:0x0206, B:118:0x0216, B:119:0x0442, B:121:0x0448, B:127:0x0225, B:129:0x022f, B:131:0x0242, B:133:0x0269, B:150:0x02ec, B:151:0x02ef, B:153:0x0319, B:155:0x032f, B:157:0x0356, B:162:0x0364, B:164:0x036c, B:166:0x0390, B:168:0x03b3, B:169:0x03cb, B:171:0x03d3, B:172:0x0414, B:174:0x041d, B:176:0x0425, B:178:0x042d, B:179:0x043d, B:204:0x0459), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0356 A[Catch: Exception -> 0x002c, TryCatch #2 {Exception -> 0x002c, blocks: (B:3:0x0004, B:4:0x001a, B:6:0x0020, B:10:0x0033, B:13:0x003e, B:14:0x0042, B:16:0x0048, B:18:0x0051, B:24:0x005a, B:26:0x0064, B:28:0x0068, B:30:0x006e, B:37:0x0076, B:40:0x0081, B:42:0x008b, B:46:0x0092, B:47:0x0096, B:49:0x00de, B:51:0x00ea, B:53:0x00f2, B:58:0x0106, B:87:0x017f, B:94:0x017c, B:102:0x0186, B:104:0x019d, B:106:0x01b3, B:108:0x01c8, B:110:0x01ce, B:111:0x01eb, B:113:0x01f6, B:115:0x01fe, B:117:0x0206, B:118:0x0216, B:119:0x0442, B:121:0x0448, B:127:0x0225, B:129:0x022f, B:131:0x0242, B:133:0x0269, B:150:0x02ec, B:151:0x02ef, B:153:0x0319, B:155:0x032f, B:157:0x0356, B:162:0x0364, B:164:0x036c, B:166:0x0390, B:168:0x03b3, B:169:0x03cb, B:171:0x03d3, B:172:0x0414, B:174:0x041d, B:176:0x0425, B:178:0x042d, B:179:0x043d, B:204:0x0459), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0364 A[Catch: Exception -> 0x002c, TryCatch #2 {Exception -> 0x002c, blocks: (B:3:0x0004, B:4:0x001a, B:6:0x0020, B:10:0x0033, B:13:0x003e, B:14:0x0042, B:16:0x0048, B:18:0x0051, B:24:0x005a, B:26:0x0064, B:28:0x0068, B:30:0x006e, B:37:0x0076, B:40:0x0081, B:42:0x008b, B:46:0x0092, B:47:0x0096, B:49:0x00de, B:51:0x00ea, B:53:0x00f2, B:58:0x0106, B:87:0x017f, B:94:0x017c, B:102:0x0186, B:104:0x019d, B:106:0x01b3, B:108:0x01c8, B:110:0x01ce, B:111:0x01eb, B:113:0x01f6, B:115:0x01fe, B:117:0x0206, B:118:0x0216, B:119:0x0442, B:121:0x0448, B:127:0x0225, B:129:0x022f, B:131:0x0242, B:133:0x0269, B:150:0x02ec, B:151:0x02ef, B:153:0x0319, B:155:0x032f, B:157:0x0356, B:162:0x0364, B:164:0x036c, B:166:0x0390, B:168:0x03b3, B:169:0x03cb, B:171:0x03d3, B:172:0x0414, B:174:0x041d, B:176:0x0425, B:178:0x042d, B:179:0x043d, B:204:0x0459), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0390 A[Catch: Exception -> 0x002c, TryCatch #2 {Exception -> 0x002c, blocks: (B:3:0x0004, B:4:0x001a, B:6:0x0020, B:10:0x0033, B:13:0x003e, B:14:0x0042, B:16:0x0048, B:18:0x0051, B:24:0x005a, B:26:0x0064, B:28:0x0068, B:30:0x006e, B:37:0x0076, B:40:0x0081, B:42:0x008b, B:46:0x0092, B:47:0x0096, B:49:0x00de, B:51:0x00ea, B:53:0x00f2, B:58:0x0106, B:87:0x017f, B:94:0x017c, B:102:0x0186, B:104:0x019d, B:106:0x01b3, B:108:0x01c8, B:110:0x01ce, B:111:0x01eb, B:113:0x01f6, B:115:0x01fe, B:117:0x0206, B:118:0x0216, B:119:0x0442, B:121:0x0448, B:127:0x0225, B:129:0x022f, B:131:0x0242, B:133:0x0269, B:150:0x02ec, B:151:0x02ef, B:153:0x0319, B:155:0x032f, B:157:0x0356, B:162:0x0364, B:164:0x036c, B:166:0x0390, B:168:0x03b3, B:169:0x03cb, B:171:0x03d3, B:172:0x0414, B:174:0x041d, B:176:0x0425, B:178:0x042d, B:179:0x043d, B:204:0x0459), top: B:2:0x0004 }] */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m119978M(String str, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12, Map map, ArrayList arrayList3, boolean z13, boolean z14, boolean z15, InterfaceC19305a interfaceC19305a) {
        long j11;
        float f11;
        int size;
        int i11;
        String str2;
        int i12;
        float f12;
        boolean z16 = z14;
        try {
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            ArrayList arrayList4 = new ArrayList();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str3 = ((ContactProfile) it.next()).f42434r;
                synchronizedMap.put(str3, str3);
            }
            boolean z17 = true;
            boolean z18 = false;
            boolean z19 = z13 && m120000m(str);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it2.next();
                if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
                    return;
                }
                if (contactProfile == null || contactProfile.f42434r.indexOf("-") >= 0 || contactProfile.f42403c1 || !contactProfile.m40366G0() || synchronizedMap.containsKey(contactProfile.f42434r)) {
                    z16 = z14;
                } else if (!contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                    String mo2478b = contactProfile.mo2478b();
                    String m40383Q = contactProfile.m40383Q(z17, z18);
                    if (!z11 || contactProfile.f42382U0 != 0) {
                        if (z12) {
                            contactProfile.m40411j1(3);
                        }
                        contactProfile.f42405d1 = z18;
                        contactProfile.f42387W = 0.0f;
                        String[] m119971F = m119971F(m40383Q, z16);
                        arrayList4.clear();
                        ArrayList arrayList5 = new ArrayList();
                        String str4 = m40383Q;
                        m119998k(str, m119971F, contactProfile, arrayList4, z19, z14, arrayList5, false, true);
                        boolean z21 = !TextUtils.isEmpty(C18631a.m98446i().m98454g(contactProfile.f42434r));
                        if (contactProfile.f42387W > 0.0f) {
                            contactProfile.f42387W = 0.0f;
                            Map map2 = AbstractC23304d.f113425q;
                            int i13 = (!map2.containsKey(contactProfile.f42434r) || map2.get(contactProfile.f42434r) == null) ? 0 : ((C32093r8) map2.get(contactProfile.f42434r)).f147886c;
                            int i14 = 20;
                            if (i13 <= 20) {
                                i14 = i13;
                            }
                            int i15 = 0;
                            float f13 = 0.0f;
                            while (i15 < arrayList3.size()) {
                                try {
                                    C32093r8 c32093r8 = (C32093r8) arrayList3.get(i15);
                                    if (c32093r8 == null || !contactProfile.f42434r.equals(c32093r8.f147884a)) {
                                        str2 = str4;
                                    } else {
                                        str2 = str4;
                                        try {
                                            if (str2.equals(c32093r8.f147887d) && c32093r8.f147886c > 0) {
                                                float m120009v = m120009v(c32093r8.f147892i);
                                                ArrayList arrayList6 = c32093r8.f147893j;
                                                if (arrayList6 == null || arrayList6.isEmpty()) {
                                                    i12 = 0;
                                                    f12 = 0.0f;
                                                } else {
                                                    f12 = 0.0f;
                                                    int i16 = 0;
                                                    for (int i17 = 0; i17 < c32093r8.f147893j.size(); i17++) {
                                                        f12 += C23024b7.m118042N(currentTimeMillis - ((Long) c32093r8.f147893j.get(i17)).longValue()) * m120009v;
                                                        i16++;
                                                    }
                                                    i12 = i16;
                                                }
                                                if (i12 > 0) {
                                                    f13 = (i14 * f12) / i12;
                                                }
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            e.printStackTrace();
                                            i15++;
                                            str4 = str2;
                                        }
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    str2 = str4;
                                }
                                i15++;
                                str4 = str2;
                            }
                            contactProfile.f42387W += f13;
                            InviteContactProfile inviteContactProfile = new InviteContactProfile(ContactProfile.m40356w(contactProfile));
                            int size2 = arrayList4.size();
                            for (int i18 = 0; i18 < size2; i18++) {
                                inviteContactProfile.f42399a1.add(Integer.valueOf(((Integer) arrayList4.get(i18)).intValue()));
                            }
                            arrayList4.clear();
                            synchronizedMap.put(mo2478b, mo2478b);
                            String str5 = inviteContactProfile.f42437s;
                            inviteContactProfile.f42437s = null;
                            if (!TextUtils.isEmpty(contactProfile.f42460z1) && AbstractC23148n.m118841o()) {
                                inviteContactProfile.f42436r1 = new SpannableStringBuilder(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.prefix_username), contactProfile.f42460z1));
                            }
                            inviteContactProfile.f42437s = str5;
                            contactProfile.f42399a1.clear();
                            Map map3 = C19669z.f97573U;
                            inviteContactProfile.f42390X = (map3 == null || !map3.containsKey(inviteContactProfile.f42434r) || map3.get(inviteContactProfile.f42434r) == null) ? -1 : ((Integer) map3.get(inviteContactProfile.f42434r)).intValue();
                            arrayList2.add(inviteContactProfile);
                            j11 = currentTimeMillis;
                            f11 = 0.0f;
                        } else {
                            ContactProfile m40356w = ContactProfile.m40356w(contactProfile);
                            int i19 = 33;
                            if (z21) {
                                String str6 = m40356w.f42437s;
                                m40356w.f42437s = null;
                                String m40385R = m40356w.m40385R(true, false, false);
                                m40356w.f42437s = str6;
                                if (!TextUtils.isEmpty(m40385R)) {
                                    String[] m119971F2 = m119971F(m40385R, z14);
                                    arrayList4.clear();
                                    m40356w.f42439s1 = new SpannableStringBuilder();
                                    j11 = currentTimeMillis;
                                    f11 = 0.0f;
                                    m119999l(str, m119971F2, m40356w, arrayList4, z19, z14, arrayList5);
                                    if (m40356w.f42387W > 0.0f) {
                                        String format = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_search_result_from_phonebook), "");
                                        SpannableString spannableString = new SpannableString(m40385R.trim());
                                        for (int i21 = 0; i21 < arrayList4.size() - 1; i21 += 2) {
                                            try {
                                                if (((Integer) arrayList4.get(i21)).intValue() >= 0) {
                                                    int i22 = i21 + 1;
                                                    if (((Integer) arrayList4.get(i22)).intValue() > ((Integer) arrayList4.get(i21)).intValue()) {
                                                        i19 = 33;
                                                        try {
                                                            spannableString.setSpan(new ForegroundColorSpan(AbstractC1388a.m6961c(MainApplication.getAppContext(), AbstractC16801x.hignlight)), ((Integer) arrayList4.get(i21)).intValue(), ((Integer) arrayList4.get(i22)).intValue(), 33);
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            e.printStackTrace();
                                                            InviteContactProfile inviteContactProfile2 = new InviteContactProfile(ContactProfile.m40356w(contactProfile));
                                                            inviteContactProfile2.f42436r1 = new SpannableStringBuilder(TextUtils.concat(new SpannableString(format), spannableString));
                                                            size = arrayList4.size();
                                                            while (i11 < size) {
                                                            }
                                                            arrayList4.clear();
                                                            String str7 = contactProfile.f42434r;
                                                            synchronizedMap.put(str7, str7);
                                                            inviteContactProfile2.f42354L = m40385R;
                                                            contactProfile.f42399a1.clear();
                                                            contactProfile.f42401b1.clear();
                                                            m40356w.f42387W = 0.0f;
                                                            inviteContactProfile2.f42387W = 0.0f;
                                                            arrayList2.add(inviteContactProfile2);
                                                            if (z21) {
                                                            }
                                                            if (z19) {
                                                            }
                                                            if (contactProfile.f42387W <= f11) {
                                                            }
                                                            z16 = z14;
                                                            currentTimeMillis = j11;
                                                            z18 = false;
                                                            z17 = true;
                                                        }
                                                    }
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                i19 = 33;
                                            }
                                        }
                                        i19 = 33;
                                        InviteContactProfile inviteContactProfile22 = new InviteContactProfile(ContactProfile.m40356w(contactProfile));
                                        inviteContactProfile22.f42436r1 = new SpannableStringBuilder(TextUtils.concat(new SpannableString(format), spannableString));
                                        size = arrayList4.size();
                                        for (i11 = 0; i11 < size; i11++) {
                                            inviteContactProfile22.f42401b1.add(Integer.valueOf(((Integer) arrayList4.get(i11)).intValue()));
                                        }
                                        arrayList4.clear();
                                        String str72 = contactProfile.f42434r;
                                        synchronizedMap.put(str72, str72);
                                        inviteContactProfile22.f42354L = m40385R;
                                        contactProfile.f42399a1.clear();
                                        contactProfile.f42401b1.clear();
                                        m40356w.f42387W = 0.0f;
                                        inviteContactProfile22.f42387W = 0.0f;
                                        arrayList2.add(inviteContactProfile22);
                                        if (z21) {
                                            if (m40356w.f42387W > f11) {
                                            }
                                        }
                                        if (z19 && !TextUtils.isEmpty(contactProfile.f42460z1)) {
                                            contactProfile.f42387W = f11;
                                            String[] m118488a = C23013a7.m117989k(contactProfile.f42460z1, 0).m118488a();
                                            arrayList4.clear();
                                            m119997j(str, m118488a, contactProfile, arrayList4, z19, new ArrayList());
                                            if (contactProfile.f42387W > f11) {
                                                String[] m118488a2 = C23013a7.m117989k(str, 0).m118488a();
                                                String str8 = contactProfile.f42434r;
                                                synchronizedMap.put(str8, str8);
                                                InviteContactProfile inviteContactProfile3 = new InviteContactProfile(ContactProfile.m40356w(contactProfile));
                                                Map map4 = AbstractC23304d.f113421p;
                                                if (map4.containsKey(contactProfile.f42434r)) {
                                                    inviteContactProfile3.f42421l1 = ((C32093r8) map4.get(contactProfile.f42434r)).f147886c;
                                                    inviteContactProfile3.f42423m1 = ((C32093r8) map4.get(contactProfile.f42434r)).f147885b;
                                                }
                                                if (!TextUtils.isEmpty(contactProfile.f42460z1)) {
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                    inviteContactProfile3.f42436r1 = spannableStringBuilder;
                                                    spannableStringBuilder.append((CharSequence) "@");
                                                    inviteContactProfile3.f42436r1.setSpan(new ForegroundColorSpan(MainApplication.getAppContext().getResources().getColor(AbstractC16801x.hignlight)), 0, inviteContactProfile3.f42436r1.length(), i19);
                                                    inviteContactProfile3.f42436r1.append((CharSequence) AbstractC23217t2.m119654f(contactProfile.f42460z1, new ArrayList(Arrays.asList(m118488a2))));
                                                }
                                                contactProfile.f42399a1.clear();
                                                Map map5 = C19669z.f97573U;
                                                inviteContactProfile3.f42390X = (map5 == null || !map5.containsKey(inviteContactProfile3.f42434r) || map5.get(inviteContactProfile3.f42434r) == null) ? -1 : ((Integer) map5.get(inviteContactProfile3.f42434r)).intValue();
                                                arrayList2.add(inviteContactProfile3);
                                            }
                                        }
                                    } else {
                                        i19 = 33;
                                        if (z21) {
                                        }
                                        if (z19) {
                                            contactProfile.f42387W = f11;
                                            String[] m118488a3 = C23013a7.m117989k(contactProfile.f42460z1, 0).m118488a();
                                            arrayList4.clear();
                                            m119997j(str, m118488a3, contactProfile, arrayList4, z19, new ArrayList());
                                            if (contactProfile.f42387W > f11) {
                                            }
                                        }
                                    }
                                }
                            }
                            j11 = currentTimeMillis;
                            f11 = 0.0f;
                            if (z21) {
                            }
                            if (z19) {
                            }
                        }
                        if (contactProfile.f42387W <= f11) {
                            arrayList4.clear();
                        }
                        z16 = z14;
                        currentTimeMillis = j11;
                        z18 = false;
                        z17 = true;
                    }
                }
            }
            Collections.sort(arrayList2, ContactProfile.f42319Z1);
        } catch (Exception e15) {
            e15.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0595 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x0004, B:4:0x001a, B:6:0x0020, B:8:0x002f, B:10:0x0039, B:13:0x0044, B:14:0x0048, B:16:0x004e, B:18:0x0057, B:24:0x0060, B:26:0x006a, B:28:0x006e, B:35:0x0074, B:38:0x007f, B:40:0x0087, B:43:0x0090, B:45:0x0096, B:46:0x009f, B:48:0x00a5, B:51:0x00aa, B:53:0x00b2, B:54:0x00b5, B:57:0x00d1, B:60:0x00ed, B:62:0x00f3, B:64:0x0101, B:67:0x0123, B:70:0x0148, B:72:0x0168, B:75:0x0175, B:76:0x0185, B:78:0x0190, B:80:0x01a6, B:82:0x01ad, B:83:0x01b4, B:86:0x01ca, B:88:0x01d2, B:90:0x01d8, B:91:0x01f0, B:93:0x01f6, B:94:0x0208, B:96:0x0222, B:98:0x0233, B:100:0x023b, B:101:0x024b, B:103:0x0251, B:106:0x025c, B:108:0x0269, B:110:0x058e, B:112:0x0595, B:118:0x012a, B:121:0x0137, B:123:0x0143, B:124:0x0271, B:126:0x027b, B:128:0x028c, B:131:0x0298, B:133:0x02c9, B:135:0x02cf, B:137:0x02f3, B:139:0x02fa, B:141:0x0318, B:143:0x031e, B:144:0x0337, B:146:0x033d, B:147:0x0352, B:162:0x03bd, B:164:0x03e4, B:166:0x03fa, B:168:0x0401, B:169:0x0408, B:171:0x0435, B:174:0x043d, B:176:0x0445, B:178:0x046a, B:180:0x048d, B:181:0x04a5, B:183:0x04ad, B:185:0x04bb, B:187:0x04c1, B:189:0x04c9, B:190:0x050c, B:191:0x0536, B:193:0x0545, B:195:0x054d, B:196:0x055d, B:198:0x0563, B:201:0x0570, B:202:0x0580, B:204:0x0584, B:205:0x058b, B:212:0x03ba, B:226:0x009b, B:238:0x05a0, B:150:0x0370, B:152:0x0378, B:154:0x0384, B:156:0x039c), top: B:2:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0435 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x0004, B:4:0x001a, B:6:0x0020, B:8:0x002f, B:10:0x0039, B:13:0x0044, B:14:0x0048, B:16:0x004e, B:18:0x0057, B:24:0x0060, B:26:0x006a, B:28:0x006e, B:35:0x0074, B:38:0x007f, B:40:0x0087, B:43:0x0090, B:45:0x0096, B:46:0x009f, B:48:0x00a5, B:51:0x00aa, B:53:0x00b2, B:54:0x00b5, B:57:0x00d1, B:60:0x00ed, B:62:0x00f3, B:64:0x0101, B:67:0x0123, B:70:0x0148, B:72:0x0168, B:75:0x0175, B:76:0x0185, B:78:0x0190, B:80:0x01a6, B:82:0x01ad, B:83:0x01b4, B:86:0x01ca, B:88:0x01d2, B:90:0x01d8, B:91:0x01f0, B:93:0x01f6, B:94:0x0208, B:96:0x0222, B:98:0x0233, B:100:0x023b, B:101:0x024b, B:103:0x0251, B:106:0x025c, B:108:0x0269, B:110:0x058e, B:112:0x0595, B:118:0x012a, B:121:0x0137, B:123:0x0143, B:124:0x0271, B:126:0x027b, B:128:0x028c, B:131:0x0298, B:133:0x02c9, B:135:0x02cf, B:137:0x02f3, B:139:0x02fa, B:141:0x0318, B:143:0x031e, B:144:0x0337, B:146:0x033d, B:147:0x0352, B:162:0x03bd, B:164:0x03e4, B:166:0x03fa, B:168:0x0401, B:169:0x0408, B:171:0x0435, B:174:0x043d, B:176:0x0445, B:178:0x046a, B:180:0x048d, B:181:0x04a5, B:183:0x04ad, B:185:0x04bb, B:187:0x04c1, B:189:0x04c9, B:190:0x050c, B:191:0x0536, B:193:0x0545, B:195:0x054d, B:196:0x055d, B:198:0x0563, B:201:0x0570, B:202:0x0580, B:204:0x0584, B:205:0x058b, B:212:0x03ba, B:226:0x009b, B:238:0x05a0, B:150:0x0370, B:152:0x0378, B:154:0x0384, B:156:0x039c), top: B:2:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x046a A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x0004, B:4:0x001a, B:6:0x0020, B:8:0x002f, B:10:0x0039, B:13:0x0044, B:14:0x0048, B:16:0x004e, B:18:0x0057, B:24:0x0060, B:26:0x006a, B:28:0x006e, B:35:0x0074, B:38:0x007f, B:40:0x0087, B:43:0x0090, B:45:0x0096, B:46:0x009f, B:48:0x00a5, B:51:0x00aa, B:53:0x00b2, B:54:0x00b5, B:57:0x00d1, B:60:0x00ed, B:62:0x00f3, B:64:0x0101, B:67:0x0123, B:70:0x0148, B:72:0x0168, B:75:0x0175, B:76:0x0185, B:78:0x0190, B:80:0x01a6, B:82:0x01ad, B:83:0x01b4, B:86:0x01ca, B:88:0x01d2, B:90:0x01d8, B:91:0x01f0, B:93:0x01f6, B:94:0x0208, B:96:0x0222, B:98:0x0233, B:100:0x023b, B:101:0x024b, B:103:0x0251, B:106:0x025c, B:108:0x0269, B:110:0x058e, B:112:0x0595, B:118:0x012a, B:121:0x0137, B:123:0x0143, B:124:0x0271, B:126:0x027b, B:128:0x028c, B:131:0x0298, B:133:0x02c9, B:135:0x02cf, B:137:0x02f3, B:139:0x02fa, B:141:0x0318, B:143:0x031e, B:144:0x0337, B:146:0x033d, B:147:0x0352, B:162:0x03bd, B:164:0x03e4, B:166:0x03fa, B:168:0x0401, B:169:0x0408, B:171:0x0435, B:174:0x043d, B:176:0x0445, B:178:0x046a, B:180:0x048d, B:181:0x04a5, B:183:0x04ad, B:185:0x04bb, B:187:0x04c1, B:189:0x04c9, B:190:0x050c, B:191:0x0536, B:193:0x0545, B:195:0x054d, B:196:0x055d, B:198:0x0563, B:201:0x0570, B:202:0x0580, B:204:0x0584, B:205:0x058b, B:212:0x03ba, B:226:0x009b, B:238:0x05a0, B:150:0x0370, B:152:0x0378, B:154:0x0384, B:156:0x039c), top: B:2:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0563 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x0004, B:4:0x001a, B:6:0x0020, B:8:0x002f, B:10:0x0039, B:13:0x0044, B:14:0x0048, B:16:0x004e, B:18:0x0057, B:24:0x0060, B:26:0x006a, B:28:0x006e, B:35:0x0074, B:38:0x007f, B:40:0x0087, B:43:0x0090, B:45:0x0096, B:46:0x009f, B:48:0x00a5, B:51:0x00aa, B:53:0x00b2, B:54:0x00b5, B:57:0x00d1, B:60:0x00ed, B:62:0x00f3, B:64:0x0101, B:67:0x0123, B:70:0x0148, B:72:0x0168, B:75:0x0175, B:76:0x0185, B:78:0x0190, B:80:0x01a6, B:82:0x01ad, B:83:0x01b4, B:86:0x01ca, B:88:0x01d2, B:90:0x01d8, B:91:0x01f0, B:93:0x01f6, B:94:0x0208, B:96:0x0222, B:98:0x0233, B:100:0x023b, B:101:0x024b, B:103:0x0251, B:106:0x025c, B:108:0x0269, B:110:0x058e, B:112:0x0595, B:118:0x012a, B:121:0x0137, B:123:0x0143, B:124:0x0271, B:126:0x027b, B:128:0x028c, B:131:0x0298, B:133:0x02c9, B:135:0x02cf, B:137:0x02f3, B:139:0x02fa, B:141:0x0318, B:143:0x031e, B:144:0x0337, B:146:0x033d, B:147:0x0352, B:162:0x03bd, B:164:0x03e4, B:166:0x03fa, B:168:0x0401, B:169:0x0408, B:171:0x0435, B:174:0x043d, B:176:0x0445, B:178:0x046a, B:180:0x048d, B:181:0x04a5, B:183:0x04ad, B:185:0x04bb, B:187:0x04c1, B:189:0x04c9, B:190:0x050c, B:191:0x0536, B:193:0x0545, B:195:0x054d, B:196:0x055d, B:198:0x0563, B:201:0x0570, B:202:0x0580, B:204:0x0584, B:205:0x058b, B:212:0x03ba, B:226:0x009b, B:238:0x05a0, B:150:0x0370, B:152:0x0378, B:154:0x0384, B:156:0x039c), top: B:2:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0584 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:3:0x0004, B:4:0x001a, B:6:0x0020, B:8:0x002f, B:10:0x0039, B:13:0x0044, B:14:0x0048, B:16:0x004e, B:18:0x0057, B:24:0x0060, B:26:0x006a, B:28:0x006e, B:35:0x0074, B:38:0x007f, B:40:0x0087, B:43:0x0090, B:45:0x0096, B:46:0x009f, B:48:0x00a5, B:51:0x00aa, B:53:0x00b2, B:54:0x00b5, B:57:0x00d1, B:60:0x00ed, B:62:0x00f3, B:64:0x0101, B:67:0x0123, B:70:0x0148, B:72:0x0168, B:75:0x0175, B:76:0x0185, B:78:0x0190, B:80:0x01a6, B:82:0x01ad, B:83:0x01b4, B:86:0x01ca, B:88:0x01d2, B:90:0x01d8, B:91:0x01f0, B:93:0x01f6, B:94:0x0208, B:96:0x0222, B:98:0x0233, B:100:0x023b, B:101:0x024b, B:103:0x0251, B:106:0x025c, B:108:0x0269, B:110:0x058e, B:112:0x0595, B:118:0x012a, B:121:0x0137, B:123:0x0143, B:124:0x0271, B:126:0x027b, B:128:0x028c, B:131:0x0298, B:133:0x02c9, B:135:0x02cf, B:137:0x02f3, B:139:0x02fa, B:141:0x0318, B:143:0x031e, B:144:0x0337, B:146:0x033d, B:147:0x0352, B:162:0x03bd, B:164:0x03e4, B:166:0x03fa, B:168:0x0401, B:169:0x0408, B:171:0x0435, B:174:0x043d, B:176:0x0445, B:178:0x046a, B:180:0x048d, B:181:0x04a5, B:183:0x04ad, B:185:0x04bb, B:187:0x04c1, B:189:0x04c9, B:190:0x050c, B:191:0x0536, B:193:0x0545, B:195:0x054d, B:196:0x055d, B:198:0x0563, B:201:0x0570, B:202:0x0580, B:204:0x0584, B:205:0x058b, B:212:0x03ba, B:226:0x009b, B:238:0x05a0, B:150:0x0370, B:152:0x0378, B:154:0x0384, B:156:0x039c), top: B:2:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x057e  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m119979N(String str, List list, List list2, Map map, List list3, int i11, InterfaceC19305a interfaceC19305a) {
        boolean z11;
        String m40383Q;
        int i12;
        ContactProfile contactProfile;
        ContactProfile contactProfile2;
        String str2;
        StringBuilder sb2;
        float f11;
        Map map2;
        int i13;
        StringBuilder sb3;
        String str3;
        int i14;
        String str4;
        String str5;
        StringBuilder sb4;
        int i15;
        String str6;
        String str7;
        String str8;
        List list4 = list2;
        try {
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            ArrayList arrayList = new ArrayList();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String str9 = ((ContactProfile) it.next()).f42434r;
                synchronizedMap.put(str9, str9);
            }
            boolean z12 = true;
            boolean z13 = false;
            if (m120010w(i11, 32) && m120000m(str)) {
                z11 = true;
            } else {
                z11 = false;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ContactProfile contactProfile3 = (ContactProfile) it2.next();
                if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
                    return;
                }
                if (contactProfile3 != null && !contactProfile3.f42434r.contains("-") && !contactProfile3.f42403c1 && contactProfile3.m40366G0()) {
                    if (!contactProfile3.f42434r.equals(CoreUtility.f89233i) && (m120010w(i11, 64) || !synchronizedMap.containsKey(contactProfile3.f42434r))) {
                        if (m120010w(i11, 64)) {
                            m40383Q = contactProfile3.mo2475c();
                        } else {
                            m40383Q = contactProfile3.m40383Q(z12, z13);
                        }
                        if (!m120010w(i11, z12 ? 1 : 0) || contactProfile3.f42382U0 != 0) {
                            if (m120010w(i11, 2)) {
                                contactProfile3.m40411j1(3);
                            }
                            contactProfile3.f42405d1 = z13;
                            contactProfile3.f42387W = 0.0f;
                            arrayList.clear();
                            contactProfile3.f42439s1 = new SpannableStringBuilder();
                            ArrayList arrayList2 = new ArrayList();
                            int i16 = i11 | 256;
                            if (z11) {
                                i12 = 128;
                            } else {
                                i12 = 0;
                            }
                            ArrayList arrayList3 = arrayList2;
                            m119994g(str, m40383Q, contactProfile3, arrayList, arrayList3, i16 | i12);
                            StringBuilder sb5 = new StringBuilder();
                            if (C19322f1.f95953d) {
                                int i17 = 0;
                                while (i17 < arrayList3.size()) {
                                    ArrayList arrayList4 = arrayList3;
                                    arrayList4.set(i17, Float.valueOf(0.0f));
                                    i17++;
                                    arrayList3 = arrayList4;
                                }
                            }
                            ArrayList arrayList5 = arrayList3;
                            boolean z14 = !TextUtils.isEmpty(C18631a.m98446i().m98454g(contactProfile3.f42434r));
                            if (contactProfile3.f42387W > 0.0f) {
                                if (!contactProfile3.m40374K0() && !C21927m.m114302u().m114318P(contactProfile3.f42434r) && !C18644n.m98531l().m98558u(contactProfile3.f42434r)) {
                                    contactProfile3.f42387W = 0.1f;
                                }
                                contactProfile = contactProfile3;
                                contactProfile.f42387W += C23024b7.m118038J(contactProfile3.f42434r, m40383Q, list3, currentTimeMillis, i11, null);
                                if (C19322f1.f95953d) {
                                    sb4 = sb5;
                                    if (sb5.length() != 0) {
                                        str8 = ", ";
                                    } else {
                                        str8 = "";
                                    }
                                    sb4.append(str8);
                                    sb4.append("total: ");
                                    sb4.append(contactProfile.f42387W);
                                } else {
                                    sb4 = sb5;
                                }
                                ContactProfile m40356w = ContactProfile.m40356w(contactProfile);
                                int size = arrayList.size();
                                for (int i18 = 0; i18 < size; i18++) {
                                    m40356w.f42399a1.add(Integer.valueOf(((Integer) arrayList.get(i18)).intValue()));
                                }
                                arrayList.clear();
                                if (C19322f1.f95953d) {
                                    m40356w.m40401d1(sb4.toString());
                                }
                                String str10 = contactProfile.f42434r;
                                synchronizedMap.put(str10, str10);
                                String str11 = m40356w.f42437s;
                                m40356w.f42437s = null;
                                String m40385R = m40356w.m40385R(true, z13, z13);
                                if (!TextUtils.isEmpty(m40385R) && z14) {
                                    if (TextUtils.isEmpty(m40356w.f42460z1) || !AbstractC23309i.m122577xf()) {
                                        str7 = "";
                                    } else {
                                        String string = MainApplication.getAppContext().getString(AbstractC8020f0.prefix_username);
                                        Object[] objArr = new Object[1];
                                        objArr[z13 ? 1 : 0] = m40356w.f42460z1;
                                        str7 = String.format(string, objArr);
                                    }
                                    if (!TextUtils.isEmpty(str7)) {
                                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_name_with_dot_separate);
                                        Object[] objArr2 = new Object[2];
                                        objArr2[z13 ? 1 : 0] = m40385R;
                                        objArr2[1] = str7;
                                        m40385R = String.format(m118743r0, objArr2);
                                    }
                                    String string2 = MainApplication.getAppContext().getString(AbstractC8020f0.str_change_alias_gsearch_prf_phonename);
                                    Object[] objArr3 = new Object[1];
                                    objArr3[z13 ? 1 : 0] = m40385R;
                                    m40356w.f42436r1 = new SpannableStringBuilder(String.format(string2, objArr3));
                                }
                                m40356w.f42437s = str11;
                                contactProfile.f42399a1.clear();
                                Map map3 = C19669z.f97573U;
                                if (map3.containsKey(m40356w.f42434r) && map3.get(m40356w.f42434r) != null) {
                                    i15 = ((Integer) map3.get(m40356w.f42434r)).intValue();
                                } else {
                                    i15 = -1;
                                }
                                m40356w.f42390X = i15;
                                if (C19322f1.f95953d) {
                                    if (sb4.length() != 0) {
                                        str6 = ", ";
                                    } else {
                                        str6 = "";
                                    }
                                    sb4.append(str6);
                                    sb4.append("position msg: ");
                                    sb4.append(m40356w.f42390X);
                                }
                                list4.add(m40356w);
                            } else {
                                contactProfile = contactProfile3;
                                StringBuilder sb6 = sb5;
                                ContactProfile m40356w2 = ContactProfile.m40356w(contactProfile);
                                if (z14) {
                                    String str12 = m40356w2.f42437s;
                                    m40356w2.f42437s = null;
                                    String m40385R2 = m40356w2.m40385R(true, z13, z13);
                                    m40356w2.f42437s = str12;
                                    if (!TextUtils.isEmpty(m40385R2)) {
                                        if (m120010w(i11, 16)) {
                                            i14 = 16;
                                        } else {
                                            i14 = 0;
                                        }
                                        String[] m118488a = C23282z6.m120367c(m40385R2, i14 | 16384).m118488a();
                                        arrayList.clear();
                                        m40356w2.f42439s1 = new SpannableStringBuilder();
                                        str2 = "position msg: ";
                                        m119999l(str, m118488a, m40356w2, arrayList, z11, m120010w(i11, 16), arrayList5);
                                        if (C19322f1.f95953d && arrayList5.size() == 2) {
                                            sb6 = sb6;
                                            sb6.append("1: ");
                                            sb6.append(arrayList5.get(0));
                                            sb6.append(" - 2: ");
                                            sb6.append(arrayList5.get(1));
                                        } else {
                                            sb6 = sb6;
                                        }
                                        if (m40356w2.f42387W > 0.0f) {
                                            contactProfile2 = m40356w2;
                                            sb2 = sb6;
                                            contactProfile2.f42387W += C23024b7.m118038J(m40356w2.f42434r, null, list3, currentTimeMillis, i11, null);
                                            if (TextUtils.isEmpty(contactProfile2.f42460z1) || !AbstractC23309i.m122577xf()) {
                                                str4 = "";
                                            } else {
                                                str4 = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.prefix_username), contactProfile2.f42460z1);
                                            }
                                            if (!TextUtils.isEmpty(str4)) {
                                                str5 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_name_with_dot_separate), m40385R2, str4);
                                            } else {
                                                str5 = m40385R2;
                                            }
                                            String format = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_change_alias_gsearch_prf_phonename), "");
                                            SpannableString spannableString = new SpannableString(str5.trim());
                                            for (int i19 = 0; i19 < arrayList.size() - 1; i19 += 2) {
                                                try {
                                                    if (((Integer) arrayList.get(i19)).intValue() >= 0) {
                                                        int i21 = i19 + 1;
                                                        if (((Integer) arrayList.get(i21)).intValue() > ((Integer) arrayList.get(i19)).intValue()) {
                                                            AbstractC23217t2.m119663o(spannableString, ((Integer) arrayList.get(i19)).intValue(), ((Integer) arrayList.get(i21)).intValue(), 0);
                                                        }
                                                    }
                                                } catch (Exception e11) {
                                                    e11.printStackTrace();
                                                }
                                            }
                                            ContactProfile m40356w3 = ContactProfile.m40356w(contactProfile);
                                            m40356w3.f42436r1 = new SpannableStringBuilder(TextUtils.concat(new SpannableString(format), spannableString));
                                            m40356w3.f42365O1 = 3;
                                            int size2 = arrayList.size();
                                            for (int i22 = 0; i22 < size2; i22++) {
                                                m40356w3.f42401b1.add(Integer.valueOf(((Integer) arrayList.get(i22)).intValue()));
                                            }
                                            arrayList.clear();
                                            if (C19322f1.f95953d) {
                                                m40356w3.m40401d1(sb2.toString());
                                            }
                                            String str13 = contactProfile.f42434r;
                                            synchronizedMap.put(str13, str13);
                                            m40356w3.f42354L = m40385R2;
                                            contactProfile.f42399a1.clear();
                                            contactProfile.f42401b1.clear();
                                            float f12 = contactProfile2.f42387W;
                                            f11 = 0.0f;
                                            contactProfile2.f42387W = 0.0f;
                                            m40356w3.f42387W = f12;
                                            list4 = list2;
                                            list4.add(m40356w3);
                                            if ((z14 || contactProfile2.f42387W <= f11) && z11 && !TextUtils.isEmpty(contactProfile.f42460z1)) {
                                                contactProfile.f42387W = f11;
                                                String[] m118488a2 = C23282z6.m120367c(contactProfile.f42460z1, 8192).m118488a();
                                                arrayList.clear();
                                                m119997j(str, m118488a2, contactProfile, arrayList, true, new ArrayList());
                                                if (contactProfile.f42387W > f11) {
                                                    String[] m118488a3 = C23282z6.m120367c(str, 8192).m118488a();
                                                    String str14 = contactProfile.f42434r;
                                                    synchronizedMap.put(str14, str14);
                                                    ContactProfile m40356w4 = ContactProfile.m40356w(contactProfile);
                                                    m40356w4.f42387W = contactProfile.f42387W;
                                                    Map map4 = AbstractC23304d.f113421p;
                                                    if (map4.containsKey(contactProfile.f42434r)) {
                                                        m40356w4.f42421l1 = ((C32093r8) map4.get(contactProfile.f42434r)).f147886c;
                                                        m40356w4.f42423m1 = ((C32093r8) map4.get(contactProfile.f42434r)).f147885b;
                                                    }
                                                    if (!TextUtils.isEmpty(contactProfile.f42460z1)) {
                                                        String m40385R3 = contactProfile2.m40385R(true, false, false);
                                                        if (!TextUtils.isEmpty(contactProfile2.f42437s) && !TextUtils.isEmpty(m40385R3) && !contactProfile2.f42437s.equals(m40385R3)) {
                                                            m40356w4.f42436r1 = new SpannableStringBuilder(TextUtils.concat(new SpannableString(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_change_alias_gsearch_prf_phonename), "")), String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_name_with_dot_separate), m40385R3, contactProfile.f42460z1)));
                                                        } else {
                                                            m40356w4.f42439s1 = new SpannableStringBuilder(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.prefix_username), AbstractC23217t2.m119652d(contactProfile.f42460z1, new ArrayList(Arrays.asList(m118488a3)), 0)));
                                                            contactProfile.f42399a1.clear();
                                                            map2 = C19669z.f97573U;
                                                            if (!map2.containsKey(m40356w4.f42434r) && map2.get(m40356w4.f42434r) != null) {
                                                                i13 = ((Integer) map2.get(m40356w4.f42434r)).intValue();
                                                            } else {
                                                                i13 = -1;
                                                            }
                                                            m40356w4.f42390X = i13;
                                                            if (!C19322f1.f95953d) {
                                                                sb3 = sb2;
                                                                if (sb2.length() != 0) {
                                                                    str3 = ", ";
                                                                } else {
                                                                    str3 = "";
                                                                }
                                                                sb3.append(str3);
                                                                sb3.append(str2);
                                                                sb3.append(m40356w4.f42390X);
                                                            } else {
                                                                sb3 = sb2;
                                                            }
                                                            if (C19322f1.f95953d) {
                                                                m40356w4.m40401d1(sb3.toString());
                                                            }
                                                            list4.add(m40356w4);
                                                            if (contactProfile.f42387W <= 0.0f) {
                                                                arrayList.clear();
                                                            }
                                                            z12 = true;
                                                            z13 = false;
                                                        }
                                                    }
                                                    contactProfile.f42399a1.clear();
                                                    map2 = C19669z.f97573U;
                                                    if (!map2.containsKey(m40356w4.f42434r)) {
                                                    }
                                                    i13 = -1;
                                                    m40356w4.f42390X = i13;
                                                    if (!C19322f1.f95953d) {
                                                    }
                                                    if (C19322f1.f95953d) {
                                                    }
                                                    list4.add(m40356w4);
                                                    if (contactProfile.f42387W <= 0.0f) {
                                                    }
                                                    z12 = true;
                                                    z13 = false;
                                                }
                                            }
                                        } else {
                                            list4 = list2;
                                            contactProfile2 = m40356w2;
                                            sb2 = sb6;
                                            f11 = 0.0f;
                                            if (z14) {
                                            }
                                            contactProfile.f42387W = f11;
                                            String[] m118488a22 = C23282z6.m120367c(contactProfile.f42460z1, 8192).m118488a();
                                            arrayList.clear();
                                            m119997j(str, m118488a22, contactProfile, arrayList, true, new ArrayList());
                                            if (contactProfile.f42387W > f11) {
                                            }
                                        }
                                    } else {
                                        list4 = list2;
                                    }
                                }
                                contactProfile2 = m40356w2;
                                str2 = "position msg: ";
                                sb2 = sb6;
                                f11 = 0.0f;
                                if (z14) {
                                }
                                contactProfile.f42387W = f11;
                                String[] m118488a222 = C23282z6.m120367c(contactProfile.f42460z1, 8192).m118488a();
                                arrayList.clear();
                                m119997j(str, m118488a222, contactProfile, arrayList, true, new ArrayList());
                                if (contactProfile.f42387W > f11) {
                                }
                            }
                            if (contactProfile.f42387W <= 0.0f) {
                            }
                            z12 = true;
                            z13 = false;
                        }
                    }
                }
            }
            Collections.sort(list4, ContactProfile.f42319Z1);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: O */
    public static void m119980O(String str, List list, List list2, boolean z11, boolean z12, Map map, List list3, boolean z13, boolean z14, InterfaceC19305a interfaceC19305a) {
        int i11;
        if (z12) {
            i11 = (z11 ? 1 : 0) | 2;
        } else {
            i11 = z11 ? 1 : 0;
        }
        if (z13) {
            i11 |= 32;
        }
        if (z14) {
            i11 |= 4;
        }
        m119979N(str, list, list2, map, list3, i11, interfaceC19305a);
    }

    /* renamed from: P */
    public static void m119981P(String str, List list, Map map, List list2, int i11, InterfaceC19305a interfaceC19305a) {
        StringBuilder sb2;
        int i12;
        String str2;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = ((ContactProfile) it.next()).f42434r;
                synchronizedMap.put(str3, str3);
            }
            for (C31973j5 c31973j5 : C0943w.m4462l().m4475i()) {
                if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
                    return;
                }
                if (c31973j5 != null && !TextUtils.isEmpty(c31973j5.m153781r())) {
                    ContactProfile contactProfile = new ContactProfile("group_" + c31973j5.m153781r());
                    contactProfile.f42437s = c31973j5.m153793y();
                    if (c31973j5.m153786t0()) {
                        contactProfile.f42446v = c31973j5.m153756e();
                    }
                    if (!synchronizedMap.containsKey(contactProfile.f42434r) && (!m120010w(i11, 1) || contactProfile.f42382U0 != 0)) {
                        if (m120010w(i11, 2)) {
                            contactProfile.m40411j1(3);
                        }
                        contactProfile.f42405d1 = false;
                        contactProfile.f42387W = 0.0f;
                        String m40383Q = contactProfile.m40383Q(true, false);
                        arrayList.clear();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = arrayList2;
                        m119994g(str, m40383Q, contactProfile, arrayList, arrayList2, i11);
                        StringBuilder sb3 = new StringBuilder();
                        if (contactProfile.f42387W > 0.0f && !synchronizedMap.containsKey(contactProfile.f42434r) && !contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                            if (C19322f1.f95953d) {
                                int i13 = 0;
                                while (i13 < arrayList3.size()) {
                                    ArrayList arrayList4 = arrayList3;
                                    arrayList4.set(i13, Float.valueOf(0.0f));
                                    i13++;
                                    arrayList3 = arrayList4;
                                }
                            }
                            contactProfile.f42387W += C23024b7.m118038J(contactProfile.f42434r, null, list2, currentTimeMillis, i11, null);
                            String str4 = "";
                            if (C19322f1.f95953d) {
                                if (sb3.length() != 0) {
                                    sb2 = sb3;
                                    str2 = ", ";
                                } else {
                                    sb2 = sb3;
                                    str2 = "";
                                }
                                sb2.append(str2);
                                sb2.append("total: ");
                                sb2.append(contactProfile.f42387W);
                            } else {
                                sb2 = sb3;
                            }
                            int size = arrayList.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                contactProfile.f42399a1.add(Integer.valueOf(((Integer) arrayList.get(i14)).intValue()));
                            }
                            arrayList.clear();
                            Map map2 = C19669z.f97573U;
                            if (map2.containsKey(contactProfile.f42434r) && map2.get(contactProfile.f42434r) != null) {
                                i12 = ((Integer) map2.get(contactProfile.f42434r)).intValue();
                            } else {
                                i12 = -1;
                            }
                            contactProfile.f42390X = i12;
                            if (C19322f1.f95953d) {
                                if (sb2.length() != 0) {
                                    str4 = ", ";
                                }
                                sb2.append(str4);
                                sb2.append("position msg: ");
                                sb2.append(contactProfile.f42390X);
                            }
                            if (C19322f1.f95953d) {
                                contactProfile.m40401d1(sb2.toString());
                            }
                            list.add(contactProfile);
                        } else {
                            arrayList.clear();
                        }
                    }
                }
            }
            Collections.sort(list, ContactProfile.f42319Z1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:            r8 = r8;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m119982Q(String str, List list, boolean z11, boolean z12, Map map, List list2, InterfaceC19305a interfaceC19305a) {
        boolean z13;
        if (z12) {
            z13 = (z11 ? 1 : 0) | 2;
        }
        m119981P(str, list, map, list2, z13, interfaceC19305a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0140, code lost:            if (android.text.TextUtils.isEmpty(r6.f42354L) != false) goto L229;     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0148, code lost:            if (r6.f42401b1.isEmpty() != false) goto L229;     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x014a, code lost:            r9 = 1;        r7 = new android.text.SpannableString(r6.m40385R(true, false, false).trim());     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0159, code lost:            r0 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0161, code lost:            if (r0 >= (r6.f42401b1.size() - r9)) goto L323;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x016f, code lost:            if (((java.lang.Integer) r6.f42401b1.get(r0)).intValue() < 0) goto L324;     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0171, code lost:            r9 = r0 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x018b, code lost:            if (((java.lang.Integer) r6.f42401b1.get(r9)).intValue() <= ((java.lang.Integer) r6.f42401b1.get(r0)).intValue()) goto L325;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x018d, code lost:            me0.AbstractC23217t2.m119663o(r7, ((java.lang.Integer) r6.f42401b1.get(r0)).intValue(), ((java.lang.Integer) r6.f42401b1.get(r9)).intValue(), 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ac, code lost:            r0 = r0 + 2;        r9 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01aa, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01b0, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01b4, code lost:            r9 = 1;        r7 = new android.text.SpannableString(r6.m40383Q(true, false).trim());     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01c3, code lost:            r0 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01cb, code lost:            if (r0 >= (r6.f42399a1.size() - r9)) goto L327;     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d9, code lost:            if (((java.lang.Integer) r6.f42399a1.get(r0)).intValue() < 0) goto L328;     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01db, code lost:            r9 = r0 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01f5, code lost:            if (((java.lang.Integer) r6.f42399a1.get(r9)).intValue() <= ((java.lang.Integer) r6.f42399a1.get(r0)).intValue()) goto L329;     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01f7, code lost:            me0.AbstractC23217t2.m119663o(r7, ((java.lang.Integer) r6.f42399a1.get(r0)).intValue(), ((java.lang.Integer) r6.f42399a1.get(r9)).intValue(), 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0216, code lost:            r0 = r0 + 2;        r9 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0214, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x021a, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:            if (r6.f42399a1.isEmpty() == false) goto L211;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ef, code lost:            if (r6.f42401b1.isEmpty() == false) goto L211;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:            r8 = new java.lang.StringBuilder();        r18 = r14;        r8.append(com.zing.zalo.MainApplication.getAppContext().getResources().getString(com.zing.zalo.AbstractC8020f0.member_result_in_group));        r8.append(" ");        r15.f42436r1 = new android.text.SpannableStringBuilder(android.text.TextUtils.concat(new android.text.SpannableString(r8.toString()), r6.m40385R(true, false, android.text.TextUtils.isEmpty(r15.f42354L)).trim()));     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0138, code lost:            r18 = r14;     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m119983R(List list, List list2, boolean z11, boolean z12, Map map, List list3, InterfaceC19305a interfaceC19305a) {
        C31973j5 c31973j5;
        Iterator it;
        ContactProfile contactProfile;
        int i11;
        String str;
        String str2;
        String str3;
        SpannableString spannableString;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str4 = ((ContactProfile) it2.next()).f42434r;
                synchronizedMap.put(str4, str4);
            }
            Iterator it3 = C0943w.m4462l().m4475i().iterator();
            while (it3.hasNext()) {
                if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
                    return;
                }
                c31973j5 = (C31973j5) it3.next();
                if (c31973j5 != null && !TextUtils.isEmpty(c31973j5.m153781r())) {
                    if (!synchronizedMap.containsKey("group_" + c31973j5.m153781r())) {
                        if (c31973j5.m153740S() <= 0) {
                            contactProfile = new ContactProfile("group_" + c31973j5.m153781r());
                            contactProfile.f42437s = c31973j5.m153793y();
                            if (c31973j5.m153786t0()) {
                                contactProfile.f42446v = c31973j5.m153756e();
                            }
                            if (!z11 || contactProfile.f42382U0 != 0) {
                                if (z12) {
                                    contactProfile.m40411j1(3);
                                }
                                contactProfile.f42405d1 = false;
                                contactProfile.f42387W = 0.0f;
                                C32076q5 m4476k = C0943w.m4462l().m4476k(c31973j5.m153781r());
                                Iterator it4 = list2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        ContactProfile contactProfile2 = (ContactProfile) it4.next();
                                        if (m4476k.m154725n(contactProfile2.f42434r)) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        break;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                if (contactProfile.f42387W <= 0.0f && !contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                                    String str5 = "";
                                    if (C19322f1.f95953d) {
                                        if (sb2.length() == 0) {
                                            str3 = "";
                                        } else {
                                            str3 = ", ";
                                        }
                                        sb2.append(str3);
                                        sb2.append("1: ");
                                        sb2.append(contactProfile.f42387W);
                                    }
                                    contactProfile.f42365O1 = 4;
                                    float m118038J = C23024b7.m118038J(contactProfile.f42434r, null, list3, currentTimeMillis, 0, null);
                                    contactProfile.f42387W += m118038J;
                                    if (C19322f1.f95953d) {
                                        if (sb2.length() == 0) {
                                            str2 = "";
                                        } else {
                                            str2 = ", ";
                                        }
                                        sb2.append(str2);
                                        sb2.append("3: ");
                                        sb2.append(m118038J);
                                    }
                                    if (C19322f1.f95953d) {
                                        if (sb2.length() == 0) {
                                            str = "";
                                        } else {
                                            str = ", ";
                                        }
                                        sb2.append(str);
                                        sb2.append("total: ");
                                        sb2.append(contactProfile.f42387W);
                                    }
                                    int size = arrayList.size();
                                    for (int i12 = 0; i12 < size; i12++) {
                                        contactProfile.f42399a1.add(Integer.valueOf(((Integer) arrayList.get(i12)).intValue()));
                                    }
                                    arrayList.clear();
                                    Map map2 = C19669z.f97573U;
                                    if (map2.containsKey(contactProfile.f42434r) && map2.get(contactProfile.f42434r) != null) {
                                        i11 = ((Integer) map2.get(contactProfile.f42434r)).intValue();
                                    } else {
                                        i11 = -1;
                                    }
                                    contactProfile.f42390X = i11;
                                    contactProfile.f42396Z = contactProfile.f42437s.length();
                                    contactProfile.f42393Y = true;
                                    if (C19322f1.f95953d) {
                                        if (sb2.length() != 0) {
                                            str5 = ", ";
                                        }
                                        sb2.append(str5);
                                        sb2.append("position msg: ");
                                        sb2.append(contactProfile.f42390X);
                                    }
                                    if (C19322f1.f95953d) {
                                        contactProfile.m40401d1(sb2.toString());
                                    }
                                    list.add(contactProfile);
                                } else {
                                    arrayList.clear();
                                }
                                it3 = it;
                            }
                        }
                    }
                }
                it = it3;
                it3 = it;
            }
            Collections.sort(list, ContactProfile.f42319Z1);
            return;
            contactProfile.f42436r1 = new SpannableStringBuilder(TextUtils.concat(new SpannableString(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.member_result_in_group) + " "), spannableString));
            contactProfile.f42387W = 1.0f;
            contactProfile.f42365O1 = 4;
            contactProfile.f42371Q1 = m120002o(contactProfile.m40383Q(true, false).trim()).toLowerCase();
            synchronizedMap.put("group_" + c31973j5.m153781r(), "group_" + c31973j5.m153781r());
            StringBuilder sb22 = new StringBuilder();
            if (contactProfile.f42387W <= 0.0f) {
            }
            arrayList.clear();
            it3 = it;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:            if (r5.f42403c1 != false) goto L565;     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x038e A[Catch: Exception -> 0x0042, LOOP:5: B:160:0x038c->B:161:0x038e, LOOP_END, TryCatch #5 {Exception -> 0x0042, blocks: (B:3:0x001e, B:4:0x0030, B:6:0x0036, B:9:0x0047, B:10:0x0050, B:11:0x0054, B:13:0x005a, B:15:0x0063, B:264:0x006e, B:266:0x0076, B:268:0x007e, B:31:0x0092, B:34:0x0096, B:36:0x009c, B:42:0x00a3, B:45:0x00ac, B:48:0x00b1, B:52:0x00bc, B:55:0x00cb, B:58:0x00d0, B:60:0x00db, B:61:0x00de, B:64:0x0109, B:66:0x010f, B:68:0x011a, B:70:0x0122, B:72:0x012c, B:75:0x0139, B:78:0x015e, B:80:0x0179, B:83:0x0183, B:85:0x018e, B:87:0x0192, B:90:0x019c, B:92:0x01a9, B:94:0x01b4, B:96:0x01ce, B:98:0x01dd, B:100:0x01e5, B:101:0x01f3, B:103:0x01f9, B:106:0x0201, B:107:0x020c, B:109:0x0210, B:110:0x0217, B:115:0x0140, B:118:0x014d, B:120:0x0159, B:121:0x0226, B:123:0x023e, B:125:0x0254, B:127:0x025a, B:129:0x0284, B:131:0x02a8, B:133:0x02ae, B:134:0x02c7, B:136:0x02cd, B:137:0x02e2, B:158:0x0364, B:159:0x0367, B:161:0x038e, B:163:0x03a4, B:165:0x03c1, B:167:0x03c9, B:169:0x03d1, B:170:0x03df, B:172:0x03e5, B:175:0x03ed, B:176:0x03f8, B:178:0x03fc, B:179:0x0403, B:196:0x0410, B:198:0x0422, B:200:0x045e, B:217:0x04b8, B:218:0x04bb, B:220:0x04cc, B:222:0x04e2, B:224:0x0503, B:226:0x050b, B:227:0x0519, B:229:0x051f, B:232:0x0527, B:233:0x0532, B:235:0x0536, B:236:0x053d, B:250:0x00c4, B:23:0x0087, B:277:0x0567, B:279:0x056d), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e5 A[Catch: Exception -> 0x0042, TryCatch #5 {Exception -> 0x0042, blocks: (B:3:0x001e, B:4:0x0030, B:6:0x0036, B:9:0x0047, B:10:0x0050, B:11:0x0054, B:13:0x005a, B:15:0x0063, B:264:0x006e, B:266:0x0076, B:268:0x007e, B:31:0x0092, B:34:0x0096, B:36:0x009c, B:42:0x00a3, B:45:0x00ac, B:48:0x00b1, B:52:0x00bc, B:55:0x00cb, B:58:0x00d0, B:60:0x00db, B:61:0x00de, B:64:0x0109, B:66:0x010f, B:68:0x011a, B:70:0x0122, B:72:0x012c, B:75:0x0139, B:78:0x015e, B:80:0x0179, B:83:0x0183, B:85:0x018e, B:87:0x0192, B:90:0x019c, B:92:0x01a9, B:94:0x01b4, B:96:0x01ce, B:98:0x01dd, B:100:0x01e5, B:101:0x01f3, B:103:0x01f9, B:106:0x0201, B:107:0x020c, B:109:0x0210, B:110:0x0217, B:115:0x0140, B:118:0x014d, B:120:0x0159, B:121:0x0226, B:123:0x023e, B:125:0x0254, B:127:0x025a, B:129:0x0284, B:131:0x02a8, B:133:0x02ae, B:134:0x02c7, B:136:0x02cd, B:137:0x02e2, B:158:0x0364, B:159:0x0367, B:161:0x038e, B:163:0x03a4, B:165:0x03c1, B:167:0x03c9, B:169:0x03d1, B:170:0x03df, B:172:0x03e5, B:175:0x03ed, B:176:0x03f8, B:178:0x03fc, B:179:0x0403, B:196:0x0410, B:198:0x0422, B:200:0x045e, B:217:0x04b8, B:218:0x04bb, B:220:0x04cc, B:222:0x04e2, B:224:0x0503, B:226:0x050b, B:227:0x0519, B:229:0x051f, B:232:0x0527, B:233:0x0532, B:235:0x0536, B:236:0x053d, B:250:0x00c4, B:23:0x0087, B:277:0x0567, B:279:0x056d), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03fc A[Catch: Exception -> 0x0042, TryCatch #5 {Exception -> 0x0042, blocks: (B:3:0x001e, B:4:0x0030, B:6:0x0036, B:9:0x0047, B:10:0x0050, B:11:0x0054, B:13:0x005a, B:15:0x0063, B:264:0x006e, B:266:0x0076, B:268:0x007e, B:31:0x0092, B:34:0x0096, B:36:0x009c, B:42:0x00a3, B:45:0x00ac, B:48:0x00b1, B:52:0x00bc, B:55:0x00cb, B:58:0x00d0, B:60:0x00db, B:61:0x00de, B:64:0x0109, B:66:0x010f, B:68:0x011a, B:70:0x0122, B:72:0x012c, B:75:0x0139, B:78:0x015e, B:80:0x0179, B:83:0x0183, B:85:0x018e, B:87:0x0192, B:90:0x019c, B:92:0x01a9, B:94:0x01b4, B:96:0x01ce, B:98:0x01dd, B:100:0x01e5, B:101:0x01f3, B:103:0x01f9, B:106:0x0201, B:107:0x020c, B:109:0x0210, B:110:0x0217, B:115:0x0140, B:118:0x014d, B:120:0x0159, B:121:0x0226, B:123:0x023e, B:125:0x0254, B:127:0x025a, B:129:0x0284, B:131:0x02a8, B:133:0x02ae, B:134:0x02c7, B:136:0x02cd, B:137:0x02e2, B:158:0x0364, B:159:0x0367, B:161:0x038e, B:163:0x03a4, B:165:0x03c1, B:167:0x03c9, B:169:0x03d1, B:170:0x03df, B:172:0x03e5, B:175:0x03ed, B:176:0x03f8, B:178:0x03fc, B:179:0x0403, B:196:0x0410, B:198:0x0422, B:200:0x045e, B:217:0x04b8, B:218:0x04bb, B:220:0x04cc, B:222:0x04e2, B:224:0x0503, B:226:0x050b, B:227:0x0519, B:229:0x051f, B:232:0x0527, B:233:0x0532, B:235:0x0536, B:236:0x053d, B:250:0x00c4, B:23:0x0087, B:277:0x0567, B:279:0x056d), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04cc A[Catch: Exception -> 0x0042, LOOP:7: B:219:0x04ca->B:220:0x04cc, LOOP_END, TryCatch #5 {Exception -> 0x0042, blocks: (B:3:0x001e, B:4:0x0030, B:6:0x0036, B:9:0x0047, B:10:0x0050, B:11:0x0054, B:13:0x005a, B:15:0x0063, B:264:0x006e, B:266:0x0076, B:268:0x007e, B:31:0x0092, B:34:0x0096, B:36:0x009c, B:42:0x00a3, B:45:0x00ac, B:48:0x00b1, B:52:0x00bc, B:55:0x00cb, B:58:0x00d0, B:60:0x00db, B:61:0x00de, B:64:0x0109, B:66:0x010f, B:68:0x011a, B:70:0x0122, B:72:0x012c, B:75:0x0139, B:78:0x015e, B:80:0x0179, B:83:0x0183, B:85:0x018e, B:87:0x0192, B:90:0x019c, B:92:0x01a9, B:94:0x01b4, B:96:0x01ce, B:98:0x01dd, B:100:0x01e5, B:101:0x01f3, B:103:0x01f9, B:106:0x0201, B:107:0x020c, B:109:0x0210, B:110:0x0217, B:115:0x0140, B:118:0x014d, B:120:0x0159, B:121:0x0226, B:123:0x023e, B:125:0x0254, B:127:0x025a, B:129:0x0284, B:131:0x02a8, B:133:0x02ae, B:134:0x02c7, B:136:0x02cd, B:137:0x02e2, B:158:0x0364, B:159:0x0367, B:161:0x038e, B:163:0x03a4, B:165:0x03c1, B:167:0x03c9, B:169:0x03d1, B:170:0x03df, B:172:0x03e5, B:175:0x03ed, B:176:0x03f8, B:178:0x03fc, B:179:0x0403, B:196:0x0410, B:198:0x0422, B:200:0x045e, B:217:0x04b8, B:218:0x04bb, B:220:0x04cc, B:222:0x04e2, B:224:0x0503, B:226:0x050b, B:227:0x0519, B:229:0x051f, B:232:0x0527, B:233:0x0532, B:235:0x0536, B:236:0x053d, B:250:0x00c4, B:23:0x0087, B:277:0x0567, B:279:0x056d), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x051f A[Catch: Exception -> 0x0042, TryCatch #5 {Exception -> 0x0042, blocks: (B:3:0x001e, B:4:0x0030, B:6:0x0036, B:9:0x0047, B:10:0x0050, B:11:0x0054, B:13:0x005a, B:15:0x0063, B:264:0x006e, B:266:0x0076, B:268:0x007e, B:31:0x0092, B:34:0x0096, B:36:0x009c, B:42:0x00a3, B:45:0x00ac, B:48:0x00b1, B:52:0x00bc, B:55:0x00cb, B:58:0x00d0, B:60:0x00db, B:61:0x00de, B:64:0x0109, B:66:0x010f, B:68:0x011a, B:70:0x0122, B:72:0x012c, B:75:0x0139, B:78:0x015e, B:80:0x0179, B:83:0x0183, B:85:0x018e, B:87:0x0192, B:90:0x019c, B:92:0x01a9, B:94:0x01b4, B:96:0x01ce, B:98:0x01dd, B:100:0x01e5, B:101:0x01f3, B:103:0x01f9, B:106:0x0201, B:107:0x020c, B:109:0x0210, B:110:0x0217, B:115:0x0140, B:118:0x014d, B:120:0x0159, B:121:0x0226, B:123:0x023e, B:125:0x0254, B:127:0x025a, B:129:0x0284, B:131:0x02a8, B:133:0x02ae, B:134:0x02c7, B:136:0x02cd, B:137:0x02e2, B:158:0x0364, B:159:0x0367, B:161:0x038e, B:163:0x03a4, B:165:0x03c1, B:167:0x03c9, B:169:0x03d1, B:170:0x03df, B:172:0x03e5, B:175:0x03ed, B:176:0x03f8, B:178:0x03fc, B:179:0x0403, B:196:0x0410, B:198:0x0422, B:200:0x045e, B:217:0x04b8, B:218:0x04bb, B:220:0x04cc, B:222:0x04e2, B:224:0x0503, B:226:0x050b, B:227:0x0519, B:229:0x051f, B:232:0x0527, B:233:0x0532, B:235:0x0536, B:236:0x053d, B:250:0x00c4, B:23:0x0087, B:277:0x0567, B:279:0x056d), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0536 A[Catch: Exception -> 0x0042, TryCatch #5 {Exception -> 0x0042, blocks: (B:3:0x001e, B:4:0x0030, B:6:0x0036, B:9:0x0047, B:10:0x0050, B:11:0x0054, B:13:0x005a, B:15:0x0063, B:264:0x006e, B:266:0x0076, B:268:0x007e, B:31:0x0092, B:34:0x0096, B:36:0x009c, B:42:0x00a3, B:45:0x00ac, B:48:0x00b1, B:52:0x00bc, B:55:0x00cb, B:58:0x00d0, B:60:0x00db, B:61:0x00de, B:64:0x0109, B:66:0x010f, B:68:0x011a, B:70:0x0122, B:72:0x012c, B:75:0x0139, B:78:0x015e, B:80:0x0179, B:83:0x0183, B:85:0x018e, B:87:0x0192, B:90:0x019c, B:92:0x01a9, B:94:0x01b4, B:96:0x01ce, B:98:0x01dd, B:100:0x01e5, B:101:0x01f3, B:103:0x01f9, B:106:0x0201, B:107:0x020c, B:109:0x0210, B:110:0x0217, B:115:0x0140, B:118:0x014d, B:120:0x0159, B:121:0x0226, B:123:0x023e, B:125:0x0254, B:127:0x025a, B:129:0x0284, B:131:0x02a8, B:133:0x02ae, B:134:0x02c7, B:136:0x02cd, B:137:0x02e2, B:158:0x0364, B:159:0x0367, B:161:0x038e, B:163:0x03a4, B:165:0x03c1, B:167:0x03c9, B:169:0x03d1, B:170:0x03df, B:172:0x03e5, B:175:0x03ed, B:176:0x03f8, B:178:0x03fc, B:179:0x0403, B:196:0x0410, B:198:0x0422, B:200:0x045e, B:217:0x04b8, B:218:0x04bb, B:220:0x04cc, B:222:0x04e2, B:224:0x0503, B:226:0x050b, B:227:0x0519, B:229:0x051f, B:232:0x0527, B:233:0x0532, B:235:0x0536, B:236:0x053d, B:250:0x00c4, B:23:0x0087, B:277:0x0567, B:279:0x056d), top: B:2:0x001e }] */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m119984S(String str, List list, List list2, Map map, List list3, Map map2, int i11, InterfaceC19305a interfaceC19305a, boolean z11) {
        Map map3;
        long j11;
        boolean z12;
        ArrayList arrayList;
        Map map4;
        int i12;
        ContactProfile m40356w;
        int size;
        Map map5;
        int i13;
        String str2;
        String str3;
        int size2;
        int i14;
        Map map6;
        int i15;
        int i16;
        String str4;
        String str5;
        int i17 = i11;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z13 = true;
        boolean m120010w = m120010w(i17, 1);
        boolean m120010w2 = m120010w(i17, 2);
        boolean m120010w3 = m120010w(i17, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
        boolean m120010w4 = m120010w(i17, 1024);
        try {
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String str6 = ((ContactProfile) it.next()).f42434r;
                synchronizedMap.put(str6, str6);
            }
            if (map2 == null) {
                map3 = new HashMap();
            } else {
                map3 = map2;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it2.next();
                if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
                    return;
                }
                if (m120010w3) {
                    if (contactProfile.f42434r.contains("-") && !AbstractC25495a.m132081f(contactProfile.f42434r) && !AbstractC25495a.m132084i(contactProfile.f42434r)) {
                    }
                    if (!contactProfile.m40366G0() && contactProfile.m40424q0() == -1) {
                        if (!synchronizedMap.containsKey(contactProfile.f42434r) && contactProfile.f42375S == z13 && !map3.containsKey(contactProfile.f42434r)) {
                            if (!m120010w3 || !AbstractC25495a.m132084i(contactProfile.f42434r)) {
                                String str7 = contactProfile.f42434r;
                                map3.put(str7, str7);
                            }
                            if (!m120010w || contactProfile.f42382U0 != 0) {
                                String m40383Q = contactProfile.m40383Q(z13, false);
                                arrayList2.clear();
                                if (m120010w2) {
                                    contactProfile.m40411j1(3);
                                }
                                contactProfile.f42405d1 = false;
                                contactProfile.f42387W = 0.0f;
                                ArrayList arrayList3 = new ArrayList();
                                StringBuilder sb2 = new StringBuilder();
                                boolean z14 = m120010w;
                                Map map7 = map3;
                                ArrayList arrayList4 = arrayList2;
                                m119994g(str, m40383Q, contactProfile, arrayList2, arrayList3, i17 | 256);
                                if (C19322f1.f95953d) {
                                    for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                                        arrayList3.set(i18, Float.valueOf(0.0f));
                                    }
                                }
                                if (!synchronizedMap.containsKey(contactProfile.f42434r) && !contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                                    if (contactProfile.f42387W > 0.0f) {
                                        if (!contactProfile.m40374K0() && !C21927m.m114302u().m114318P(contactProfile.f42434r) && !C18644n.m98531l().m98558u(contactProfile.f42434r)) {
                                            contactProfile.f42387W = 0.1f;
                                        }
                                        String str8 = "";
                                        z12 = m120010w2;
                                        map4 = synchronizedMap;
                                        float m118038J = C23024b7.m118038J(contactProfile.f42434r, null, list3, currentTimeMillis, i11, null);
                                        contactProfile.f42387W += m118038J;
                                        if (C19322f1.f95953d) {
                                            if (sb2.length() != 0) {
                                                str5 = ", ";
                                            } else {
                                                str5 = str8;
                                            }
                                            sb2.append(str5);
                                            sb2.append("3: ");
                                            sb2.append(m118038J);
                                        }
                                        if (C19322f1.f95953d) {
                                            if (sb2.length() != 0) {
                                                str4 = ", ";
                                            } else {
                                                str4 = str8;
                                            }
                                            sb2.append(str4);
                                            sb2.append("total: ");
                                            sb2.append(contactProfile.f42387W);
                                        }
                                        ContactProfile m40356w2 = ContactProfile.m40356w(contactProfile);
                                        int size3 = arrayList4.size();
                                        int i19 = 0;
                                        while (i19 < size3) {
                                            ArrayList arrayList5 = arrayList4;
                                            m40356w2.f42399a1.add(Integer.valueOf(((Integer) arrayList5.get(i19)).intValue()));
                                            i19++;
                                            arrayList4 = arrayList5;
                                        }
                                        ArrayList arrayList6 = arrayList4;
                                        arrayList6.clear();
                                        Map map8 = C19669z.f97573U;
                                        if (map8.containsKey(m40356w2.f42434r) && map8.get(m40356w2.f42434r) != null) {
                                            i16 = ((Integer) map8.get(m40356w2.f42434r)).intValue();
                                        } else {
                                            i16 = -1;
                                        }
                                        m40356w2.f42390X = i16;
                                        if (C19322f1.f95953d) {
                                            if (sb2.length() != 0) {
                                                str8 = ", ";
                                            }
                                            sb2.append(str8);
                                            sb2.append("position msg: ");
                                            sb2.append(contactProfile.f42390X);
                                        }
                                        if (C19322f1.f95953d) {
                                            m40356w2.m40401d1(sb2.toString());
                                        }
                                        contactProfile.f42399a1.clear();
                                        list2.add(m40356w2);
                                        arrayList = arrayList6;
                                        j11 = currentTimeMillis;
                                    } else {
                                        z12 = m120010w2;
                                        map4 = synchronizedMap;
                                        if (!TextUtils.isEmpty(C18631a.m98446i().m98454g(contactProfile.f42434r))) {
                                            ContactProfile m40356w3 = ContactProfile.m40356w(contactProfile);
                                            String str9 = m40356w3.f42437s;
                                            m40356w3.f42437s = null;
                                            String m40385R = m40356w3.m40385R(true, false, false);
                                            m40356w3.f42437s = str9;
                                            if (!TextUtils.isEmpty(m40385R) && !str9.equals(m40385R)) {
                                                String[] m118488a = C23282z6.m120367c(m40385R, 16384).m118488a();
                                                arrayList4.clear();
                                                m40356w3.f42439s1 = new SpannableStringBuilder();
                                                m119999l(str, m118488a, m40356w3, arrayList4, false, false, arrayList3);
                                                if (m40356w3.f42387W > 0.0f) {
                                                    ArrayList arrayList7 = arrayList4;
                                                    m40356w3.f42387W += C23024b7.m118038J(m40356w3.f42434r, null, list3, currentTimeMillis, i11, null);
                                                    if (TextUtils.isEmpty(m40356w3.f42460z1) || !AbstractC23309i.m122577xf()) {
                                                        str2 = "";
                                                    } else {
                                                        str2 = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.prefix_username), m40356w3.f42460z1);
                                                    }
                                                    if (!TextUtils.isEmpty(str2)) {
                                                        str3 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_name_with_dot_separate), m40385R, str2);
                                                    } else {
                                                        str3 = m40385R;
                                                    }
                                                    String str10 = "";
                                                    String format = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_change_alias_gsearch_prf_phonename), str10);
                                                    SpannableString spannableString = new SpannableString(str3.trim());
                                                    int i21 = 0;
                                                    while (i21 < arrayList7.size() - 1) {
                                                        try {
                                                            arrayList = arrayList7;
                                                            try {
                                                                if (((Integer) arrayList.get(i21)).intValue() >= 0) {
                                                                    int i22 = i21 + 1;
                                                                    j11 = currentTimeMillis;
                                                                    try {
                                                                        if (((Integer) arrayList.get(i22)).intValue() > ((Integer) arrayList.get(i21)).intValue()) {
                                                                            AbstractC23217t2.m119663o(spannableString, ((Integer) arrayList.get(i21)).intValue(), ((Integer) arrayList.get(i22)).intValue(), 0);
                                                                        }
                                                                    } catch (Exception e11) {
                                                                        e = e11;
                                                                        e.printStackTrace();
                                                                        ContactProfile m40356w4 = ContactProfile.m40356w(contactProfile);
                                                                        m40356w4.f42436r1 = new SpannableStringBuilder(TextUtils.concat(new SpannableString(format), spannableString));
                                                                        m40356w4.f42365O1 = 3;
                                                                        size2 = arrayList.size();
                                                                        while (i14 < size2) {
                                                                        }
                                                                        arrayList.clear();
                                                                        String str11 = contactProfile.f42434r;
                                                                        map4.put(str11, str11);
                                                                        m40356w4.f42354L = m40385R;
                                                                        contactProfile.f42399a1.clear();
                                                                        contactProfile.f42401b1.clear();
                                                                        m40356w3.f42387W = 0.0f;
                                                                        m40356w4.f42387W = 0.0f;
                                                                        map6 = C19669z.f97573U;
                                                                        if (map6 == null) {
                                                                        }
                                                                        i15 = -1;
                                                                        m40356w4.f42390X = i15;
                                                                        if (C19322f1.f95953d) {
                                                                        }
                                                                        if (C19322f1.f95953d) {
                                                                        }
                                                                        list2.add(m40356w4);
                                                                        i17 = i11;
                                                                        arrayList2 = arrayList;
                                                                        synchronizedMap = map4;
                                                                        m120010w = z14;
                                                                        map3 = map7;
                                                                        m120010w2 = z12;
                                                                        currentTimeMillis = j11;
                                                                        z13 = true;
                                                                    }
                                                                } else {
                                                                    j11 = currentTimeMillis;
                                                                }
                                                                i21 += 2;
                                                                arrayList7 = arrayList;
                                                                currentTimeMillis = j11;
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                                j11 = currentTimeMillis;
                                                            }
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            j11 = currentTimeMillis;
                                                            arrayList = arrayList7;
                                                        }
                                                    }
                                                    j11 = currentTimeMillis;
                                                    arrayList = arrayList7;
                                                    ContactProfile m40356w42 = ContactProfile.m40356w(contactProfile);
                                                    m40356w42.f42436r1 = new SpannableStringBuilder(TextUtils.concat(new SpannableString(format), spannableString));
                                                    m40356w42.f42365O1 = 3;
                                                    size2 = arrayList.size();
                                                    for (i14 = 0; i14 < size2; i14++) {
                                                        m40356w42.f42401b1.add(Integer.valueOf(((Integer) arrayList.get(i14)).intValue()));
                                                    }
                                                    arrayList.clear();
                                                    String str112 = contactProfile.f42434r;
                                                    map4.put(str112, str112);
                                                    m40356w42.f42354L = m40385R;
                                                    contactProfile.f42399a1.clear();
                                                    contactProfile.f42401b1.clear();
                                                    m40356w3.f42387W = 0.0f;
                                                    m40356w42.f42387W = 0.0f;
                                                    map6 = C19669z.f97573U;
                                                    if (map6 == null && map6.containsKey(m40356w42.f42434r) && map6.get(m40356w42.f42434r) != null) {
                                                        i15 = ((Integer) map6.get(m40356w42.f42434r)).intValue();
                                                    } else {
                                                        i15 = -1;
                                                    }
                                                    m40356w42.f42390X = i15;
                                                    if (C19322f1.f95953d) {
                                                        if (sb2.length() != 0) {
                                                            str10 = ", ";
                                                        }
                                                        sb2.append(str10);
                                                        sb2.append("position msg: ");
                                                        sb2.append(contactProfile.f42390X);
                                                    }
                                                    if (C19322f1.f95953d) {
                                                        m40356w42.m40401d1(sb2.toString());
                                                    }
                                                    list2.add(m40356w42);
                                                    i17 = i11;
                                                    arrayList2 = arrayList;
                                                    synchronizedMap = map4;
                                                    m120010w = z14;
                                                    map3 = map7;
                                                    m120010w2 = z12;
                                                    currentTimeMillis = j11;
                                                    z13 = true;
                                                }
                                            }
                                        }
                                        String str12 = "";
                                        arrayList = arrayList4;
                                        j11 = currentTimeMillis;
                                        if (m120010w4) {
                                            ContactProfile m40356w5 = ContactProfile.m40356w(contactProfile);
                                            String str13 = m40356w5.f42437s;
                                            if (!TextUtils.equals(str13, m40356w5.m40383Q(true, false))) {
                                                String[] m119971F = m119971F(str13, false);
                                                arrayList.clear();
                                                m40356w5.f42439s1 = new SpannableStringBuilder();
                                                String str14 = m40356w5.f42455y;
                                                String str15 = m40356w5.f42434r;
                                                m40356w5.f42455y = str12;
                                                m40356w5.f42434r = str12;
                                                m40356w5.f42440t = m120002o(m40356w5.f42437s).trim();
                                                m119999l(str, m119971F, m40356w5, arrayList, false, false, arrayList3);
                                                m40356w5.f42455y = str14;
                                                m40356w5.f42434r = str15;
                                                if (m40356w5.f42387W > 0.0f) {
                                                    SpannableString spannableString2 = new SpannableString(str13.trim());
                                                    for (int i23 = 0; i23 < arrayList.size() - 1; i23 += 2) {
                                                        try {
                                                            if (((Integer) arrayList.get(i23)).intValue() >= 0) {
                                                                int i24 = i23 + 1;
                                                                if (((Integer) arrayList.get(i24)).intValue() > ((Integer) arrayList.get(i23)).intValue()) {
                                                                    i12 = 0;
                                                                    try {
                                                                        AbstractC23217t2.m119663o(spannableString2, ((Integer) arrayList.get(i23)).intValue(), ((Integer) arrayList.get(i24)).intValue(), 0);
                                                                    } catch (Exception e14) {
                                                                        e = e14;
                                                                        e.printStackTrace();
                                                                        m40356w = ContactProfile.m40356w(contactProfile);
                                                                        m40356w.f42436r1 = new SpannableStringBuilder(spannableString2);
                                                                        size = arrayList.size();
                                                                        while (i12 < size) {
                                                                        }
                                                                        arrayList.clear();
                                                                        String str16 = contactProfile.f42434r;
                                                                        map4.put(str16, str16);
                                                                        contactProfile.f42399a1.clear();
                                                                        contactProfile.f42401b1.clear();
                                                                        m40356w5.f42387W = 0.0f;
                                                                        m40356w.f42387W = 0.0f;
                                                                        map5 = C19669z.f97573U;
                                                                        if (!map5.containsKey(m40356w.f42434r)) {
                                                                        }
                                                                        i13 = -1;
                                                                        m40356w.f42390X = i13;
                                                                        if (C19322f1.f95953d) {
                                                                        }
                                                                        if (C19322f1.f95953d) {
                                                                        }
                                                                        m40356w.f42335E1 = 1;
                                                                        list2.add(m40356w);
                                                                        i17 = i11;
                                                                        arrayList2 = arrayList;
                                                                        synchronizedMap = map4;
                                                                        m120010w = z14;
                                                                        map3 = map7;
                                                                        m120010w2 = z12;
                                                                        currentTimeMillis = j11;
                                                                        z13 = true;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            i12 = 0;
                                                        }
                                                    }
                                                    i12 = 0;
                                                    m40356w = ContactProfile.m40356w(contactProfile);
                                                    m40356w.f42436r1 = new SpannableStringBuilder(spannableString2);
                                                    size = arrayList.size();
                                                    while (i12 < size) {
                                                        m40356w.f42401b1.add(Integer.valueOf(((Integer) arrayList.get(i12)).intValue()));
                                                        i12++;
                                                    }
                                                    arrayList.clear();
                                                    String str162 = contactProfile.f42434r;
                                                    map4.put(str162, str162);
                                                    contactProfile.f42399a1.clear();
                                                    contactProfile.f42401b1.clear();
                                                    m40356w5.f42387W = 0.0f;
                                                    m40356w.f42387W = 0.0f;
                                                    map5 = C19669z.f97573U;
                                                    if (!map5.containsKey(m40356w.f42434r) && map5.get(m40356w.f42434r) != null) {
                                                        i13 = ((Integer) map5.get(m40356w.f42434r)).intValue();
                                                    } else {
                                                        i13 = -1;
                                                    }
                                                    m40356w.f42390X = i13;
                                                    if (C19322f1.f95953d) {
                                                        if (sb2.length() != 0) {
                                                            str12 = ", ";
                                                        }
                                                        sb2.append(str12);
                                                        sb2.append("position msg: ");
                                                        sb2.append(contactProfile.f42390X);
                                                    }
                                                    if (C19322f1.f95953d) {
                                                        m40356w.m40401d1(sb2.toString());
                                                    }
                                                    m40356w.f42335E1 = 1;
                                                    list2.add(m40356w);
                                                    i17 = i11;
                                                    arrayList2 = arrayList;
                                                    synchronizedMap = map4;
                                                    m120010w = z14;
                                                    map3 = map7;
                                                    m120010w2 = z12;
                                                    currentTimeMillis = j11;
                                                    z13 = true;
                                                }
                                            }
                                        }
                                        i17 = i11;
                                        arrayList2 = arrayList;
                                        synchronizedMap = map4;
                                        m120010w = z14;
                                        map3 = map7;
                                        m120010w2 = z12;
                                        currentTimeMillis = j11;
                                        z13 = true;
                                    }
                                } else {
                                    j11 = currentTimeMillis;
                                    z12 = m120010w2;
                                    arrayList = arrayList4;
                                    map4 = synchronizedMap;
                                }
                                i17 = i11;
                                arrayList2 = arrayList;
                                synchronizedMap = map4;
                                m120010w = z14;
                                map3 = map7;
                                m120010w2 = z12;
                                currentTimeMillis = j11;
                                z13 = true;
                            }
                        }
                    } else {
                        i17 = i11;
                        m120010w2 = m120010w2;
                    }
                } else if (!contactProfile.f42434r.contains("-")) {
                    if (!contactProfile.m40366G0()) {
                    }
                    i17 = i11;
                    m120010w2 = m120010w2;
                }
            }
            if (!list2.isEmpty()) {
                Collections.sort(list2, ContactProfile.f42319Z1);
            }
        } catch (Exception e16) {
            e16.printStackTrace();
        }
    }

    /* renamed from: T */
    public static void m119985T(String str, List list, List list2, int i11, InterfaceC19305a interfaceC19305a) {
        int i12;
        int i13;
        try {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            String[] stringArray = MainApplication.getAppContext().getResources().getStringArray(AbstractC16775v.array_language_as_code);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                hashSet.add(((C32178x9) it.next()).mo2478b());
            }
            for (int i14 = 0; i14 < list.size(); i14++) {
                if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
                    return;
                }
                if (!C23024b7.m118031C(((C32178x9) list.get(i14)).f148384r, true)) {
                    C32178x9 m155171f = C32178x9.m155171f((C32178x9) list.get(i14));
                    if (!TextUtils.isEmpty(m155171f.mo2478b())) {
                        int i15 = m155171f.f148388v;
                        if ((i15 == AbstractC8020f0.str_title_website_app || i15 == AbstractC8020f0.str_title_email_app || i15 == AbstractC8020f0.str_zcloud_branding) && AbstractC23304d.f113367c != null) {
                            int i16 = 0;
                            while (true) {
                                String[] strArr = AbstractC23304d.f113367c;
                                if (i16 >= strArr.length) {
                                    break;
                                }
                                int i17 = m155171f.f148388v;
                                if (i17 == AbstractC8020f0.str_title_website_app) {
                                    m155171f.f148376E.put(strArr[i16], String.format(AbstractC23136l9.m118675S(new Locale(AbstractC23304d.f113367c[i16]), m155171f.f148388v), AbstractC23306f.m120583H().m110204g().m116324p()));
                                } else if (i17 == AbstractC8020f0.str_title_email_app) {
                                    m155171f.f148376E.put(strArr[i16], String.format(AbstractC23136l9.m118675S(new Locale(AbstractC23304d.f113367c[i16]), m155171f.f148388v), AbstractC23306f.m120583H().m110204g().m116316h()));
                                } else if (i17 == AbstractC8020f0.str_zcloud_branding) {
                                    m155171f.f148376E.put(AbstractC23304d.f113367c[i16], String.format(AbstractC23136l9.m118675S(new Locale(AbstractC23304d.f113367c[i16]), m155171f.f148388v), AbstractC23306f.m120633X1().m89800f()));
                                }
                                i16++;
                            }
                            m155171f.f148385s = (String) m155171f.f148376E.get(AbstractC18458a.f93019a);
                        }
                        m155171f.mo2476e((String) m155171f.f148376E.get(AbstractC18458a.f93019a));
                        m155171f.f148385s = m155171f.mo2475c();
                        if (!hashSet.contains(m155171f.mo2478b())) {
                            m155171f.mo2483i(0.0f);
                            arrayList.clear();
                            ArrayList arrayList2 = new ArrayList();
                            m119994g(str, m155171f.mo2475c(), m155171f, arrayList, arrayList2, i11);
                            if (m155171f.mo2479d() > 0.0f && !hashSet.contains(m155171f.mo2478b())) {
                                m155171f.mo2482h().clear();
                                int size = arrayList.size();
                                for (int i18 = 0; i18 < size; i18++) {
                                    m155171f.mo2482h().add(Integer.valueOf(((Integer) arrayList.get(i18)).intValue()));
                                }
                                arrayList.clear();
                                list2.add(m155171f);
                                hashSet.add(m155171f.mo2478b());
                            } else {
                                int length = stringArray.length;
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= length) {
                                        break;
                                    }
                                    String str2 = stringArray[i19];
                                    if (!str2.equals(AbstractC18458a.f93019a)) {
                                        m155171f.mo2476e((String) m155171f.f148376E.get(str2));
                                        if (!hashSet.contains(m155171f.mo2478b())) {
                                            m155171f.mo2483i(0.0f);
                                            arrayList.clear();
                                            i12 = i19;
                                            i13 = length;
                                            m119994g(str, m155171f.mo2475c(), m155171f, arrayList, arrayList2, i11);
                                            if (m155171f.mo2479d() > 0.0f && !hashSet.contains(m155171f.mo2478b())) {
                                                m155171f.f148386t = m155171f.mo2475c();
                                                m155171f.mo2482h().clear();
                                                int size2 = arrayList.size();
                                                for (int i21 = 0; i21 < size2; i21++) {
                                                    m155171f.mo2482h().add(Integer.valueOf(((Integer) arrayList.get(i21)).intValue()));
                                                }
                                                arrayList.clear();
                                                list2.add(m155171f);
                                                hashSet.add(m155171f.mo2478b());
                                            }
                                            i19 = i12 + 1;
                                            length = i13;
                                        }
                                    }
                                    i12 = i19;
                                    i13 = length;
                                    i19 = i12 + 1;
                                    length = i13;
                                }
                                arrayList.clear();
                            }
                        }
                    }
                }
            }
            if (AbstractC23210s6.m119560a(i11, 67108864)) {
                Collections.sort(list2, C32178x9.f148371K);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: U */
    public static boolean m119986U(String str, String str2) {
        try {
            return m120002o(str2).contains(m120002o(str));
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: V */
    public static void m119987V(AbstractC29069a.a aVar, String str) {
        try {
            if (AbstractC25495a.m132079d(str)) {
                if (TextUtils.isEmpty(aVar.m145150n())) {
                    C0824j.m2153b(new a(str, aVar));
                }
            } else if ((TextUtils.isEmpty(aVar.m145150n()) || TextUtils.isEmpty(str)) && Long.parseLong(str) > 0) {
                C0824j.m2153b(new b(str, aVar));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public static int m119992e(Iterator it, String str) {
        boolean z11 = false;
        String str2 = "";
        int i11 = -1;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            if (str.length() >= str3.length()) {
                if (str.equalsIgnoreCase(str3)) {
                    return ((Integer) entry.getValue()).intValue();
                }
                if (!z11) {
                    str2 = m119974I(str);
                    z11 = true;
                }
                int indexOf = str2.indexOf(str3);
                if (indexOf < 0) {
                    continue;
                } else {
                    if (indexOf == 0) {
                        int length = indexOf + str3.length();
                        if (length < str2.length()) {
                            char charAt = str2.charAt(length);
                            if (charAt == '\t' || charAt == '\n' || charAt == ' ') {
                                i11 = ((Integer) entry.getValue()).intValue();
                            }
                        } else if (length == str2.length()) {
                            return ((Integer) entry.getValue()).intValue();
                        }
                    } else {
                        char charAt2 = str2.charAt(indexOf - 1);
                        if (charAt2 == '\t' || charAt2 == '\n' || charAt2 == ' ') {
                            int length2 = indexOf + str3.length();
                            if (length2 < str2.length()) {
                                char charAt3 = str2.charAt(length2);
                                if (charAt3 == '\t' || charAt3 == '\n' || charAt3 == ' ') {
                                    i11 = ((Integer) entry.getValue()).intValue();
                                }
                            } else if (length2 == str2.length()) {
                                return ((Integer) entry.getValue()).intValue();
                            }
                        }
                    }
                    if (i11 > -1) {
                        return i11;
                    }
                }
            }
        }
        return i11;
    }

    /* renamed from: f */
    private static float m119993f(String[] strArr, String[] strArr2, C31901e8 c31901e8) {
        float f11;
        int length = strArr2.length;
        boolean[] zArr = new boolean[length];
        Arrays.fill(zArr, false);
        if (c31901e8 != null) {
            c31901e8.f146553C.clear();
        }
        String[] strArr3 = strArr;
        if (strArr3.length > 1) {
            List asList = Arrays.asList(strArr);
            Collections.sort(asList, new Comparator() { // from class: me0.v6
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m120011x;
                    m120011x = AbstractC23262x6.m120011x((String) obj, (String) obj2);
                    return m120011x;
                }
            });
            strArr3 = (String[]) asList.toArray(new String[asList.size()]);
        }
        String[] strArr4 = strArr3;
        int i11 = 0;
        float f12 = 0.0f;
        for (int i12 = 0; i12 < strArr4.length; i12++) {
            int i13 = 0;
            int i14 = 0;
            int i15 = -1;
            int i16 = 0;
            while (true) {
                if (i13 < length) {
                    if (i13 == 0) {
                        i14 = 0;
                    } else {
                        i14 += strArr2[i13 - 1].length() + 1;
                    }
                    if (!zArr[i13] && strArr2[i13].startsWith(strArr4[i12])) {
                        if (i15 == -1) {
                            i15 = i13;
                            i16 = i14;
                        }
                        if (strArr2[i13].equals(strArr4[i12])) {
                            i16 = i14;
                            break;
                        }
                    }
                    i13++;
                } else {
                    i13 = i15;
                    break;
                }
            }
            if (i13 >= 0) {
                try {
                    zArr[i13] = true;
                    f12 += strArr4[i12].length();
                    if (strArr2[i13].equals(strArr4[i12])) {
                        f11 = strArr4[i12].length();
                    } else {
                        f11 = 0.0f;
                    }
                    f12 = f12 + f11 + (strArr4[i12].length() / strArr2[i13].length());
                    i11++;
                    int indexOf = m120002o(c31901e8.m153295h().trim()).toLowerCase().indexOf(strArr4[i12], i16);
                    int length2 = strArr4[i12].length() + indexOf;
                    c31901e8.f146553C.add(Integer.valueOf(indexOf));
                    c31901e8.f146553C.add(Integer.valueOf(length2));
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e11.toString());
                }
            }
        }
        if (i11 != strArr4.length) {
            return 0.0f;
        }
        return f12;
    }

    /* renamed from: g */
    public static void m119994g(String str, String str2, InterfaceC0861a interfaceC0861a, List list, List list2, int i11) {
        m119995h(str, str2, null, null, interfaceC0861a, list, list2, i11);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:48|(7:(1:266)(1:245)|(1:265)(2:251|(5:253|(1:(2:256|(2:258|(2:260|(1:262)))))|233|234|68))|264|(0)|233|234|68)(1:50)|51|52|(3:56|(2:57|(2:59|(1:70)(3:63|64|65))(2:72|73))|(2:67|68))|(5:(1:(2:222|223)(1:221))|(1:231)|233|234|68)(2:80|81)|82) */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x02cf, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x02dd, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0284, code lost:            if (r6.charValue() < 'A') goto L795;     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0508 A[Catch: Exception -> 0x050c, TryCatch #2 {Exception -> 0x050c, blocks: (B:133:0x0502, B:135:0x0508, B:137:0x0512), top: B:132:0x0502 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0512 A[Catch: Exception -> 0x050c, TRY_LEAVE, TryCatch #2 {Exception -> 0x050c, blocks: (B:133:0x0502, B:135:0x0508, B:137:0x0512), top: B:132:0x0502 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ee A[Catch: Exception -> 0x04d8, TryCatch #4 {Exception -> 0x04d8, blocks: (B:115:0x04c9, B:126:0x04e1, B:128:0x04e5, B:129:0x04e9, B:130:0x04f1, B:151:0x04ee), top: B:114:0x04c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:329:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0072  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m119995h(String str, String str2, String[] strArr, String[] strArr2, InterfaceC0861a interfaceC0861a, List list, List list2, int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        String[] m118488a;
        int[] iArr;
        String[] strArr3;
        boolean z14;
        String[] m118488a2;
        boolean z15;
        String[] m118488a3;
        String[] strArr4;
        boolean z16;
        int i12;
        int i13;
        float f11;
        int[] iArr2;
        int i14;
        int i15;
        int i16;
        InterfaceC0861a interfaceC0861a2;
        String[] strArr5;
        String str3;
        String trim;
        String lowerCase;
        int i17;
        int i18;
        Character ch2;
        int i19;
        String str4;
        boolean z17;
        String[] strArr6;
        String[] strArr7 = strArr2;
        int i21 = i11;
        boolean m120010w = m120010w(i21, 131072);
        boolean m120010w2 = m120010w(i21, 65536);
        boolean z18 = m120010w(i21, 32768) && C19322f1.f95956g != 0;
        if (m120010w(i21, 4194304)) {
            z11 = true;
        } else {
            if (m120010w(i21, 8388608)) {
                z11 = false;
                z12 = true;
                z13 = true;
                HashMap hashMap = new HashMap();
                if (strArr7 == null) {
                    if (m120010w(i21, 16)) {
                        strArr6 = strArr7;
                    } else {
                        strArr6 = new String[strArr7.length];
                        for (int i22 = 0; i22 < strArr7.length; i22++) {
                            strArr6[i22] = strArr7[i22].toLowerCase();
                        }
                    }
                    m118488a = strArr6;
                    strArr3 = null;
                    iArr = null;
                    z14 = false;
                } else {
                    if (str2 == null) {
                        return;
                    }
                    C23111j6 m120367c = C23282z6.m120367c(str2, (m120010w(i21, 16) ? 16 : 0) | 16384 | (z11 ? ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE : 0) | (z12 ? 2097152 : 0));
                    String[] m118488a4 = m120367c.m118488a();
                    int[] m118478b = m120367c instanceof C23100i6 ? ((C23100i6) m120367c).m118478b() : null;
                    if (m120010w(i21, 16)) {
                        m118488a = m118488a4;
                    } else {
                        m118488a = C23282z6.m120367c(str2, (z11 ? ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE : 0) | 16400 | (z12 ? 2097152 : 0)).m118488a();
                    }
                    String[] m118488a5 = C23282z6.m120367c(str2, (z11 ? ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE : 0) | 16400 | (z12 ? 2097152 : 0) | 512).m118488a();
                    iArr = m118478b;
                    strArr7 = m118488a4;
                    strArr3 = m118488a5;
                    z14 = m118488a5.length != m118488a.length ? false : z18;
                }
                if (strArr == null) {
                    m118488a2 = strArr;
                    strArr4 = null;
                } else {
                    if (str == null) {
                        return;
                    }
                    if (m120010w(i21, 128)) {
                        m118488a2 = C23282z6.m120367c(str, 8208 | (z13 ? 2097152 : 0)).m118488a();
                    } else {
                        m118488a2 = C23282z6.m120367c(str, 4112 | (z13 ? 2097152 : 0)).m118488a();
                    }
                    z15 = z14;
                    if (m120010w(i21, 128)) {
                        m118488a3 = C23282z6.m120367c(str, (z13 ? 2097152 : 0) | 8720).m118488a();
                    } else {
                        m118488a3 = C23282z6.m120367c(str, (z13 ? 2097152 : 0) | 528).m118488a();
                    }
                    String[] strArr8 = m118488a3;
                    if (m118488a3.length == m118488a2.length) {
                        strArr4 = strArr8;
                        int length = m118488a.length;
                        int[] iArr3 = new int[length];
                        Arrays.fill(iArr3, -2);
                        if (list != null) {
                            list.clear();
                        }
                        z16 = interfaceC0861a instanceof ContactProfile;
                        if (z16) {
                            ((ContactProfile) interfaceC0861a).f42344H1 = false;
                        }
                        if (m118488a2.length > 1) {
                            List asList = Arrays.asList(m118488a2);
                            Collections.sort(asList, new Comparator() { // from class: me0.t6
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    int m120012y;
                                    m120012y = AbstractC23262x6.m120012y((String) obj, (String) obj2);
                                    return m120012y;
                                }
                            });
                            m118488a2 = (String[]) asList.toArray(new String[asList.size()]);
                        }
                        if (strArr4 != null && strArr4.length > 1) {
                            List asList2 = Arrays.asList(strArr4);
                            Collections.sort(asList2, new Comparator() { // from class: me0.u6
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    int m120013z;
                                    m120013z = AbstractC23262x6.m120013z((String) obj, (String) obj2);
                                    return m120013z;
                                }
                            });
                            strArr4 = (String[]) asList2.toArray(new String[asList2.size()]);
                        }
                        String[] strArr9 = strArr4;
                        boolean z19 = z15;
                        String str5 = "";
                        int[] iArr4 = iArr;
                        i12 = 0;
                        i13 = 0;
                        int i23 = 0;
                        boolean z21 = false;
                        boolean z22 = false;
                        boolean z23 = false;
                        float f12 = 0.0f;
                        while (i13 < m118488a2.length) {
                            int i24 = i12;
                            boolean z24 = m120010w;
                            boolean z25 = false;
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = -1;
                            boolean z26 = false;
                            boolean z27 = false;
                            int i28 = -1;
                            int i29 = -1;
                            int i31 = -1;
                            while (true) {
                                if (i25 >= length) {
                                    iArr2 = iArr3;
                                    i14 = i23;
                                    i15 = length;
                                    break;
                                }
                                boolean z28 = i25 == 0 ? false : z25;
                                m118488a[i25].length();
                                i15 = length;
                                if (iArr3[i25] != -1) {
                                    int indexOf = m118488a[i25].indexOf(m118488a2[i13]);
                                    iArr2 = iArr3;
                                    int i32 = 0;
                                    while (indexOf >= 0 && i32 <= 10) {
                                        if (m120010w(i21, 8) || indexOf == 0) {
                                            i14 = i23;
                                        } else {
                                            Character valueOf = (i25 < 0 || i25 >= strArr7.length || indexOf < 0 || indexOf >= strArr7[i25].length()) ? null : Character.valueOf(strArr7[i25].charAt(indexOf));
                                            if (i25 < 0 || i25 >= strArr7.length || indexOf - 1 < 0) {
                                                i14 = i23;
                                            } else {
                                                i14 = i23;
                                                if (i19 < strArr7[i25].length()) {
                                                    ch2 = Character.valueOf(strArr7[i25].charAt(i19));
                                                    if (valueOf != null) {
                                                        if (ch2 != null) {
                                                            if (Character.isUpperCase(valueOf.charValue())) {
                                                                if (Character.isLowerCase(ch2.charValue())) {
                                                                    if (ch2.charValue() > 'z') {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i32++;
                                                    String str6 = m118488a[i25];
                                                    String str7 = m118488a2[i13];
                                                    indexOf = str6.indexOf(str7, indexOf + str7.length());
                                                    i21 = i11;
                                                    i23 = i14;
                                                }
                                            }
                                            ch2 = null;
                                            if (valueOf != null) {
                                            }
                                            i32++;
                                            String str62 = m118488a[i25];
                                            String str72 = m118488a2[i13];
                                            indexOf = str62.indexOf(str72, indexOf + str72.length());
                                            i21 = i11;
                                            i23 = i14;
                                        }
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i25));
                                        if (arrayList != null && arrayList.size() > 0) {
                                            int i33 = 0;
                                            while (true) {
                                                if (i33 >= arrayList.size() - 1) {
                                                    z17 = false;
                                                    break;
                                                }
                                                if (indexOf >= ((Integer) arrayList.get(i33)).intValue() && indexOf < ((Integer) arrayList.get(i33 + 1)).intValue()) {
                                                    i32++;
                                                    String str8 = m118488a[i25];
                                                    String str9 = m118488a2[i13];
                                                    indexOf = str8.indexOf(str9, str9.length() + indexOf);
                                                    z17 = true;
                                                    break;
                                                }
                                                i33 += 2;
                                            }
                                            if (z17) {
                                                continue;
                                                i21 = i11;
                                                i23 = i14;
                                            }
                                        }
                                        if (!z18 || strArr3 == null || (str4 = strArr3[i25]) == null || !str4.equals(strArr9[i13])) {
                                            if (!z28 && !z27 && m118488a[i25].equals(m118488a2[i13])) {
                                                if (z19) {
                                                    i28 = i25;
                                                    i29 = indexOf;
                                                    z27 = true;
                                                } else {
                                                    i27 = i25;
                                                    i31 = indexOf;
                                                }
                                            }
                                            if (!z27 && !z28 && (i27 == -1 || m118488a[i25].length() < i26)) {
                                                i26 = m118488a[i25].length();
                                                i27 = i25;
                                                i31 = indexOf;
                                                break;
                                            }
                                            i32++;
                                            String str622 = m118488a[i25];
                                            String str722 = m118488a2[i13];
                                            indexOf = str622.indexOf(str722, indexOf + str722.length());
                                            i21 = i11;
                                            i23 = i14;
                                        } else {
                                            i27 = i25;
                                            i31 = indexOf;
                                            z26 = true;
                                        }
                                        z28 = true;
                                        break;
                                    }
                                    i14 = i23;
                                    z25 = z28;
                                    if (z28) {
                                        break;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    i14 = i23;
                                    z25 = z28;
                                }
                                i25++;
                                i21 = i11;
                                length = i15;
                                iArr3 = iArr2;
                                i23 = i14;
                            }
                            if (z25 || !z27) {
                                i16 = i31;
                            } else {
                                i27 = i28;
                                i16 = i29;
                            }
                            if (i27 >= 0) {
                                try {
                                    float length2 = m118488a2[i13].length() / m118488a[i27].length();
                                    if (m118488a2[i13].length() != m118488a[i27].length()) {
                                        try {
                                            int indexOf2 = m118488a[i27].indexOf(m118488a2[i13], i16);
                                            int length3 = m118488a2[i13].length() + indexOf2;
                                            if (hashMap.containsKey(Integer.valueOf(i27)) && hashMap.get(Integer.valueOf(i27)) != null) {
                                                ((ArrayList) hashMap.get(Integer.valueOf(i27))).add(Integer.valueOf(indexOf2));
                                                ((ArrayList) hashMap.get(Integer.valueOf(i27))).add(Integer.valueOf(length3));
                                            } else {
                                                hashMap.put(Integer.valueOf(i27), new ArrayList(Arrays.asList(Integer.valueOf(indexOf2), Integer.valueOf(length3))));
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            str3 = str5;
                                            interfaceC0861a2 = interfaceC0861a;
                                            i21 = i11;
                                            strArr5 = strArr7;
                                            i12 = i24;
                                            i23 = i14;
                                            AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e.toString());
                                            i13++;
                                            strArr7 = strArr5;
                                            str5 = str3;
                                            m120010w = z24;
                                            length = i15;
                                            iArr3 = iArr2;
                                        }
                                    }
                                    if (length2 == 1.0f) {
                                        z23 = true;
                                    } else if (m118488a[i27].indexOf(m118488a2[i13]) == 0 && !z21) {
                                        z21 = true;
                                    }
                                    if (z19 && length2 == 1.0f && z26) {
                                        i23 = i14 + 1;
                                        if (!z22) {
                                            try {
                                                z22 = !TextUtils.equals(m118488a2[i13], strArr9[i13]);
                                            } catch (Exception e12) {
                                                e = e12;
                                                str3 = str5;
                                                interfaceC0861a2 = interfaceC0861a;
                                                i21 = i11;
                                                strArr5 = strArr7;
                                                i12 = i24;
                                                AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e.toString());
                                                i13++;
                                                strArr7 = strArr5;
                                                str5 = str3;
                                                m120010w = z24;
                                                length = i15;
                                                iArr3 = iArr2;
                                            }
                                        }
                                    } else {
                                        i23 = i14;
                                        z19 = false;
                                    }
                                    f12 = z24 ? f12 + (length2 * 100.0f) : f12 + 1.0f;
                                    i12 = i24 + 1;
                                    interfaceC0861a2 = interfaceC0861a;
                                    try {
                                    } catch (Exception e13) {
                                        e = e13;
                                        i21 = i11;
                                        strArr5 = strArr7;
                                        str3 = str5;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    interfaceC0861a2 = interfaceC0861a;
                                    i21 = i11;
                                    strArr5 = strArr7;
                                    i12 = i24;
                                    str3 = str5;
                                    i23 = i14;
                                }
                                try {
                                    if (interfaceC0861a2 instanceof ContactProfile) {
                                        try {
                                            if (TextUtils.isEmpty(str5)) {
                                                try {
                                                    if (AbstractC25495a.m132078c(interfaceC0861a.mo2478b())) {
                                                        i21 = i11;
                                                        try {
                                                            if (m120010w(i21, 64)) {
                                                                strArr5 = strArr7;
                                                                lowerCase = m120002o(((ContactProfile) interfaceC0861a2).mo2475c().trim()).toLowerCase();
                                                                if (iArr4 == null) {
                                                                    int i34 = -1;
                                                                    for (int i35 = 0; i35 < i27; i35++) {
                                                                        try {
                                                                            i34 = i34 + m118488a[i35].length() + 1;
                                                                        } catch (Exception e15) {
                                                                            e = e15;
                                                                            str3 = lowerCase;
                                                                            AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e.toString());
                                                                            i13++;
                                                                            strArr7 = strArr5;
                                                                            str5 = str3;
                                                                            m120010w = z24;
                                                                            length = i15;
                                                                            iArr3 = iArr2;
                                                                        }
                                                                    }
                                                                    if (i27 == 0) {
                                                                        i34 = 0;
                                                                    }
                                                                    i17 = lowerCase.indexOf(m118488a2[i13], i34 >= 0 ? i34 + i16 : 0);
                                                                } else {
                                                                    i17 = i16 + iArr4[i27];
                                                                }
                                                                int length4 = m118488a2[i13].length() + i17;
                                                                str3 = lowerCase;
                                                                if (m118488a2[i13].length() == m118488a[i27].length()) {
                                                                    i18 = -1;
                                                                    iArr2[i27] = -1;
                                                                } else {
                                                                    i18 = -1;
                                                                }
                                                                if (i17 != i18) {
                                                                    try {
                                                                        list.add(Integer.valueOf(i17));
                                                                        list.add(Integer.valueOf(length4));
                                                                    } catch (Exception e16) {
                                                                        e = e16;
                                                                        AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e.toString());
                                                                        i13++;
                                                                        strArr7 = strArr5;
                                                                        str5 = str3;
                                                                        m120010w = z24;
                                                                        length = i15;
                                                                        iArr3 = iArr2;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e17) {
                                                            e = e17;
                                                            str3 = str5;
                                                            strArr5 = strArr7;
                                                            AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e.toString());
                                                            i13++;
                                                            strArr7 = strArr5;
                                                            str5 = str3;
                                                            m120010w = z24;
                                                            length = i15;
                                                            iArr3 = iArr2;
                                                        }
                                                    } else {
                                                        i21 = i11;
                                                    }
                                                    if (m120010w(i21, 256)) {
                                                        strArr5 = strArr7;
                                                        try {
                                                            trim = ((ContactProfile) interfaceC0861a2).m40383Q(true, false).trim();
                                                        } catch (Exception e18) {
                                                            e = e18;
                                                            str3 = str5;
                                                            AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e.toString());
                                                            i13++;
                                                            strArr7 = strArr5;
                                                            str5 = str3;
                                                            m120010w = z24;
                                                            length = i15;
                                                            iArr3 = iArr2;
                                                        }
                                                    } else {
                                                        strArr5 = strArr7;
                                                        trim = ((ContactProfile) interfaceC0861a2).f42437s.trim();
                                                    }
                                                    lowerCase = m120002o(trim).toLowerCase();
                                                    if (iArr4 == null) {
                                                    }
                                                    int length42 = m118488a2[i13].length() + i17;
                                                    str3 = lowerCase;
                                                    if (m118488a2[i13].length() == m118488a[i27].length()) {
                                                    }
                                                    if (i17 != i18) {
                                                    }
                                                } catch (Exception e19) {
                                                    e = e19;
                                                    strArr5 = strArr7;
                                                    str3 = str5;
                                                    AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e.toString());
                                                    i13++;
                                                    strArr7 = strArr5;
                                                    str5 = str3;
                                                    m120010w = z24;
                                                    length = i15;
                                                    iArr3 = iArr2;
                                                }
                                            }
                                        } catch (Exception e21) {
                                            e = e21;
                                            i21 = i11;
                                        }
                                    }
                                    if (m118488a2[i13].length() == m118488a[i27].length()) {
                                    }
                                    if (i17 != i18) {
                                    }
                                } catch (Exception e22) {
                                    e = e22;
                                    AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e.toString());
                                    i13++;
                                    strArr7 = strArr5;
                                    str5 = str3;
                                    m120010w = z24;
                                    length = i15;
                                    iArr3 = iArr2;
                                }
                                i21 = i11;
                                strArr5 = strArr7;
                                lowerCase = str5;
                                if (iArr4 == null) {
                                }
                                int length422 = m118488a2[i13].length() + i17;
                                str3 = lowerCase;
                            } else {
                                interfaceC0861a2 = interfaceC0861a;
                                i21 = i11;
                                strArr5 = strArr7;
                                i12 = i24;
                                str3 = str5;
                                i23 = i14;
                            }
                            i13++;
                            strArr7 = strArr5;
                            str5 = str3;
                            m120010w = z24;
                            length = i15;
                            iArr3 = iArr2;
                        }
                        int i36 = i23;
                        if (list2 != null) {
                            list2.clear();
                        }
                        if (i12 == 0 && i12 == m118488a2.length) {
                            float f13 = f12 / i12;
                            if (list2 != null) {
                                list2.add(Float.valueOf(f13));
                            }
                            if (z23 || (m118488a.length == 1 && z21)) {
                                if (m120010w2) {
                                    if (list2 != null) {
                                        list2.add(Float.valueOf(100.0f));
                                    }
                                    f13 += 100.0f;
                                }
                                interfaceC0861a.mo2484j(2);
                            } else if (z21) {
                                if (m120010w2) {
                                    list2.add(Float.valueOf(50.0f));
                                    f13 += 50.0f;
                                }
                                interfaceC0861a.mo2484j(1);
                            }
                            if (z19 && z22 && i36 == m118488a2.length) {
                                list2.add(Float.valueOf(C19322f1.f95956g));
                                f13 += C19322f1.f95956g;
                            }
                            if (z16) {
                                ContactProfile contactProfile = (ContactProfile) interfaceC0861a;
                                if (!AbstractC25495a.m132079d(contactProfile.mo2478b()) && !C21927m.m114302u().m114318P(contactProfile.mo2478b()) && !C18644n.m98531l().m98558u(contactProfile.mo2478b())) {
                                    interfaceC0861a.mo2484j(3);
                                    contactProfile.f42393Y = true;
                                }
                                contactProfile.f42396Z = str5.length();
                                if (!TextUtils.isEmpty(str5)) {
                                    contactProfile.f42371Q1 = str5;
                                }
                            }
                            f11 = f13;
                        } else {
                            f11 = 0.0f;
                        }
                        interfaceC0861a.mo2483i(f11);
                        if (interfaceC0861a.mo2479d() > 0.0f || !(interfaceC0861a instanceof ContactProfile)) {
                            return;
                        }
                        ContactProfile contactProfile2 = (ContactProfile) interfaceC0861a;
                        if (TextUtils.isEmpty(contactProfile2.f42442t1)) {
                            return;
                        }
                        int indexOf3 = contactProfile2.f42442t1.indexOf(str);
                        if (indexOf3 == 0) {
                            str.length();
                            contactProfile2.f42442t1.length();
                        } else if (indexOf3 > 0) {
                            str.length();
                            contactProfile2.f42442t1.length();
                        } else {
                            int indexOf4 = str.indexOf(contactProfile2.f42442t1);
                            if (indexOf4 == 0) {
                                contactProfile2.f42442t1.length();
                            } else if (indexOf4 > 0) {
                                contactProfile2.f42442t1.length();
                            }
                        }
                        interfaceC0861a.mo2483i(interfaceC0861a.mo2479d() * 2.0f);
                        return;
                    }
                    strArr4 = strArr8;
                }
                z15 = false;
                int length5 = m118488a.length;
                int[] iArr32 = new int[length5];
                Arrays.fill(iArr32, -2);
                if (list != null) {
                }
                z16 = interfaceC0861a instanceof ContactProfile;
                if (z16) {
                }
                if (m118488a2.length > 1) {
                }
                if (strArr4 != null) {
                    List asList22 = Arrays.asList(strArr4);
                    Collections.sort(asList22, new Comparator() { // from class: me0.u6
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m120013z;
                            m120013z = AbstractC23262x6.m120013z((String) obj, (String) obj2);
                            return m120013z;
                        }
                    });
                    strArr4 = (String[]) asList22.toArray(new String[asList22.size()]);
                }
                String[] strArr92 = strArr4;
                boolean z192 = z15;
                String str52 = "";
                int[] iArr42 = iArr;
                i12 = 0;
                i13 = 0;
                int i232 = 0;
                boolean z212 = false;
                boolean z222 = false;
                boolean z232 = false;
                float f122 = 0.0f;
                while (i13 < m118488a2.length) {
                }
                int i362 = i232;
                if (list2 != null) {
                }
                if (i12 == 0) {
                }
                f11 = 0.0f;
                interfaceC0861a.mo2483i(f11);
                if (interfaceC0861a.mo2479d() > 0.0f) {
                    return;
                } else {
                    return;
                }
            }
            z11 = false;
        }
        z12 = false;
        z13 = false;
        HashMap hashMap2 = new HashMap();
        if (strArr7 == null) {
        }
        if (strArr == null) {
        }
        z15 = false;
        int length52 = m118488a.length;
        int[] iArr322 = new int[length52];
        Arrays.fill(iArr322, -2);
        if (list != null) {
        }
        z16 = interfaceC0861a instanceof ContactProfile;
        if (z16) {
        }
        if (m118488a2.length > 1) {
        }
        if (strArr4 != null) {
        }
        String[] strArr922 = strArr4;
        boolean z1922 = z15;
        String str522 = "";
        int[] iArr422 = iArr;
        i12 = 0;
        i13 = 0;
        int i2322 = 0;
        boolean z2122 = false;
        boolean z2222 = false;
        boolean z2322 = false;
        float f1222 = 0.0f;
        while (i13 < m118488a2.length) {
        }
        int i3622 = i2322;
        if (list2 != null) {
        }
        if (i12 == 0) {
        }
        f11 = 0.0f;
        interfaceC0861a.mo2483i(f11);
        if (interfaceC0861a.mo2479d() > 0.0f) {
        }
    }

    /* renamed from: i */
    public static void m119996i(String str, String[] strArr, InterfaceC0861a interfaceC0861a, List list, List list2, int i11) {
        m119995h(str, null, null, strArr, interfaceC0861a, list, list2, i11);
    }

    /* renamed from: j */
    public static void m119997j(String str, String[] strArr, InterfaceC0861a interfaceC0861a, List list, boolean z11, List list2) {
        int i11;
        if (z11) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        m119996i(str, strArr, interfaceC0861a, list, list2, (i11 & (-81)) | 256);
    }

    /* renamed from: k */
    public static void m119998k(String str, String[] strArr, InterfaceC0861a interfaceC0861a, List list, boolean z11, boolean z12, List list2, boolean z13, boolean z14) {
        int i11;
        if (z11) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        if (z12) {
            i11 |= 16;
        }
        if (z13) {
            i11 |= 64;
        }
        if (z14) {
            i11 |= 256;
        }
        m119996i(str, strArr, interfaceC0861a, list, list2, i11);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:29|(5:37|38|39|40|41))|42|43|(3:47|(2:48|(2:50|(1:61)(3:54|55|56))(2:63|64))|(3:58|59|41))|65|(2:143|144)(6:67|(1:72)|38|39|40|41)) */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0112, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x011f, code lost:            r0.printStackTrace();     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m119999l(String str, String[] strArr, ContactProfile contactProfile, ArrayList arrayList, boolean z11, boolean z12, ArrayList arrayList2) {
        String[] strArr2;
        int i11;
        float f11;
        float f12;
        float length;
        int length2;
        float length3;
        int length4;
        int i12;
        int i13;
        ArrayList arrayList3;
        int i14;
        int i15;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        String[] strArr3 = strArr;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        if (z12) {
            strArr2 = strArr3;
        } else {
            String[] strArr4 = new String[strArr3.length];
            for (int i18 = 0; i18 < strArr3.length; i18++) {
                strArr4[i18] = strArr3[i18].toLowerCase();
            }
            strArr2 = strArr4;
        }
        if (z11) {
            i11 = 8192;
        } else {
            i11 = 4096;
        }
        String[] m118488a = C23282z6.m120367c(str, i11).m118488a();
        int length5 = strArr2.length;
        int[] iArr = new int[length5];
        Arrays.fill(iArr, -2);
        if (arrayList4 != null) {
            arrayList.clear();
        }
        contactProfile.f42344H1 = false;
        if (m118488a.length > 1) {
            List asList = Arrays.asList(m118488a);
            Collections.sort(asList, new Comparator() { // from class: me0.w6
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m119966A;
                    m119966A = AbstractC23262x6.m119966A((String) obj, (String) obj2);
                    return m119966A;
                }
            });
            m118488a = (String[]) asList.toArray(new String[asList.size()]);
        }
        String[] strArr5 = m118488a;
        String str2 = "";
        int i19 = 0;
        int i21 = 0;
        float f13 = 0.0f;
        boolean z15 = false;
        boolean z16 = false;
        while (i21 < strArr5.length) {
            int i22 = -1;
            boolean z17 = false;
            int i23 = 0;
            int i24 = 0;
            int i25 = -1;
            int i26 = -1;
            while (true) {
                if (i23 < length5) {
                    if (i23 == 0) {
                        z13 = false;
                    } else {
                        z13 = z17;
                    }
                    strArr2[i23].length();
                    if (iArr[i23] == i22) {
                        i12 = length5;
                    } else {
                        int indexOf = strArr2[i23].indexOf(strArr5[i21]);
                        i12 = length5;
                        int i27 = 0;
                        while (indexOf >= 0 && i27 <= 10) {
                            if (indexOf != 0) {
                                char charAt = strArr3[i23].charAt(indexOf);
                                char charAt2 = strArr3[i23].charAt(indexOf - 1);
                                if (charAt < 'A' || charAt > 'Z' || charAt2 < 'a' || charAt2 > 'z') {
                                    int i28 = i24;
                                    i17 = i25;
                                    i27++;
                                    String str3 = strArr2[i23];
                                    int i29 = i17;
                                    String str4 = strArr5[i21];
                                    indexOf = str3.indexOf(str4, indexOf + str4.length());
                                    i25 = i29;
                                    i24 = i28;
                                    strArr3 = strArr;
                                }
                            }
                            ArrayList arrayList6 = (ArrayList) synchronizedMap.get(Integer.valueOf(i23));
                            if (arrayList6 != null && arrayList6.size() > 0) {
                                int i31 = 0;
                                while (true) {
                                    if (i31 < arrayList6.size() - 1) {
                                        if (indexOf >= ((Integer) arrayList6.get(i31)).intValue() && indexOf < ((Integer) arrayList6.get(i31 + 1)).intValue()) {
                                            i27++;
                                            String str5 = strArr2[i23];
                                            String str6 = strArr5[i21];
                                            indexOf = str5.indexOf(str6, str6.length() + indexOf);
                                            z14 = true;
                                            break;
                                        }
                                        i31 += 2;
                                    } else {
                                        z14 = false;
                                        break;
                                    }
                                }
                                if (z14) {
                                    strArr3 = strArr;
                                }
                            }
                            if (strArr2[i23].equals(strArr5[i21])) {
                                i26 = indexOf;
                                i25 = i23;
                                z13 = true;
                                break;
                            }
                            i17 = i25;
                            if (i17 == -1 || strArr2[i23].length() < (i28 = i24)) {
                                i24 = strArr2[i23].length();
                                i26 = indexOf;
                                i25 = i23;
                                break;
                            }
                            i27++;
                            String str32 = strArr2[i23];
                            int i292 = i17;
                            String str42 = strArr5[i21];
                            indexOf = str32.indexOf(str42, indexOf + str42.length());
                            i25 = i292;
                            i24 = i28;
                            strArr3 = strArr;
                        }
                        i25 = i25;
                        i24 = i24;
                        if (z13) {
                            i13 = i25;
                            break;
                        }
                    }
                    z17 = z13;
                    i23++;
                    strArr3 = strArr;
                    length5 = i12;
                    i22 = -1;
                } else {
                    i12 = length5;
                    i13 = i25;
                    break;
                }
            }
            int i32 = i26;
            if (i13 >= 0) {
                try {
                    float length6 = strArr5[i21].length() / strArr2[i13].length();
                    if (strArr5[i21].length() != strArr2[i13].length()) {
                        try {
                            int indexOf2 = strArr2[i13].indexOf(strArr5[i21], i32);
                            int length7 = strArr5[i21].length() + indexOf2;
                            if (synchronizedMap.containsKey(Integer.valueOf(i13)) && synchronizedMap.get(Integer.valueOf(i13)) != null) {
                                ((ArrayList) synchronizedMap.get(Integer.valueOf(i13))).add(Integer.valueOf(indexOf2));
                                ((ArrayList) synchronizedMap.get(Integer.valueOf(i13))).add(Integer.valueOf(length7));
                            } else {
                                synchronizedMap.put(Integer.valueOf(i13), new ArrayList(Arrays.asList(Integer.valueOf(indexOf2), Integer.valueOf(length7))));
                            }
                        } catch (Exception e11) {
                            e = e11;
                            arrayList3 = arrayList;
                            AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e.toString());
                            i21++;
                            strArr3 = strArr;
                            arrayList5 = arrayList2;
                            arrayList4 = arrayList3;
                            length5 = i12;
                        }
                    }
                    if (length6 == 1.0f && !z15) {
                        z15 = true;
                    } else if (strArr2[i13].indexOf(strArr5[i21]) == 0 && !z16) {
                        z16 = true;
                    }
                    f13 += 1.0f;
                    i19++;
                    if (TextUtils.isEmpty(str2)) {
                        try {
                            str2 = m120002o(contactProfile.m40385R(true, false, false).trim()).toLowerCase();
                        } catch (Exception e12) {
                            e = e12;
                            arrayList3 = arrayList;
                            AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e.toString());
                            i21++;
                            strArr3 = strArr;
                            arrayList5 = arrayList2;
                            arrayList4 = arrayList3;
                            length5 = i12;
                        }
                    }
                    int i33 = -1;
                    for (int i34 = 0; i34 < i13; i34++) {
                        i33 = i33 + strArr2[i34].length() + 1;
                    }
                    if (i13 == 0) {
                        i14 = 0;
                    } else {
                        i14 = i33;
                    }
                    String str7 = strArr5[i21];
                    if (i14 >= 0) {
                        i15 = i14 + i32;
                    } else {
                        i15 = 0;
                    }
                    int indexOf3 = str2.indexOf(str7, i15);
                    int length8 = strArr5[i21].length() + indexOf3;
                    if (strArr5[i21].length() == strArr2[i13].length()) {
                        i16 = -1;
                        iArr[i13] = -1;
                    } else {
                        i16 = -1;
                    }
                    if (indexOf3 != i16) {
                        Integer valueOf = Integer.valueOf(indexOf3);
                        arrayList3 = arrayList;
                        try {
                            arrayList3.add(valueOf);
                            arrayList3.add(Integer.valueOf(length8));
                        } catch (Exception e13) {
                            e = e13;
                            AbstractC23350e.m122774d(AbstractC23059e9.f112067a, e.toString());
                            i21++;
                            strArr3 = strArr;
                            arrayList5 = arrayList2;
                            arrayList4 = arrayList3;
                            length5 = i12;
                        }
                    } else {
                        arrayList3 = arrayList;
                    }
                } catch (Exception e14) {
                    e = e14;
                    arrayList3 = arrayList4;
                }
            } else {
                arrayList3 = arrayList4;
            }
            i21++;
            strArr3 = strArr;
            arrayList5 = arrayList2;
            arrayList4 = arrayList3;
            length5 = i12;
        }
        ArrayList arrayList7 = arrayList5;
        if (arrayList7 != null) {
            arrayList2.clear();
        }
        if (i19 != 0 && i19 == strArr5.length) {
            float f14 = f13 / i19;
            if (arrayList7 != null) {
                arrayList7.add(Float.valueOf(f14));
            }
            if (!z15 && (strArr2.length != 1 || !z16)) {
                if (z16) {
                    contactProfile.f42365O1 = 1;
                }
            } else {
                contactProfile.f42365O1 = 2;
            }
            if (!contactProfile.m40374K0() && !C21927m.m114302u().m114318P(contactProfile.f42434r) && !C18644n.m98531l().m98558u(contactProfile.f42434r)) {
                contactProfile.f42365O1 = 3;
            }
            contactProfile.f42396Z = str2.length();
            if (!TextUtils.isEmpty(str2)) {
                contactProfile.f42371Q1 = str2;
            }
            f11 = f14;
        } else {
            f11 = 0.0f;
        }
        contactProfile.f42387W = f11;
        if (f11 <= 0.0f && !TextUtils.isEmpty(contactProfile.f42442t1)) {
            int indexOf4 = contactProfile.f42442t1.indexOf(str);
            if (indexOf4 == 0) {
                length3 = str.length();
                length4 = contactProfile.f42442t1.length();
            } else {
                if (indexOf4 > 0) {
                    length = str.length();
                    length2 = contactProfile.f42442t1.length();
                } else {
                    int indexOf5 = str.indexOf(contactProfile.f42442t1);
                    if (indexOf5 == 0) {
                        length3 = contactProfile.f42442t1.length();
                        length4 = str.length();
                    } else if (indexOf5 > 0) {
                        length = contactProfile.f42442t1.length();
                        length2 = str.length();
                    } else {
                        f12 = 0.0f;
                        contactProfile.f42387W += f12;
                    }
                }
                f12 = (length / length2) * 100.0f * 1.0f;
                contactProfile.f42387W += f12;
            }
            f12 = (length3 / length4) * 100.0f * 10.0f;
            contactProfile.f42387W += f12;
        }
    }

    /* renamed from: m */
    public static boolean m120000m(String str) {
        boolean z11;
        boolean z12 = false;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            char charAt = str.charAt(0);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                try {
                    if (!TextUtils.isEmpty("((?=.*[a-zA-Z0-9_.-]).{6,20})")) {
                        if (!Pattern.compile("((?=.*[a-zA-Z0-9_.-]).{6,20})").matcher(str).matches()) {
                            return false;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    z12 = z11;
                    e.printStackTrace();
                    return z12;
                }
            }
            return z11;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: n */
    public static float m120001n(String[] strArr, String[] strArr2) {
        return 1.0f;
    }

    /* renamed from: o */
    public static String m120002o(String str) {
        return m120003p(str, true);
    }

    /* renamed from: p */
    public static String m120003p(String str, boolean z11) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        char[] cArr = new char[charArray.length];
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c11 = charArray[i11];
            switch (c11) {
                case 137:
                case 208:
                case 272:
                    cArr[i11] = 'D';
                    break;
                case 192:
                case 193:
                case 194:
                case 195:
                case 258:
                case 461:
                case 514:
                case 7840:
                case 7842:
                case 7844:
                case 7846:
                case 7848:
                case 7850:
                case 7852:
                case 7854:
                case 7856:
                case 7858:
                case 7860:
                case 7862:
                    cArr[i11] = 'A';
                    break;
                case 200:
                case 201:
                case 202:
                case 518:
                case 7864:
                case 7866:
                case 7868:
                case 7870:
                case 7872:
                case 7874:
                case 7876:
                case 7878:
                    cArr[i11] = 'E';
                    break;
                case 204:
                case 205:
                case 296:
                case 7880:
                case 7882:
                    cArr[i11] = 'I';
                    break;
                case 210:
                case 211:
                case 212:
                case 213:
                case 416:
                case 526:
                case 7884:
                case 7886:
                case 7888:
                case 7890:
                case 7892:
                case 7894:
                case 7896:
                case 7898:
                case 7900:
                case 7902:
                case 7904:
                case 7906:
                    cArr[i11] = 'O';
                    break;
                case 217:
                case 218:
                case 360:
                case 431:
                case 7908:
                case 7910:
                case 7912:
                case 7914:
                case 7916:
                case 7918:
                case 7920:
                    cArr[i11] = 'U';
                    break;
                case 221:
                case 7922:
                case 7924:
                case 7926:
                case 7928:
                    cArr[i11] = 'Y';
                    break;
                case 224:
                case 225:
                case 226:
                case 227:
                case 259:
                case 462:
                case 515:
                case 7841:
                case 7843:
                case 7845:
                case 7847:
                case 7849:
                case 7851:
                case 7853:
                case 7855:
                case 7857:
                case 7859:
                case 7861:
                case 7863:
                    cArr[i11] = 'a';
                    break;
                case 232:
                case 233:
                case 234:
                case 519:
                case 7865:
                case 7867:
                case 7869:
                case 7871:
                case 7873:
                case 7875:
                case 7877:
                case 7879:
                    cArr[i11] = 'e';
                    break;
                case 236:
                case 237:
                case 297:
                case 7881:
                case 7883:
                    cArr[i11] = 'i';
                    break;
                case 242:
                case 243:
                case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                case 245:
                case 417:
                case 527:
                case 7885:
                case 7887:
                case 7889:
                case 7891:
                case 7893:
                case 7895:
                case 7897:
                case 7899:
                case 7901:
                case 7903:
                case 7905:
                case 7907:
                    cArr[i11] = 'o';
                    break;
                case 249:
                case 250:
                case 361:
                case 432:
                case 7909:
                case 7911:
                case 7913:
                case 7915:
                case 7917:
                case 7919:
                case 7921:
                    cArr[i11] = 'u';
                    break;
                case 253:
                case 7923:
                case 7925:
                case 7927:
                case 7929:
                    cArr[i11] = 'y';
                    break;
                case 273:
                    cArr[i11] = 'd';
                    break;
                default:
                    cArr[i11] = c11;
                    break;
            }
        }
        String str2 = new String(cArr);
        if (z11) {
            return str2.toLowerCase();
        }
        return str2;
    }

    /* renamed from: q */
    public static void m120004q(String str, ArrayList arrayList, ArrayList arrayList2, boolean z11, Map map, ArrayList arrayList3) {
        int i11;
        int i12;
        int i13;
        float f11;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                if (!z11 || contactProfile.f42382U0 != 0) {
                    contactProfile.m40383Q(true, false);
                    InviteContactProfile inviteContactProfile = new InviteContactProfile(contactProfile);
                    inviteContactProfile.f42387W = 0.0f;
                    String[] m119970E = m119970E(inviteContactProfile.m40383Q(true, false));
                    arrayList4.clear();
                    m119997j(str, m119970E, inviteContactProfile, arrayList4, false, new ArrayList());
                    if (inviteContactProfile.f42387W > 0.0f && !inviteContactProfile.f42434r.equals(CoreUtility.f89233i)) {
                        inviteContactProfile.f42387W = 0.0f;
                        Map map2 = AbstractC23304d.f113425q;
                        if (map2.containsKey(inviteContactProfile.f42434r) && map2.get(inviteContactProfile.f42434r) != null) {
                            i11 = ((C32093r8) map2.get(inviteContactProfile.f42434r)).f147886c;
                        } else {
                            i11 = 0;
                        }
                        int i14 = 20;
                        if (i11 <= 20) {
                            i14 = i11;
                        }
                        float f12 = 0.0f;
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            try {
                                C32093r8 c32093r8 = (C32093r8) arrayList3.get(i15);
                                if (c32093r8 != null && inviteContactProfile.f42434r.equals(c32093r8.f147884a) && c32093r8.f147886c > 0) {
                                    float m120009v = m120009v(c32093r8.f147892i);
                                    ArrayList arrayList5 = c32093r8.f147893j;
                                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                                        f11 = 0.0f;
                                        int i16 = 0;
                                        for (int i17 = 0; i17 < c32093r8.f147893j.size(); i17++) {
                                            f11 += C23024b7.m118042N(currentTimeMillis - ((Long) c32093r8.f147893j.get(i17)).longValue()) * m120009v;
                                            i16++;
                                        }
                                        i13 = i16;
                                    } else {
                                        i13 = 0;
                                        f11 = 0.0f;
                                    }
                                    if (i13 > 0) {
                                        f12 = (i14 * f11) / i13;
                                    }
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        inviteContactProfile.f42387W += f12;
                        int size = arrayList4.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            inviteContactProfile.f42399a1.add(Integer.valueOf(((Integer) arrayList4.get(i18)).intValue()));
                        }
                        arrayList4.clear();
                        Map map3 = C19669z.f97573U;
                        if (map3.containsKey(inviteContactProfile.f42434r) && map3.get(inviteContactProfile.f42434r) != null) {
                            i12 = ((Integer) map3.get(inviteContactProfile.f42434r)).intValue();
                        } else {
                            i12 = -1;
                        }
                        inviteContactProfile.f42390X = i12;
                        arrayList2.add(inviteContactProfile);
                    } else {
                        arrayList4.clear();
                    }
                }
            }
            Collections.sort(arrayList2, ContactProfile.f42319Z1);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: r */
    public static void m120005r(String str, ArrayList arrayList, ArrayList arrayList2) {
        try {
            String[] m119967B = m119967B(str);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C31901e8 c31901e8 = (C31901e8) it.next();
                c31901e8.f146558t = 0;
                c31901e8.f146558t = (int) (c31901e8.f146558t + m119993f(m119967B, m119971F(c31901e8.m153295h(), true), c31901e8));
                C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), c31901e8.m153298m());
                if (c31901e8.f146558t > 0) {
                    if (m2800f != null && m2800f.m153300r() > 0) {
                    }
                    arrayList2.add(c31901e8);
                }
            }
            Collections.sort(arrayList2, C31901e8.f146549D);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    public static List m120006s(String str, boolean z11, Map map, boolean z12) {
        ArrayList arrayList;
        int i11;
        int i12;
        ArrayList arrayList2 = new ArrayList();
        try {
            String m120002o = m120002o(str);
            ArrayList arrayList3 = new ArrayList();
            if (!map.containsKey(m120002o)) {
                String[] m119967B = m119967B(m120002o);
                for (Map.Entry entry : AbstractC23304d.f113429r.entrySet()) {
                    String[] m119970E = m119970E((String) entry.getKey());
                    ArrayList arrayList4 = (ArrayList) entry.getValue();
                    float m120001n = m120001n(m119967B, m119970E);
                    if (m120001n > 0.0f) {
                        for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                            C32093r8 c32093r8 = new C32093r8();
                            c32093r8.f147887d = ((C32093r8) arrayList4.get(i13)).f147887d;
                            c32093r8.f147884a = ((C32093r8) arrayList4.get(i13)).f147884a;
                            c32093r8.f147886c = ((C32093r8) arrayList4.get(i13)).f147886c;
                            c32093r8.f147890g = m120001n;
                            c32093r8.f147885b = ((C32093r8) arrayList4.get(i13)).f147885b;
                            c32093r8.f147893j = ((C32093r8) arrayList4.get(i13)).f147893j;
                            arrayList3.add(c32093r8);
                        }
                        map.put(m120002o, arrayList3);
                    }
                }
                arrayList = arrayList3;
            } else {
                arrayList = (ArrayList) map.get(m120002o);
            }
            if (z11) {
                m119984S(m120002o, C19669z.m103146Y().m103199P(), arrayList2, C19669z.f97573U, arrayList, new HashMap(), 0, null, false);
            }
            C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
            Map map2 = C19669z.f97573U;
            if (AbstractC23309i.m122127lb() == 1) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            m119979N(m120002o, mo98465a, arrayList2, map2, arrayList, i11 | 2, null);
            m119981P(m120002o, arrayList2, map2, arrayList, 2, null);
            if (z12) {
                HashSet hashSet = new HashSet();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    hashSet.add(((ContactProfile) it.next()).f42434r);
                }
                if (!hashSet.contains("204278670")) {
                    ArrayList arrayList5 = new ArrayList();
                    ContactProfile m141809c = C28203u6.f131407a.m141809c("204278670");
                    String str2 = AbstractC23304d.f113377e;
                    if (m141809c == null) {
                        C0843s0.m2286r().m2294e(new AbstractC0826k.c("204278670", new TrackingSource((short) 1047)));
                    } else {
                        str2 = m141809c.f42446v;
                    }
                    for (String str3 : AbstractC23136l9.m118755v0(AbstractC16775v.array_language_as_code)) {
                        ContactProfile contactProfile = new ContactProfile("204278670");
                        String m114548o = AbstractC21935u.m114548o(str3);
                        if (!TextUtils.isEmpty(m114548o)) {
                            contactProfile.f42437s = m114548o;
                            if (!TextUtils.isEmpty(str2)) {
                                contactProfile.f42446v = str2;
                            }
                            contactProfile.f42359M1 = true;
                            arrayList5.add(contactProfile);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Map map3 = C19669z.f97573U;
                    if (AbstractC23148n.m118841o()) {
                        i12 = 32;
                    } else {
                        i12 = 0;
                    }
                    m119979N(m120002o, arrayList5, arrayList6, map3, arrayList, 66 | i12, null);
                    if (!arrayList6.isEmpty()) {
                        Iterator it2 = arrayList6.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                ContactProfile contactProfile2 = (ContactProfile) it2.next();
                                if (contactProfile2.mo2475c().equals(AbstractC21935u.m114547n())) {
                                    arrayList2.add(contactProfile2);
                                    break;
                                }
                            } else {
                                arrayList2.add((ContactProfile) arrayList6.get(0));
                                break;
                            }
                        }
                        Collections.sort(arrayList2, ContactProfile.f42319Z1);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList2;
    }

    /* renamed from: t */
    public static List m120007t(String str, List list, Map map, boolean z11, boolean z12) {
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2 = new ArrayList();
        try {
            String m120002o = m120002o(str);
            ArrayList arrayList3 = new ArrayList();
            if (!map.containsKey(m120002o)) {
                String[] m119967B = m119967B(m120002o);
                for (Map.Entry entry : AbstractC23304d.f113429r.entrySet()) {
                    String[] m119970E = m119970E((String) entry.getKey());
                    ArrayList arrayList4 = (ArrayList) entry.getValue();
                    float m120001n = m120001n(m119967B, m119970E);
                    if (m120001n > 0.0f) {
                        for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                            C32093r8 c32093r8 = new C32093r8();
                            c32093r8.f147887d = ((C32093r8) arrayList4.get(i12)).f147887d;
                            c32093r8.f147884a = ((C32093r8) arrayList4.get(i12)).f147884a;
                            c32093r8.f147886c = ((C32093r8) arrayList4.get(i12)).f147886c;
                            c32093r8.f147890g = m120001n;
                            c32093r8.f147885b = ((C32093r8) arrayList4.get(i12)).f147885b;
                            c32093r8.f147893j = ((C32093r8) arrayList4.get(i12)).f147893j;
                            arrayList3.add(c32093r8);
                        }
                        map.put(m120002o, arrayList3);
                    }
                }
                arrayList = arrayList3;
            } else {
                arrayList = (ArrayList) map.get(m120002o);
            }
            Map map2 = C19669z.f97573U;
            HashMap hashMap = new HashMap();
            if (z11) {
                i11 = 1024;
            } else {
                i11 = 0;
            }
            m119984S(m120002o, list, arrayList2, map2, arrayList, hashMap, i11, null, true);
            if (z12) {
                C23045d6.m118234c().m118237d(m120002o, arrayList2, true);
            }
            m119975J(arrayList2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList2;
    }

    /* renamed from: u */
    public static String m120008u(List list) {
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        if (size == 0) {
            return jSONArray.toString();
        }
        for (int i11 = 0; i11 < size; i11++) {
            try {
                C32093r8 c32093r8 = (C32093r8) list.get(i11);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uid", c32093r8.f147884a);
                jSONObject.put("dpn", c32093r8.f147887d);
                jSONObject.put("countClick", c32093r8.f147886c);
                jSONObject.put("typeBonus", c32093r8.f147892i);
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = c32093r8.f147893j;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i12 = 0; i12 < c32093r8.f147893j.size(); i12++) {
                        jSONArray2.put(c32093r8.f147893j.get(i12));
                    }
                }
                jSONObject.put("arrTimestamp", jSONArray2);
                jSONArray.put(jSONObject);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: v */
    public static float m120009v(int i11) {
        if (i11 == 1) {
            return 1.0f;
        }
        return i11 == 2 ? 2.0f : 0.8f;
    }

    /* renamed from: w */
    private static boolean m120010w(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    /* renamed from: x */
    public static /* synthetic */ int m120011x(String str, String str2) {
        if (str.length() > str2.length()) {
            return -1;
        }
        if (str.length() < str2.length()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: y */
    public static /* synthetic */ int m120012y(String str, String str2) {
        if (str.length() > str2.length()) {
            return -1;
        }
        if (str.length() < str2.length()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: z */
    public static /* synthetic */ int m120013z(String str, String str2) {
        if (str.length() > str2.length()) {
            return -1;
        }
        if (str.length() < str2.length()) {
            return 1;
        }
        return 0;
    }
}
