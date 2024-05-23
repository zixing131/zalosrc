package me0;

import am.AbstractC0924m0;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import bn.C2876h0;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.RichTextFormat;
import com.zing.zalo.social.controls.MentionSpan;
import com.zing.zalo.social.controls.MsgInfoSpan;
import com.zing.zalo.social.controls.SuggestionTimeSpan;
import dj.C17945a0;
import ho0.AbstractC20110a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nb0.C23675f;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p588vw.C28652r;
import p716zh.C31899e6;
import p716zh.C31944h6;
import tj.C26712d;
import vg.AbstractC28207v1;

/* renamed from: me0.t */
/* loaded from: classes4.dex */
public abstract class AbstractC23214t {

    /* renamed from: a */
    private static boolean f112478a;

    /* renamed from: b */
    private static Constructor f112479b;

    /* renamed from: c */
    private static Object[] f112480c;

    /* renamed from: d */
    private static Object f112481d;

    /* renamed from: me0.t$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        public CharSequence f112482a;

        /* renamed from: b */
        public CharSequence f112483b;

        /* renamed from: c */
        public StaticLayout f112484c;

        /* renamed from: g */
        public boolean f112488g;

        /* renamed from: i */
        public C31944h6.b f112490i;

        /* renamed from: j */
        public boolean f112491j;

        /* renamed from: k */
        public boolean f112492k;

        /* renamed from: d */
        public int f112485d = 0;

        /* renamed from: e */
        public int f112486e = 0;

        /* renamed from: f */
        public float f112487f = 0.0f;

        /* renamed from: h */
        public int f112489h = -1;
    }

    /* renamed from: a */
    public static List m119614a(List list, Layout layout, int i11, int i12, int i13) {
        ArrayList arrayList = new ArrayList();
        if (layout != null && list != null) {
            boolean z11 = false;
            for (int i14 = 0; i14 < list.size(); i14++) {
                try {
                    int[] iArr = (int[]) list.get(i14);
                    if (iArr.length > 1) {
                        int i15 = iArr[0];
                        int i16 = iArr[1];
                        if (i15 >= 0 && i16 > 0 && i15 <= i16) {
                            if (i16 <= i11) {
                                C31899e6 c31899e6 = new C31899e6();
                                c31899e6.m153286b(layout, i15);
                                layout.getSelectionPath(i15, i16, c31899e6);
                                c31899e6.offset(i12, i13);
                                arrayList.add(c31899e6);
                            } else if (!z11) {
                                int min = Math.min(i15, i11);
                                int length = layout.getText().length();
                                C31899e6 c31899e62 = new C31899e6();
                                c31899e62.m153286b(layout, min);
                                layout.getSelectionPath(min, length, c31899e62);
                                c31899e62.offset(i12, i13);
                                arrayList.add(c31899e62);
                                z11 = true;
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m119615b(C17945a0 c17945a0, C26712d c26712d) {
        if ((c17945a0.m95032V6() && (c26712d.m137341i() & 2) == 0) || (!c17945a0.m95032V6() && (c26712d.m137341i() & 1) == 0)) {
            return false;
        }
        if ((c17945a0.m94847A6() && (c26712d.m137342j() & 2) == 0) || (!c17945a0.m94847A6() && (c26712d.m137342j() & 1) == 0)) {
            return false;
        }
        return AbstractC28207v1.m141992i1(c26712d.m137334b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0227 A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:228:0x0165, B:236:0x017c, B:238:0x018c, B:244:0x016e, B:59:0x01aa, B:61:0x01b0, B:63:0x01b8, B:64:0x01c2, B:66:0x01c8, B:68:0x01d4, B:71:0x01dd, B:73:0x01e1, B:78:0x01e5, B:82:0x01eb, B:85:0x01f2, B:87:0x01f8, B:88:0x01fc, B:90:0x0202, B:93:0x0211, B:96:0x0215, B:105:0x021f, B:113:0x020d, B:116:0x0227, B:118:0x022d, B:119:0x0231, B:121:0x0237, B:124:0x0246, B:126:0x024a, B:136:0x0254, B:142:0x0242, B:145:0x025f, B:148:0x0268, B:149:0x026c, B:151:0x0272, B:157:0x0264), top: B:227:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0237 A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:228:0x0165, B:236:0x017c, B:238:0x018c, B:244:0x016e, B:59:0x01aa, B:61:0x01b0, B:63:0x01b8, B:64:0x01c2, B:66:0x01c8, B:68:0x01d4, B:71:0x01dd, B:73:0x01e1, B:78:0x01e5, B:82:0x01eb, B:85:0x01f2, B:87:0x01f8, B:88:0x01fc, B:90:0x0202, B:93:0x0211, B:96:0x0215, B:105:0x021f, B:113:0x020d, B:116:0x0227, B:118:0x022d, B:119:0x0231, B:121:0x0237, B:124:0x0246, B:126:0x024a, B:136:0x0254, B:142:0x0242, B:145:0x025f, B:148:0x0268, B:149:0x026c, B:151:0x0272, B:157:0x0264), top: B:227:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025f A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:228:0x0165, B:236:0x017c, B:238:0x018c, B:244:0x016e, B:59:0x01aa, B:61:0x01b0, B:63:0x01b8, B:64:0x01c2, B:66:0x01c8, B:68:0x01d4, B:71:0x01dd, B:73:0x01e1, B:78:0x01e5, B:82:0x01eb, B:85:0x01f2, B:87:0x01f8, B:88:0x01fc, B:90:0x0202, B:93:0x0211, B:96:0x0215, B:105:0x021f, B:113:0x020d, B:116:0x0227, B:118:0x022d, B:119:0x0231, B:121:0x0237, B:124:0x0246, B:126:0x024a, B:136:0x0254, B:142:0x0242, B:145:0x025f, B:148:0x0268, B:149:0x026c, B:151:0x0272, B:157:0x0264), top: B:227:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028f A[Catch: Exception -> 0x0025, TryCatch #7 {Exception -> 0x0025, blocks: (B:4:0x001b, B:6:0x002e, B:8:0x003e, B:11:0x0044, B:13:0x004b, B:54:0x013a, B:156:0x027d, B:158:0x0280, B:160:0x028f, B:162:0x029d, B:164:0x02a7, B:165:0x02af, B:167:0x02b7, B:168:0x02bd, B:170:0x02c7, B:173:0x030a, B:192:0x0324, B:186:0x0336, B:188:0x032c, B:201:0x0347, B:203:0x034c, B:205:0x0350, B:206:0x0385, B:210:0x0373, B:196:0x0318, B:212:0x02e9, B:213:0x02b9, B:257:0x0130, B:293:0x0028, B:176:0x0310, B:179:0x031c), top: B:2:0x0019, inners: #4, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b7 A[Catch: Exception -> 0x0025, TryCatch #7 {Exception -> 0x0025, blocks: (B:4:0x001b, B:6:0x002e, B:8:0x003e, B:11:0x0044, B:13:0x004b, B:54:0x013a, B:156:0x027d, B:158:0x0280, B:160:0x028f, B:162:0x029d, B:164:0x02a7, B:165:0x02af, B:167:0x02b7, B:168:0x02bd, B:170:0x02c7, B:173:0x030a, B:192:0x0324, B:186:0x0336, B:188:0x032c, B:201:0x0347, B:203:0x034c, B:205:0x0350, B:206:0x0385, B:210:0x0373, B:196:0x0318, B:212:0x02e9, B:213:0x02b9, B:257:0x0130, B:293:0x0028, B:176:0x0310, B:179:0x031c), top: B:2:0x0019, inners: #4, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c7 A[Catch: Exception -> 0x0025, TryCatch #7 {Exception -> 0x0025, blocks: (B:4:0x001b, B:6:0x002e, B:8:0x003e, B:11:0x0044, B:13:0x004b, B:54:0x013a, B:156:0x027d, B:158:0x0280, B:160:0x028f, B:162:0x029d, B:164:0x02a7, B:165:0x02af, B:167:0x02b7, B:168:0x02bd, B:170:0x02c7, B:173:0x030a, B:192:0x0324, B:186:0x0336, B:188:0x032c, B:201:0x0347, B:203:0x034c, B:205:0x0350, B:206:0x0385, B:210:0x0373, B:196:0x0318, B:212:0x02e9, B:213:0x02b9, B:257:0x0130, B:293:0x0028, B:176:0x0310, B:179:0x031c), top: B:2:0x0019, inners: #4, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0310 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x034c A[Catch: Exception -> 0x0025, TryCatch #7 {Exception -> 0x0025, blocks: (B:4:0x001b, B:6:0x002e, B:8:0x003e, B:11:0x0044, B:13:0x004b, B:54:0x013a, B:156:0x027d, B:158:0x0280, B:160:0x028f, B:162:0x029d, B:164:0x02a7, B:165:0x02af, B:167:0x02b7, B:168:0x02bd, B:170:0x02c7, B:173:0x030a, B:192:0x0324, B:186:0x0336, B:188:0x032c, B:201:0x0347, B:203:0x034c, B:205:0x0350, B:206:0x0385, B:210:0x0373, B:196:0x0318, B:212:0x02e9, B:213:0x02b9, B:257:0x0130, B:293:0x0028, B:176:0x0310, B:179:0x031c), top: B:2:0x0019, inners: #4, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02e9 A[Catch: Exception -> 0x0025, TryCatch #7 {Exception -> 0x0025, blocks: (B:4:0x001b, B:6:0x002e, B:8:0x003e, B:11:0x0044, B:13:0x004b, B:54:0x013a, B:156:0x027d, B:158:0x0280, B:160:0x028f, B:162:0x029d, B:164:0x02a7, B:165:0x02af, B:167:0x02b7, B:168:0x02bd, B:170:0x02c7, B:173:0x030a, B:192:0x0324, B:186:0x0336, B:188:0x032c, B:201:0x0347, B:203:0x034c, B:205:0x0350, B:206:0x0385, B:210:0x0373, B:196:0x0318, B:212:0x02e9, B:213:0x02b9, B:257:0x0130, B:293:0x0028, B:176:0x0310, B:179:0x031c), top: B:2:0x0019, inners: #4, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b9 A[Catch: Exception -> 0x0025, TryCatch #7 {Exception -> 0x0025, blocks: (B:4:0x001b, B:6:0x002e, B:8:0x003e, B:11:0x0044, B:13:0x004b, B:54:0x013a, B:156:0x027d, B:158:0x0280, B:160:0x028f, B:162:0x029d, B:164:0x02a7, B:165:0x02af, B:167:0x02b7, B:168:0x02bd, B:170:0x02c7, B:173:0x030a, B:192:0x0324, B:186:0x0336, B:188:0x032c, B:201:0x0347, B:203:0x034c, B:205:0x0350, B:206:0x0385, B:210:0x0373, B:196:0x0318, B:212:0x02e9, B:213:0x02b9, B:257:0x0130, B:293:0x0028, B:176:0x0310, B:179:0x031c), top: B:2:0x0019, inners: #4, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[Catch: Exception -> 0x0061, TryCatch #11 {Exception -> 0x0061, blocks: (B:285:0x0058, B:20:0x006a, B:22:0x006e, B:23:0x0072, B:25:0x0078), top: B:284:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:228:0x0165, B:236:0x017c, B:238:0x018c, B:244:0x016e, B:59:0x01aa, B:61:0x01b0, B:63:0x01b8, B:64:0x01c2, B:66:0x01c8, B:68:0x01d4, B:71:0x01dd, B:73:0x01e1, B:78:0x01e5, B:82:0x01eb, B:85:0x01f2, B:87:0x01f8, B:88:0x01fc, B:90:0x0202, B:93:0x0211, B:96:0x0215, B:105:0x021f, B:113:0x020d, B:116:0x0227, B:118:0x022d, B:119:0x0231, B:121:0x0237, B:124:0x0246, B:126:0x024a, B:136:0x0254, B:142:0x0242, B:145:0x025f, B:148:0x0268, B:149:0x026c, B:151:0x0272, B:157:0x0264), top: B:227:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b8 A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:228:0x0165, B:236:0x017c, B:238:0x018c, B:244:0x016e, B:59:0x01aa, B:61:0x01b0, B:63:0x01b8, B:64:0x01c2, B:66:0x01c8, B:68:0x01d4, B:71:0x01dd, B:73:0x01e1, B:78:0x01e5, B:82:0x01eb, B:85:0x01f2, B:87:0x01f8, B:88:0x01fc, B:90:0x0202, B:93:0x0211, B:96:0x0215, B:105:0x021f, B:113:0x020d, B:116:0x0227, B:118:0x022d, B:119:0x0231, B:121:0x0237, B:124:0x0246, B:126:0x024a, B:136:0x0254, B:142:0x0242, B:145:0x025f, B:148:0x0268, B:149:0x026c, B:151:0x0272, B:157:0x0264), top: B:227:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f2 A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:228:0x0165, B:236:0x017c, B:238:0x018c, B:244:0x016e, B:59:0x01aa, B:61:0x01b0, B:63:0x01b8, B:64:0x01c2, B:66:0x01c8, B:68:0x01d4, B:71:0x01dd, B:73:0x01e1, B:78:0x01e5, B:82:0x01eb, B:85:0x01f2, B:87:0x01f8, B:88:0x01fc, B:90:0x0202, B:93:0x0211, B:96:0x0215, B:105:0x021f, B:113:0x020d, B:116:0x0227, B:118:0x022d, B:119:0x0231, B:121:0x0237, B:124:0x0246, B:126:0x024a, B:136:0x0254, B:142:0x0242, B:145:0x025f, B:148:0x0268, B:149:0x026c, B:151:0x0272, B:157:0x0264), top: B:227:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0202 A[Catch: Exception -> 0x0187, TryCatch #2 {Exception -> 0x0187, blocks: (B:228:0x0165, B:236:0x017c, B:238:0x018c, B:244:0x016e, B:59:0x01aa, B:61:0x01b0, B:63:0x01b8, B:64:0x01c2, B:66:0x01c8, B:68:0x01d4, B:71:0x01dd, B:73:0x01e1, B:78:0x01e5, B:82:0x01eb, B:85:0x01f2, B:87:0x01f8, B:88:0x01fc, B:90:0x0202, B:93:0x0211, B:96:0x0215, B:105:0x021f, B:113:0x020d, B:116:0x0227, B:118:0x022d, B:119:0x0231, B:121:0x0237, B:124:0x0246, B:126:0x024a, B:136:0x0254, B:142:0x0242, B:145:0x025f, B:148:0x0268, B:149:0x026c, B:151:0x0272, B:157:0x0264), top: B:227:0x0165 }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.text.Spanned, java.lang.CharSequence, android.text.SpannableString, android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r4v18, types: [com.zing.zalo.control.RichTextFormat] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a m119616c(CharSequence charSequence, TextPaint textPaint, int i11, int i12, boolean z11, boolean z12, ArrayList arrayList, int i13, ArrayList arrayList2, ArrayList arrayList3, List list, int i14, float f11, float f12) {
        SpannableString spannableString;
        ?? r12;
        boolean z13;
        ArrayList<C31944h6.b> arrayList4;
        boolean z14;
        C31944h6.b m119621h;
        boolean z15;
        C31944h6.b bVar;
        boolean z16;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        int i15;
        float f13;
        boolean z17;
        int min;
        CharSequence charSequence2;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        StaticLayout.Builder breakStrategy;
        float f14;
        float f15;
        StaticLayout.Builder obtain2;
        StaticLayout.Builder lineSpacing2;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder includePad2;
        StaticLayout.Builder breakStrategy2;
        Iterator it;
        int i16;
        Iterator it2;
        int i17;
        int size;
        ArrayList arrayList5;
        Exception exc;
        boolean z18;
        boolean z19;
        boolean z21;
        ArrayList arrayList6;
        boolean z22;
        C31944h6.b bVar2;
        ArrayList arrayList7 = arrayList;
        a aVar = new a();
        try {
            if (z11) {
                spannableString = m119634u(charSequence.toString(), aVar, arrayList2);
            } else {
                spannableString = new SpannableString(charSequence);
            }
            r12 = spannableString;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) r12.getSpans(0, r12.length(), ClickableSpan.class);
            z13 = clickableSpanArr != null && clickableSpanArr.length >= 0;
            ArrayList arrayList8 = new ArrayList();
            if (z12 && C31944h6.m153544j(r12)) {
                try {
                    ArrayList m153537c = C31944h6.m153537c(r12, 7);
                    try {
                        if (m153537c != null) {
                            try {
                                if (!m153537c.isEmpty()) {
                                    z19 = true;
                                    z13 |= z19;
                                    if (m153537c != null) {
                                        Iterator it3 = m153537c.iterator();
                                        while (it3.hasNext()) {
                                            if (((C31944h6.b) it3.next()).f146792e == 1) {
                                                z21 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z21 = false;
                                    if (aVar.f112492k || m153537c.isEmpty() || ((C31944h6.b) m153537c.get(m153537c.size() - 1)).f146790c != aVar.f112489h) {
                                        arrayList6 = m153537c;
                                    } else {
                                        SpannableString spannableString2 = new SpannableString(charSequence);
                                        C31944h6.b bVar3 = (C31944h6.b) m153537c.get(m153537c.size() - 1);
                                        arrayList6 = m153537c;
                                        try {
                                            ArrayList m153537c2 = C31944h6.m153537c(spannableString2, 7);
                                            if (!m153537c2.isEmpty()) {
                                                try {
                                                    Iterator it4 = m153537c2.iterator();
                                                    while (it4.hasNext()) {
                                                        C31944h6.b bVar4 = (C31944h6.b) it4.next();
                                                        Iterator it5 = it4;
                                                        if (bVar4.f146789b == bVar3.f146789b) {
                                                            bVar2 = bVar4;
                                                            break;
                                                        }
                                                        it4 = it5;
                                                    }
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    exc = e;
                                                    z18 = z21;
                                                    arrayList8 = arrayList6;
                                                    exc.printStackTrace();
                                                    z14 = z18;
                                                    arrayList4 = arrayList8;
                                                    m119621h = m119621h(arrayList4, charSequence.toString());
                                                    if (arrayList7 != null) {
                                                    }
                                                    z15 = z14;
                                                    bVar = m119621h;
                                                    z16 = z13;
                                                    if (arrayList3 != null) {
                                                    }
                                                    if (arrayList2 != null) {
                                                    }
                                                    if (arrayList3 != null) {
                                                    }
                                                    if (list != null) {
                                                    }
                                                    if (textPaint.getTextSize() > AbstractC23136l9.m118742r(45.0f)) {
                                                    }
                                                    CharSequence m143351B = C28652r.m143349v().m143351B((SpannableString) r12, i14 != 0 ? i14 : textPaint.getTextSize());
                                                    if (Build.VERSION.SDK_INT < 24) {
                                                    }
                                                    staticLayout2 = staticLayout;
                                                    float f16 = 0.0f;
                                                    i15 = 0;
                                                    f13 = 0.0f;
                                                    float f17 = 0.0f;
                                                    float f18 = 0.0f;
                                                    z17 = false;
                                                    while (i15 < staticLayout2.getLineCount()) {
                                                    }
                                                    if (z17) {
                                                    }
                                                    if (f13 <= i11) {
                                                    }
                                                    min = Math.min(i11, Math.max((int) Math.ceil(f13), i12));
                                                    charSequence2 = charSequence;
                                                    aVar.f112482a = charSequence2;
                                                    aVar.f112483b = m143351B;
                                                    aVar.f112484c = staticLayout2;
                                                    aVar.f112485d = min;
                                                    aVar.f112486e = i11;
                                                    aVar.f112488g = z16;
                                                    aVar.f112487f = f16;
                                                    aVar.f112490i = bVar;
                                                    aVar.f112491j = z15;
                                                    return aVar;
                                                }
                                            }
                                            bVar2 = null;
                                            if (bVar2 != null) {
                                                z22 = z13;
                                                try {
                                                    URLSpan[] uRLSpanArr = (URLSpan[]) r12.getSpans(bVar3.f146789b, bVar3.f146790c, URLSpan.class);
                                                    if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                                                        r12.removeSpan(uRLSpanArr[0]);
                                                        C31944h6.m153540f(bVar2.f146788a, bVar3.f146789b, bVar3.f146790c, r12);
                                                    }
                                                    z13 = z22;
                                                    arrayList4 = arrayList6;
                                                    z14 = z21;
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    z13 = z22;
                                                    exc = e;
                                                    z18 = z21;
                                                    arrayList8 = arrayList6;
                                                    exc.printStackTrace();
                                                    z14 = z18;
                                                    arrayList4 = arrayList8;
                                                    m119621h = m119621h(arrayList4, charSequence.toString());
                                                    if (arrayList7 != null) {
                                                    }
                                                    z15 = z14;
                                                    bVar = m119621h;
                                                    z16 = z13;
                                                    if (arrayList3 != null) {
                                                    }
                                                    if (arrayList2 != null) {
                                                    }
                                                    if (arrayList3 != null) {
                                                    }
                                                    if (list != null) {
                                                    }
                                                    if (textPaint.getTextSize() > AbstractC23136l9.m118742r(45.0f)) {
                                                    }
                                                    CharSequence m143351B2 = C28652r.m143349v().m143351B((SpannableString) r12, i14 != 0 ? i14 : textPaint.getTextSize());
                                                    if (Build.VERSION.SDK_INT < 24) {
                                                    }
                                                    staticLayout2 = staticLayout;
                                                    float f162 = 0.0f;
                                                    i15 = 0;
                                                    f13 = 0.0f;
                                                    float f172 = 0.0f;
                                                    float f182 = 0.0f;
                                                    z17 = false;
                                                    while (i15 < staticLayout2.getLineCount()) {
                                                    }
                                                    if (z17) {
                                                    }
                                                    if (f13 <= i11) {
                                                    }
                                                    min = Math.min(i11, Math.max((int) Math.ceil(f13), i12));
                                                    charSequence2 = charSequence;
                                                    aVar.f112482a = charSequence2;
                                                    aVar.f112483b = m143351B2;
                                                    aVar.f112484c = staticLayout2;
                                                    aVar.f112485d = min;
                                                    aVar.f112486e = i11;
                                                    aVar.f112488g = z16;
                                                    aVar.f112487f = f162;
                                                    aVar.f112490i = bVar;
                                                    aVar.f112491j = z15;
                                                    return aVar;
                                                }
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            exc = e;
                                            z18 = z21;
                                            arrayList8 = arrayList6;
                                            exc.printStackTrace();
                                            z14 = z18;
                                            arrayList4 = arrayList8;
                                            m119621h = m119621h(arrayList4, charSequence.toString());
                                            if (arrayList7 != null) {
                                            }
                                            z15 = z14;
                                            bVar = m119621h;
                                            z16 = z13;
                                            if (arrayList3 != null) {
                                            }
                                            if (arrayList2 != null) {
                                            }
                                            if (arrayList3 != null) {
                                            }
                                            if (list != null) {
                                            }
                                            if (textPaint.getTextSize() > AbstractC23136l9.m118742r(45.0f)) {
                                            }
                                            CharSequence m143351B22 = C28652r.m143349v().m143351B((SpannableString) r12, i14 != 0 ? i14 : textPaint.getTextSize());
                                            if (Build.VERSION.SDK_INT < 24) {
                                            }
                                            staticLayout2 = staticLayout;
                                            float f1622 = 0.0f;
                                            i15 = 0;
                                            f13 = 0.0f;
                                            float f1722 = 0.0f;
                                            float f1822 = 0.0f;
                                            z17 = false;
                                            while (i15 < staticLayout2.getLineCount()) {
                                            }
                                            if (z17) {
                                            }
                                            if (f13 <= i11) {
                                            }
                                            min = Math.min(i11, Math.max((int) Math.ceil(f13), i12));
                                            charSequence2 = charSequence;
                                            aVar.f112482a = charSequence2;
                                            aVar.f112483b = m143351B22;
                                            aVar.f112484c = staticLayout2;
                                            aVar.f112485d = min;
                                            aVar.f112486e = i11;
                                            aVar.f112488g = z16;
                                            aVar.f112487f = f1622;
                                            aVar.f112490i = bVar;
                                            aVar.f112491j = z15;
                                            return aVar;
                                        }
                                    }
                                    z22 = z13;
                                    z13 = z22;
                                    arrayList4 = arrayList6;
                                    z14 = z21;
                                }
                            } catch (Exception e14) {
                                exc = e14;
                                arrayList8 = m153537c;
                                z18 = false;
                                exc.printStackTrace();
                                z14 = z18;
                                arrayList4 = arrayList8;
                                m119621h = m119621h(arrayList4, charSequence.toString());
                                if (arrayList7 != null) {
                                }
                                z15 = z14;
                                bVar = m119621h;
                                z16 = z13;
                                if (arrayList3 != null) {
                                }
                                if (arrayList2 != null) {
                                }
                                if (arrayList3 != null) {
                                }
                                if (list != null) {
                                }
                                if (textPaint.getTextSize() > AbstractC23136l9.m118742r(45.0f)) {
                                }
                                CharSequence m143351B222 = C28652r.m143349v().m143351B((SpannableString) r12, i14 != 0 ? i14 : textPaint.getTextSize());
                                if (Build.VERSION.SDK_INT < 24) {
                                }
                                staticLayout2 = staticLayout;
                                float f16222 = 0.0f;
                                i15 = 0;
                                f13 = 0.0f;
                                float f17222 = 0.0f;
                                float f18222 = 0.0f;
                                z17 = false;
                                while (i15 < staticLayout2.getLineCount()) {
                                }
                                if (z17) {
                                }
                                if (f13 <= i11) {
                                }
                                min = Math.min(i11, Math.max((int) Math.ceil(f13), i12));
                                charSequence2 = charSequence;
                                aVar.f112482a = charSequence2;
                                aVar.f112483b = m143351B222;
                                aVar.f112484c = staticLayout2;
                                aVar.f112485d = min;
                                aVar.f112486e = i11;
                                aVar.f112488g = z16;
                                aVar.f112487f = f16222;
                                aVar.f112490i = bVar;
                                aVar.f112491j = z15;
                                return aVar;
                            }
                        }
                        if (aVar.f112492k) {
                        }
                        arrayList6 = m153537c;
                        z22 = z13;
                        z13 = z22;
                        arrayList4 = arrayList6;
                        z14 = z21;
                    } catch (Exception e15) {
                        e = e15;
                        arrayList6 = m153537c;
                    }
                    z19 = false;
                    z13 |= z19;
                    if (m153537c != null) {
                    }
                    z21 = false;
                } catch (Exception e16) {
                    exc = e16;
                }
            } else {
                arrayList4 = arrayList8;
                z14 = false;
            }
            m119621h = m119621h(arrayList4, charSequence.toString());
        } catch (Exception e17) {
            AbstractC20110a.m104539h(e17);
        }
        if (arrayList7 != null) {
            try {
            } catch (Exception e18) {
                e = e18;
                z15 = z14;
            }
            if (arrayList.size() > 0 && i13 != -1) {
                z15 = z14;
                int i18 = 0;
                while (i18 < arrayList.size()) {
                    try {
                        int[] iArr = (int[]) arrayList7.get(i18);
                        bVar = m119621h;
                        if (iArr.length > 1) {
                            z16 = z13;
                            try {
                                int i19 = iArr[0];
                                int i21 = iArr[1];
                                int i22 = aVar.f112489h;
                                if (i22 <= 0) {
                                    i22 = r12.length();
                                }
                                if (i19 >= 0 && i21 > 0 && i19 <= i21 && i19 < i22 && i21 <= i22) {
                                    r12.setSpan(new ForegroundColorSpan(i13), i19, i21, 33);
                                }
                            } catch (Exception e19) {
                                e = e19;
                                r12 = r12;
                                e.printStackTrace();
                                if (textPaint.getTextSize() > AbstractC23136l9.m118742r(45.0f)) {
                                }
                                CharSequence m143351B2222 = C28652r.m143349v().m143351B((SpannableString) r12, i14 != 0 ? i14 : textPaint.getTextSize());
                                if (Build.VERSION.SDK_INT < 24) {
                                }
                                staticLayout2 = staticLayout;
                                float f162222 = 0.0f;
                                i15 = 0;
                                f13 = 0.0f;
                                float f172222 = 0.0f;
                                float f182222 = 0.0f;
                                z17 = false;
                                while (i15 < staticLayout2.getLineCount()) {
                                }
                                if (z17) {
                                }
                                if (f13 <= i11) {
                                }
                                min = Math.min(i11, Math.max((int) Math.ceil(f13), i12));
                                charSequence2 = charSequence;
                                aVar.f112482a = charSequence2;
                                aVar.f112483b = m143351B2222;
                                aVar.f112484c = staticLayout2;
                                aVar.f112485d = min;
                                aVar.f112486e = i11;
                                aVar.f112488g = z16;
                                aVar.f112487f = f162222;
                                aVar.f112490i = bVar;
                                aVar.f112491j = z15;
                                return aVar;
                            }
                        } else {
                            z16 = z13;
                        }
                        i18++;
                        arrayList7 = arrayList;
                        m119621h = bVar;
                        z13 = z16;
                    } catch (Exception e21) {
                        e = e21;
                        bVar = m119621h;
                        z16 = z13;
                        r12 = r12;
                        e.printStackTrace();
                        if (textPaint.getTextSize() > AbstractC23136l9.m118742r(45.0f)) {
                        }
                        CharSequence m143351B22222 = C28652r.m143349v().m143351B((SpannableString) r12, i14 != 0 ? i14 : textPaint.getTextSize());
                        if (Build.VERSION.SDK_INT < 24) {
                        }
                        staticLayout2 = staticLayout;
                        float f1622222 = 0.0f;
                        i15 = 0;
                        f13 = 0.0f;
                        float f1722222 = 0.0f;
                        float f1822222 = 0.0f;
                        z17 = false;
                        while (i15 < staticLayout2.getLineCount()) {
                        }
                        if (z17) {
                        }
                        if (f13 <= i11) {
                        }
                        min = Math.min(i11, Math.max((int) Math.ceil(f13), i12));
                        charSequence2 = charSequence;
                        aVar.f112482a = charSequence2;
                        aVar.f112483b = m143351B22222;
                        aVar.f112484c = staticLayout2;
                        aVar.f112485d = min;
                        aVar.f112486e = i11;
                        aVar.f112488g = z16;
                        aVar.f112487f = f1622222;
                        aVar.f112490i = bVar;
                        aVar.f112491j = z15;
                        return aVar;
                    }
                }
                bVar = m119621h;
                z16 = z13;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    for (size = arrayList3.size() - 1; size >= 0; size--) {
                        SuggestionTimeSpan suggestionTimeSpan = (SuggestionTimeSpan) arrayList3.get(size);
                        for (C31944h6.b bVar5 : arrayList4) {
                            int i23 = suggestionTimeSpan.f54800p;
                            int i24 = bVar5.f146789b;
                            if (i23 >= i24) {
                                arrayList5 = arrayList4;
                                if (i23 > bVar5.f146790c) {
                                }
                                arrayList3.remove(size);
                                arrayList4 = arrayList5;
                            } else {
                                arrayList5 = arrayList4;
                            }
                            int i25 = suggestionTimeSpan.f54801q;
                            if (i25 >= i24) {
                                if (i25 > bVar5.f146790c) {
                                }
                                arrayList3.remove(size);
                            }
                            arrayList4 = arrayList5;
                        }
                    }
                }
                if (arrayList2 != null && arrayList2.size() > 0) {
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        MentionSpan mentionSpan = (MentionSpan) it2.next();
                        int i26 = aVar.f112489h;
                        if (i26 <= 0) {
                            i26 = r12.length();
                        }
                        int i27 = mentionSpan.f54786q;
                        if (i27 >= 0 && (i17 = mentionSpan.f54787r) > 0 && i27 <= i17 && i27 < i26 && i17 <= i26) {
                            r12.setSpan(mentionSpan, i27, i17, 33);
                        }
                    }
                }
                if (arrayList3 != null && arrayList3.size() > 0) {
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        SuggestionTimeSpan suggestionTimeSpan2 = (SuggestionTimeSpan) it.next();
                        int i28 = aVar.f112489h;
                        if (i28 <= 0) {
                            i28 = r12.length();
                        }
                        int i29 = suggestionTimeSpan2.f54800p;
                        if (i29 >= 0 && (i16 = suggestionTimeSpan2.f54801q) > 0 && i29 <= i16 && i29 < i28 && i16 <= i28) {
                            r12.setSpan(suggestionTimeSpan2, i29, i16, 33);
                        }
                    }
                }
                if (list != null) {
                    int i31 = aVar.f112489h;
                    if (i31 <= 0) {
                        i31 = r12.length();
                    }
                    Iterator it6 = list.iterator();
                    r12 = r12;
                    while (it6.hasNext()) {
                        r12 = ((RichTextFormat) it6.next()).m40645a(r12, i31);
                    }
                }
                if (textPaint.getTextSize() > AbstractC23136l9.m118742r(45.0f) && C28652r.m143349v().m143377q(charSequence.toString()) == null && !C2876h0.m13820S(charSequence.toString())) {
                    textPaint.setTextSize(AbstractC23136l9.m118742r(45.0f));
                }
                CharSequence m143351B222222 = C28652r.m143349v().m143351B((SpannableString) r12, i14 != 0 ? i14 : textPaint.getTextSize());
                if (Build.VERSION.SDK_INT < 24) {
                    obtain2 = StaticLayout.Builder.obtain(m143351B222222, 0, m143351B222222.length(), textPaint, i11);
                    lineSpacing2 = obtain2.setLineSpacing(f12, f11);
                    alignment2 = lineSpacing2.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                    includePad2 = alignment2.setIncludePad(false);
                    breakStrategy2 = includePad2.setBreakStrategy(1);
                    staticLayout = breakStrategy2.build();
                } else {
                    staticLayout = new StaticLayout(m143351B222222, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, f11, f12, false);
                }
                staticLayout2 = staticLayout;
                float f16222222 = 0.0f;
                i15 = 0;
                f13 = 0.0f;
                float f17222222 = 0.0f;
                float f18222222 = 0.0f;
                z17 = false;
                while (i15 < staticLayout2.getLineCount()) {
                    try {
                        f14 = staticLayout2.getLineWidth(i15);
                    } catch (Exception e22) {
                        e22.printStackTrace();
                        f14 = 0.0f;
                    }
                    try {
                        f15 = staticLayout2.getLineLeft(i15);
                    } catch (Exception e23) {
                        e23.printStackTrace();
                        f15 = 0.0f;
                    }
                    f18222222 = i15 == 0 ? f15 : Math.min(f18222222, f15);
                    if (f15 == 0.0f) {
                        z17 = true;
                    }
                    f17222222 = Math.max(f17222222, f14);
                    f13 = Math.max(f13, f14 + f15);
                    i15++;
                }
                if (z17) {
                    f13 = f17222222;
                    f16222222 = f18222222;
                }
                if (f13 <= i11 && Build.VERSION.SDK_INT >= 24) {
                    obtain = StaticLayout.Builder.obtain(m143351B222222, 0, m143351B222222.length(), textPaint, i11);
                    lineSpacing = obtain.setLineSpacing(f12, f11);
                    alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                    includePad = alignment.setIncludePad(false);
                    breakStrategy = includePad.setBreakStrategy(0);
                    staticLayout2 = breakStrategy.build();
                    charSequence2 = charSequence;
                    min = i11;
                } else {
                    min = Math.min(i11, Math.max((int) Math.ceil(f13), i12));
                    charSequence2 = charSequence;
                }
                aVar.f112482a = charSequence2;
                aVar.f112483b = m143351B222222;
                aVar.f112484c = staticLayout2;
                aVar.f112485d = min;
                aVar.f112486e = i11;
                aVar.f112488g = z16;
                aVar.f112487f = f16222222;
                aVar.f112490i = bVar;
                aVar.f112491j = z15;
                return aVar;
            }
        }
        z15 = z14;
        bVar = m119621h;
        z16 = z13;
        if (arrayList3 != null) {
            while (size >= 0) {
            }
        }
        if (arrayList2 != null) {
            it2 = arrayList2.iterator();
            while (it2.hasNext()) {
            }
        }
        if (arrayList3 != null) {
            it = arrayList3.iterator();
            while (it.hasNext()) {
            }
        }
        if (list != null) {
        }
        if (textPaint.getTextSize() > AbstractC23136l9.m118742r(45.0f)) {
            textPaint.setTextSize(AbstractC23136l9.m118742r(45.0f));
        }
        CharSequence m143351B2222222 = C28652r.m143349v().m143351B((SpannableString) r12, i14 != 0 ? i14 : textPaint.getTextSize());
        if (Build.VERSION.SDK_INT < 24) {
        }
        staticLayout2 = staticLayout;
        float f162222222 = 0.0f;
        i15 = 0;
        f13 = 0.0f;
        float f172222222 = 0.0f;
        float f182222222 = 0.0f;
        z17 = false;
        while (i15 < staticLayout2.getLineCount()) {
        }
        if (z17) {
        }
        if (f13 <= i11) {
        }
        min = Math.min(i11, Math.max((int) Math.ceil(f13), i12));
        charSequence2 = charSequence;
        aVar.f112482a = charSequence2;
        aVar.f112483b = m143351B2222222;
        aVar.f112484c = staticLayout2;
        aVar.f112485d = min;
        aVar.f112486e = i11;
        aVar.f112488g = z16;
        aVar.f112487f = f162222222;
        aVar.f112490i = bVar;
        aVar.f112491j = z15;
        return aVar;
    }

    /* renamed from: d */
    public static a m119617d(String str, TextPaint textPaint, int i11, int i12, ArrayList arrayList, List list, boolean z11) {
        boolean z12;
        float f11;
        StaticLayout staticLayout;
        float f12;
        float f13;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        StaticLayout.Builder breakStrategy;
        StaticLayout build;
        int i13;
        a aVar = new a();
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && C31944h6.m153544j(spannableStringBuilder)) {
                try {
                    z12 |= !C31944h6.m153537c(spannableStringBuilder, 7).isEmpty();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            boolean z13 = z12;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MsgInfoSpan msgInfoSpan = (MsgInfoSpan) it.next();
                    int length = spannableStringBuilder.length();
                    int i14 = msgInfoSpan.f54795t;
                    if (i14 >= 0 && (i13 = msgInfoSpan.f54796u) > 0 && i14 <= i13 && i14 < length && i13 <= length) {
                        spannableStringBuilder.setSpan(msgInfoSpan, i14, i13, 33);
                    }
                }
            }
            if (list != null && list.size() > 0) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    MsgInfoSpan msgInfoSpan2 = (MsgInfoSpan) it2.next();
                    SpannableString spannableString = new SpannableString(msgInfoSpan2.m56339c());
                    spannableString.setSpan(msgInfoSpan2, 0, msgInfoSpan2.m56339c().length(), 33);
                    if (spannableStringBuilder.length() == 0 || !AbstractC23244v8.m119754r(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1))) {
                        spannableStringBuilder.append((CharSequence) ".");
                    }
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
            }
            CharSequence m143351B = C28652r.m143349v().m143351B(new SpannableString(spannableStringBuilder), textPaint.getTextSize());
            if (Build.VERSION.SDK_INT >= 24) {
                obtain = StaticLayout.Builder.obtain(m143351B, 0, m143351B.length(), textPaint, i11);
                lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
                alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                includePad = alignment.setIncludePad(false);
                breakStrategy = includePad.setBreakStrategy(2);
                build = breakStrategy.build();
                staticLayout = build;
                f11 = 0.0f;
            } else {
                f11 = 0.0f;
                staticLayout = new StaticLayout(m143351B, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f14 = 0.0f;
            float f15 = 0.0f;
            boolean z14 = false;
            float f16 = 0.0f;
            for (int i15 = 0; i15 < staticLayout.getLineCount(); i15++) {
                try {
                    f12 = staticLayout.getLineWidth(i15);
                } catch (Exception e12) {
                    e12.printStackTrace();
                    f12 = 0.0f;
                }
                try {
                    f13 = staticLayout.getLineLeft(i15);
                } catch (Exception e13) {
                    e13.printStackTrace();
                    f13 = 0.0f;
                }
                if (i15 == 0) {
                    f15 = f13;
                } else {
                    f15 = Math.min(f15, f13);
                }
                if (f13 == f11) {
                    z14 = true;
                }
                f14 = Math.max(f14, f12);
                f16 = Math.max(f16, f12 + f13);
            }
            if (z14) {
                f15 = 0.0f;
            } else {
                f16 = f14;
            }
            int min = Math.min(i11, Math.max((int) Math.ceil(f16), i12));
            aVar.f112482a = str;
            aVar.f112483b = m143351B;
            aVar.f112484c = staticLayout;
            aVar.f112485d = min;
            aVar.f112486e = i11;
            aVar.f112488g = z13;
            aVar.f112487f = f15;
        } catch (Exception e14) {
            AbstractC20110a.m104539h(e14);
        }
        return aVar;
    }

    /* renamed from: e */
    public static StaticLayout m119618e(CharSequence charSequence, int i11, int i12, TextPaint textPaint, int i13, Layout.Alignment alignment, float f11, float f12, boolean z11, TextUtils.TruncateAt truncateAt, int i14, int i15) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder includePad;
        StaticLayout.Builder ellipsize;
        StaticLayout.Builder ellipsizedWidth;
        StaticLayout.Builder maxLines;
        StaticLayout.Builder breakStrategy;
        StaticLayout build;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                obtain = StaticLayout.Builder.obtain(charSequence, i11, i12, textPaint, i13);
            } catch (Exception e11) {
                e = e11;
            }
            try {
                lineSpacing = obtain.setLineSpacing(f12, f11);
                alignment2 = lineSpacing.setAlignment(alignment);
                try {
                    includePad = alignment2.setIncludePad(z11);
                    ellipsize = includePad.setEllipsize(truncateAt);
                    try {
                        ellipsizedWidth = ellipsize.setEllipsizedWidth(i14);
                        maxLines = ellipsizedWidth.setMaxLines(i15);
                        breakStrategy = maxLines.setBreakStrategy(1);
                        build = breakStrategy.build();
                        return build;
                    } catch (Exception e12) {
                        e = e12;
                        e.printStackTrace();
                        m119633t();
                        Object[] objArr = f112480c;
                        objArr[0] = charSequence;
                        objArr[1] = Integer.valueOf(i11);
                        f112480c[2] = Integer.valueOf(i12);
                        Object[] objArr2 = f112480c;
                        objArr2[3] = textPaint;
                        objArr2[4] = Integer.valueOf(i13);
                        Object[] objArr3 = f112480c;
                        objArr3[5] = alignment;
                        objArr3[6] = f112481d;
                        objArr3[7] = Float.valueOf(f11);
                        f112480c[8] = Float.valueOf(f12);
                        f112480c[9] = Boolean.valueOf(z11);
                        Object[] objArr4 = f112480c;
                        objArr4[10] = truncateAt;
                        objArr4[11] = Integer.valueOf(i14);
                        f112480c[12] = Integer.valueOf(i15);
                        return (StaticLayout) f112479b.newInstance(f112480c);
                    }
                } catch (Exception e13) {
                    e = e13;
                    e.printStackTrace();
                    m119633t();
                    Object[] objArr5 = f112480c;
                    objArr5[0] = charSequence;
                    objArr5[1] = Integer.valueOf(i11);
                    f112480c[2] = Integer.valueOf(i12);
                    Object[] objArr22 = f112480c;
                    objArr22[3] = textPaint;
                    objArr22[4] = Integer.valueOf(i13);
                    Object[] objArr32 = f112480c;
                    objArr32[5] = alignment;
                    objArr32[6] = f112481d;
                    objArr32[7] = Float.valueOf(f11);
                    f112480c[8] = Float.valueOf(f12);
                    f112480c[9] = Boolean.valueOf(z11);
                    Object[] objArr42 = f112480c;
                    objArr42[10] = truncateAt;
                    objArr42[11] = Integer.valueOf(i14);
                    f112480c[12] = Integer.valueOf(i15);
                    return (StaticLayout) f112479b.newInstance(f112480c);
                }
            } catch (Exception e14) {
                e = e14;
                e.printStackTrace();
                m119633t();
                Object[] objArr52 = f112480c;
                objArr52[0] = charSequence;
                objArr52[1] = Integer.valueOf(i11);
                f112480c[2] = Integer.valueOf(i12);
                Object[] objArr222 = f112480c;
                objArr222[3] = textPaint;
                objArr222[4] = Integer.valueOf(i13);
                Object[] objArr322 = f112480c;
                objArr322[5] = alignment;
                objArr322[6] = f112481d;
                objArr322[7] = Float.valueOf(f11);
                f112480c[8] = Float.valueOf(f12);
                f112480c[9] = Boolean.valueOf(z11);
                Object[] objArr422 = f112480c;
                objArr422[10] = truncateAt;
                objArr422[11] = Integer.valueOf(i14);
                f112480c[12] = Integer.valueOf(i15);
                return (StaticLayout) f112479b.newInstance(f112480c);
            }
        }
        m119633t();
        try {
            Object[] objArr522 = f112480c;
            objArr522[0] = charSequence;
            objArr522[1] = Integer.valueOf(i11);
            f112480c[2] = Integer.valueOf(i12);
            Object[] objArr2222 = f112480c;
            objArr2222[3] = textPaint;
            objArr2222[4] = Integer.valueOf(i13);
            Object[] objArr3222 = f112480c;
            objArr3222[5] = alignment;
            objArr3222[6] = f112481d;
            objArr3222[7] = Float.valueOf(f11);
            f112480c[8] = Float.valueOf(f12);
            f112480c[9] = Boolean.valueOf(z11);
            Object[] objArr4222 = f112480c;
            objArr4222[10] = truncateAt;
            objArr4222[11] = Integer.valueOf(i14);
            f112480c[12] = Integer.valueOf(i15);
            return (StaticLayout) f112479b.newInstance(f112480c);
        } catch (Exception e15) {
            e15.printStackTrace();
            try {
                if (i15 == 1) {
                    return new StaticLayout(charSequence, i11, i12, textPaint, i13, alignment, f11, f12, z11, truncateAt, i14);
                }
                StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i13, alignment, f11, f12, z11);
                if (staticLayout.getLineCount() <= i15) {
                    return staticLayout;
                }
                return new StaticLayout(charSequence, i11, i12, textPaint, i13, alignment, f11, f12, z11, truncateAt, i14);
            } catch (Exception e16) {
                e16.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: f */
    public static StaticLayout m119619f(CharSequence charSequence, TextPaint textPaint, int i11, Layout.Alignment alignment, float f11, float f12, boolean z11, TextUtils.TruncateAt truncateAt, int i12, int i13) {
        return m119618e(charSequence, 0, charSequence.length(), textPaint, i11, alignment, f11, f12, z11, truncateAt, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007f A[Catch: Exception -> 0x007d, TryCatch #1 {Exception -> 0x007d, blocks: (B:7:0x005d, B:10:0x007f, B:13:0x009c, B:15:0x00a5, B:16:0x00b2, B:18:0x00aa), top: B:4:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005c  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static StaticLayout m119620g(CharSequence charSequence, int i11, int i12, TextPaint textPaint, int i13, Layout.Alignment alignment, float f11, float f12, boolean z11, TextUtils.TruncateAt truncateAt, int i14, int i15) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder includePad;
        StaticLayout.Builder ellipsize;
        StaticLayout.Builder ellipsizedWidth;
        StaticLayout.Builder maxLines;
        StaticLayout.Builder breakStrategy;
        StaticLayout build;
        int offsetForHorizontal;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                obtain = StaticLayout.Builder.obtain(charSequence, i11, i12, textPaint, i13);
                try {
                    lineSpacing = obtain.setLineSpacing(f12, f11);
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
            }
            try {
                alignment2 = lineSpacing.setAlignment(alignment);
                try {
                    includePad = alignment2.setIncludePad(z11);
                    ellipsize = includePad.setEllipsize(truncateAt);
                    ellipsizedWidth = ellipsize.setEllipsizedWidth(i14);
                    maxLines = ellipsizedWidth.setMaxLines(i15);
                    breakStrategy = maxLines.setBreakStrategy(1);
                    build = breakStrategy.build();
                    return build;
                } catch (Exception e13) {
                    e = e13;
                    e.printStackTrace();
                    if (i15 == 1) {
                    }
                }
            } catch (Exception e14) {
                e = e14;
                e.printStackTrace();
                if (i15 == 1) {
                }
            }
        }
        try {
            if (i15 == 1) {
                CharSequence ellipsize2 = TextUtils.ellipsize(charSequence, textPaint, i14, TextUtils.TruncateAt.END);
                return new StaticLayout(ellipsize2, 0, ellipsize2.length(), textPaint, i13, alignment, f11, f12, z11);
            }
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i13, alignment, f11, f12, z11);
            if (staticLayout.getLineCount() <= i15) {
                return staticLayout;
            }
            float lineLeft = staticLayout.getLineLeft(i15);
            if (lineLeft != 0.0f) {
                offsetForHorizontal = staticLayout.getOffsetForHorizontal(i15, lineLeft);
            } else {
                offsetForHorizontal = staticLayout.getOffsetForHorizontal(i15, staticLayout.getLineWidth(i15));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.subSequence(0, Math.max(0, offsetForHorizontal - 1)));
            spannableStringBuilder.append((CharSequence) "…");
            return new StaticLayout(spannableStringBuilder, textPaint, i13, alignment, f11, f12, z11);
        } catch (Exception e15) {
            AbstractC20110a.m104539h(e15);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:            if (r5.f146793f == false) goto L99;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:            if (r8.f146793f == false) goto L118;     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094 A[RETURN] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C31944h6.b m119621h(List list, String str) {
        boolean z11;
        boolean z12;
        boolean z13;
        C31944h6.b bVar;
        boolean z14;
        C31944h6.b bVar2;
        C31944h6.b bVar3 = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int m121227N9 = AbstractC23309i.m121227N9();
        boolean z15 = false;
        if (m121227N9 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((AbstractC0924m0.m3481U9() || z11) && str != null && str.length() <= AbstractC23309i.m121190M9()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m121227N9 == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bVar = (C31944h6.b) it.next();
                if (bVar.f146792e == 1) {
                    if (z13) {
                    }
                }
            }
        }
        bVar = null;
        int m121301P9 = AbstractC23309i.m121301P9();
        if (m121301P9 != 0 && str != null && str.length() <= AbstractC23309i.m121264O9()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (m121301P9 == 1) {
            z15 = true;
        }
        if (z14) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                bVar2 = (C31944h6.b) it2.next();
                if (bVar2.f146792e == 4) {
                    if (z15) {
                    }
                }
            }
        }
        bVar2 = null;
        if (bVar2 != null && bVar != null) {
            if (bVar2.f146789b >= bVar.f146789b) {
                bVar2 = null;
            }
            if (bVar3 == null) {
                return bVar3;
            }
            return bVar2;
        }
        bVar3 = bVar;
        if (bVar3 == null) {
        }
    }

    /* renamed from: i */
    public static a m119622i(TextPaint textPaint, int i11) {
        StaticLayout staticLayout;
        float f11;
        float f12;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        StaticLayout.Builder breakStrategy;
        a aVar = new a();
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_ecard_msg_info_success_title));
            SpannableString spannableString2 = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_ecard_msg_info_success_description));
            MsgInfoSpan msgInfoSpan = new MsgInfoSpan(AbstractC23136l9.m118641B(MainApplication.getAppContext(), AbstractC16801x.cM1), AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more), "action.open.inapp", AbstractC23306f.m120583H().m110204g().f110088w);
            SpannableString spannableString3 = new SpannableString(msgInfoSpan.m56339c());
            spannableString3.setSpan(msgInfoSpan, 0, spannableString3.length(), 33);
            spannableString3.setSpan(new StyleSpan(1), 0, spannableString3.length(), 33);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            spannableString.setSpan(new AbsoluteSizeSpan(AbstractC23136l9.m118742r(16.0f)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) spannableString2);
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) spannableString3);
            float f13 = 0.0f;
            if (Build.VERSION.SDK_INT >= 24) {
                obtain = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i11);
                lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
                alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                includePad = alignment.setIncludePad(false);
                breakStrategy = includePad.setBreakStrategy(1);
                staticLayout = breakStrategy.build();
            } else {
                staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            boolean z11 = false;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            for (int i12 = 0; i12 < staticLayout.getLineCount(); i12++) {
                try {
                    f11 = staticLayout.getLineWidth(i12);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    f11 = 0.0f;
                }
                try {
                    f12 = staticLayout.getLineLeft(i12);
                } catch (Exception e12) {
                    e12.printStackTrace();
                    f12 = 0.0f;
                }
                if (i12 == 0) {
                    f16 = f12;
                } else {
                    f16 = Math.min(f16, f12);
                }
                if (f12 == 0.0f) {
                    z11 = true;
                }
                f15 = Math.max(f15, f11);
                f14 = Math.max(f14, f11 + f12);
            }
            if (!z11) {
                f14 = f15;
                f13 = f16;
            }
            int min = Math.min(i11, Math.max((int) Math.ceil(f14), 0));
            aVar.f112482a = spannableStringBuilder;
            aVar.f112483b = spannableStringBuilder;
            aVar.f112484c = staticLayout;
            aVar.f112485d = min;
            aVar.f112486e = i11;
            aVar.f112488g = true;
            aVar.f112487f = f13;
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
        }
        return aVar;
    }

    /* renamed from: j */
    public static StaticLayout m119623j(CharSequence charSequence, TextPaint textPaint, int i11, int i12, Layout.Alignment alignment) {
        return m119620g(charSequence, 0, charSequence.length(), textPaint, i11, alignment, 1.0f, AbstractC23136l9.m118742r(1.0f), false, TextUtils.TruncateAt.END, i11, i12);
    }

    /* renamed from: k */
    public static StaticLayout m119624k(CharSequence charSequence, TextPaint textPaint, int i11) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        StaticLayout.Builder breakStrategy;
        StaticLayout build;
        if (Build.VERSION.SDK_INT >= 24) {
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11);
            lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
            alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            includePad = alignment.setIncludePad(false);
            breakStrategy = includePad.setBreakStrategy(1);
            build = breakStrategy.build();
            return build;
        }
        return new StaticLayout(charSequence, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    /* renamed from: l */
    public static StaticLayout m119625l(CharSequence charSequence, TextPaint textPaint, int i11, int i12) {
        return m119619f(new SpannableStringBuilder(charSequence), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, AbstractC23136l9.m118742r(1.0f), false, TextUtils.TruncateAt.END, i11, i12);
    }

    /* renamed from: m */
    public static StaticLayout m119626m(CharSequence charSequence, TextPaint textPaint, int i11, int i12, float f11, float f12) {
        return m119619f(new SpannableStringBuilder(charSequence), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, f11, f12, false, TextUtils.TruncateAt.END, i11, i12);
    }

    /* renamed from: n */
    public static StaticLayout m119627n(CharSequence charSequence, TextPaint textPaint, int i11, int i12, Layout.Alignment alignment) {
        return m119619f(new SpannableStringBuilder(charSequence), textPaint, i11, alignment, 1.0f, AbstractC23136l9.m118742r(1.0f), false, TextUtils.TruncateAt.END, i11, i12);
    }

    /* renamed from: o */
    public static StaticLayout m119628o(CharSequence charSequence, TextPaint textPaint, int i11, Layout.Alignment alignment, float f11, float f12, boolean z11) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder includePad;
        StaticLayout.Builder breakStrategy;
        StaticLayout build;
        if (Build.VERSION.SDK_INT >= 24) {
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11);
            lineSpacing = obtain.setLineSpacing(f11, f12);
            alignment2 = lineSpacing.setAlignment(alignment);
            includePad = alignment2.setIncludePad(z11);
            breakStrategy = includePad.setBreakStrategy(1);
            build = breakStrategy.build();
            return build;
        }
        return new StaticLayout(charSequence, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, f12, f11, z11);
    }

    /* renamed from: p */
    public static StaticLayout m119629p(CharSequence charSequence, TextPaint textPaint, int i11) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        StaticLayout.Builder breakStrategy;
        StaticLayout build;
        if (Build.VERSION.SDK_INT >= 24) {
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11);
            lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
            alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_CENTER);
            includePad = alignment.setIncludePad(false);
            breakStrategy = includePad.setBreakStrategy(1);
            build = breakStrategy.build();
            return build;
        }
        return new StaticLayout(charSequence, textPaint, i11, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* renamed from: q */
    public static StaticLayout m119630q(CharSequence charSequence, TextPaint textPaint, int i11, int i12) {
        int m119757u;
        StaticLayout m119625l = m119625l(charSequence, textPaint, i11, i12);
        if (m119625l != null) {
            CharSequence text = m119625l.getText();
            if (m119625l.getLineCount() > 0 && m119625l.getWidth() < m119625l.getLineWidth(m119625l.getLineCount() - 1) && !TextUtils.isEmpty(text) && text.charAt(text.length() - 1) != 8230 && (m119757u = AbstractC23244v8.m119757u(text, (char) 8230)) >= 0 && m119757u < text.length() - 1) {
                return m119625l(text.subSequence(0, m119757u + 1), textPaint, i11, i12);
            }
            return m119625l;
        }
        return m119625l;
    }

    /* renamed from: r */
    public static StaticLayout m119631r(String str, TextPaint textPaint) {
        return m119632s(str, textPaint, (int) (textPaint.getTextSize() + AbstractC23136l9.m118742r(30.0f)));
    }

    /* renamed from: s */
    public static StaticLayout m119632s(String str, TextPaint textPaint, int i11) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new StaticLayout(C28652r.m143349v().m143355F(new SpannableString(str), textPaint.getTextSize()), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: t */
    public static void m119633t() {
        if (f112478a) {
            return;
        }
        try {
            f112481d = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f112479b = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f112480c = new Object[13];
            f112478a = true;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: u */
    public static SpannableString m119634u(String str, a aVar, ArrayList arrayList) {
        int i11;
        int i12;
        String property = System.getProperty("line.separator");
        int length = str.split(property).length;
        if (length <= 10 && str.length() <= 550) {
            return new SpannableString(str);
        }
        if (length > 10) {
            String[] split = str.split(property);
            String str2 = "";
            for (int i13 = 0; i13 < 10; i13++) {
                str2 = str2 + split[i13] + property;
            }
            str = str2;
        }
        if (str.length() >= 550) {
            int lastIndexOf = str.lastIndexOf(" ", 499);
            int lastIndexOf2 = str.lastIndexOf(property, 499);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    MentionSpan mentionSpan = (MentionSpan) it.next();
                    if (mentionSpan.f54786q <= 499 && 499 <= (i12 = mentionSpan.f54787r)) {
                        i11 = i12;
                    }
                }
            } else {
                i11 = 0;
            }
            if (lastIndexOf > 0) {
                str = str.substring(0, Math.max(lastIndexOf, i11));
            } else if (lastIndexOf2 > 0) {
                str = str.substring(0, Math.max(lastIndexOf2, i11));
            } else {
                str = str.substring(0, Math.max(499, i11));
            }
        }
        if (aVar != null) {
            aVar.f112489h = str.length();
            aVar.f112492k = true;
        }
        String string = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_chat_view_more);
        String str3 = str + "… " + string;
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new C23675f(), str3.length() - string.length(), str3.length(), 33);
        return spannableString;
    }
}
