package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import dj.C18013y0;
import ig0.AbstractC20550a;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C32098s;
import p716zh.C32106s7;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowRecommendLink extends ChatRowRecommendLinkBase {

    /* renamed from: O8 */
    public static boolean f58425O8 = false;

    /* renamed from: P8 */
    static final int f58426P8 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: Q8 */
    static final int f58427Q8;

    /* renamed from: R8 */
    static final int f58428R8;

    /* renamed from: S8 */
    static final int f58429S8;

    /* renamed from: T8 */
    static final int f58430T8;

    /* renamed from: U8 */
    static final int f58431U8;

    /* renamed from: V8 */
    static final float[] f58432V8;

    /* renamed from: W8 */
    static final int f58433W8;

    /* renamed from: X8 */
    static final int f58434X8;

    /* renamed from: Y8 */
    static final int f58435Y8;

    /* renamed from: Z8 */
    static final int f58436Z8;

    /* renamed from: a9 */
    static final float[] f58437a9;

    /* renamed from: b9 */
    static final int f58438b9;

    /* renamed from: c9 */
    static final int f58439c9;

    /* renamed from: d9 */
    static final int f58440d9;

    /* renamed from: e9 */
    static final int f58441e9;

    /* renamed from: f9 */
    static C13704p1 f58442f9;

    /* renamed from: g9 */
    static C13704p1 f58443g9;

    /* renamed from: h9 */
    static C13704p1 f58444h9;

    /* renamed from: i9 */
    static float f58445i9;

    /* renamed from: j9 */
    static float f58446j9;

    /* renamed from: A8 */
    int f58447A8;

    /* renamed from: B8 */
    String f58448B8;

    /* renamed from: C8 */
    int f58449C8;

    /* renamed from: D8 */
    String f58450D8;

    /* renamed from: E8 */
    String f58451E8;

    /* renamed from: F8 */
    int f58452F8;

    /* renamed from: G8 */
    int f58453G8;

    /* renamed from: H8 */
    boolean f58454H8;

    /* renamed from: I8 */
    boolean f58455I8;

    /* renamed from: J8 */
    int f58456J8;

    /* renamed from: K8 */
    int f58457K8;

    /* renamed from: L8 */
    boolean f58458L8;

    /* renamed from: M8 */
    C3977j f58459M8;

    /* renamed from: N8 */
    C3977j f58460N8;

    /* renamed from: b8 */
    int f58461b8;

    /* renamed from: c8 */
    C13697o f58462c8;

    /* renamed from: d8 */
    public String f58463d8;

    /* renamed from: e8 */
    private boolean f58464e8;

    /* renamed from: f8 */
    int f58465f8;

    /* renamed from: g8 */
    int f58466g8;

    /* renamed from: h8 */
    int f58467h8;

    /* renamed from: i8 */
    String f58468i8;

    /* renamed from: j8 */
    int f58469j8;

    /* renamed from: k8 */
    int f58470k8;

    /* renamed from: l8 */
    int f58471l8;

    /* renamed from: m8 */
    int f58472m8;

    /* renamed from: n8 */
    int f58473n8;

    /* renamed from: o8 */
    int f58474o8;

    /* renamed from: p8 */
    int f58475p8;

    /* renamed from: q8 */
    int f58476q8;

    /* renamed from: r8 */
    int f58477r8;

    /* renamed from: s8 */
    boolean f58478s8;

    /* renamed from: t8 */
    boolean f58479t8;

    /* renamed from: u8 */
    C13697o f58480u8;

    /* renamed from: v8 */
    boolean f58481v8;

    /* renamed from: w8 */
    int f58482w8;

    /* renamed from: x8 */
    int f58483x8;

    /* renamed from: y8 */
    int f58484y8;

    /* renamed from: z8 */
    String f58485z8;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendLink$a */
    /* loaded from: classes5.dex */
    public class C11397a extends C23999j {
        C11397a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                ChatRowRecommendLink chatRowRecommendLink = ChatRowRecommendLink.this;
                if (chatRowRecommendLink.f57263B != null && TextUtils.equals(str, chatRowRecommendLink.f58468i8) && c3979l != null && c3979l.m18839c() != null) {
                    if (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1) {
                        return;
                    }
                    ChatRowRecommendLink chatRowRecommendLink2 = ChatRowRecommendLink.this;
                    chatRowRecommendLink2.f58478s8 = true;
                    C3977j c3977j = chatRowRecommendLink2.f58460N8;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    ChatRowRecommendLink.this.f58480u8.m76480u(c3979l.m18839c(), false);
                    ChatRowRecommendLink.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowRecommendLink$b */
    /* loaded from: classes5.dex */
    public class C11398b extends C23999j {
        C11398b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            boolean z11;
            try {
                ChatRowRecommendLink chatRowRecommendLink = ChatRowRecommendLink.this;
                if (chatRowRecommendLink.f57263B != null && TextUtils.equals(str, chatRowRecommendLink.f58463d8)) {
                    boolean z12 = true;
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        if (!ChatRowRecommendLink.this.f57263B.m94913I3()) {
                            ChatRowRecommendLink.this.f57263B.m94909Ha(true);
                            ChatRowRecommendLink chatRowRecommendLink2 = ChatRowRecommendLink.this;
                            chatRowRecommendLink2.f58463d8 = chatRowRecommendLink2.f57263B.m95266u2();
                            if (!TextUtils.equals(ChatRowRecommendLink.this.f58463d8, str)) {
                                ChatRowRecommendLink.this.m61613K4();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ChatRowRecommendLink.this.f58464e8 = true;
                    C3977j c3977j = ChatRowRecommendLink.this.f58459M8;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    C13697o c13697o = ChatRowRecommendLink.this.f58489C7;
                    Bitmap m18839c = c3979l.m18839c();
                    if (c23995f.m125666q() != 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c13697o.m76480u(m18839c, z11);
                    C13697o c13697o2 = ChatRowRecommendLink.this.f58462c8;
                    Bitmap m18839c2 = c3979l.m18839c();
                    if (c23995f.m125666q() == 4) {
                        z12 = false;
                    }
                    c13697o2.m76480u(m18839c2, z12);
                    ChatRowRecommendLink.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(60.0f);
        f58427Q8 = m118742r;
        f58428R8 = m118742r;
        f58429S8 = (m118742r * 16) / 9;
        f58430T8 = AbstractC23136l9.m118742r(60.0f);
        int m118742r2 = AbstractC23136l9.m118742r(4.0f);
        f58431U8 = m118742r2;
        f58432V8 = new float[]{m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2};
        f58433W8 = AbstractC23136l9.m118742r(4.0f);
        f58434X8 = AbstractC23136l9.m118742r(14.0f);
        f58435Y8 = AbstractC23136l9.m118742r(4.0f);
        int m118742r3 = AbstractC23136l9.m118742r(2.0f);
        f58436Z8 = m118742r3;
        f58437a9 = new float[]{m118742r3, m118742r3, m118742r3, m118742r3, m118742r3, m118742r3, m118742r3, m118742r3};
        f58438b9 = AbstractC23136l9.m118742r(5.0f);
        f58439c9 = AbstractC23136l9.m118742r(6.0f);
        f58440d9 = AbstractC23136l9.m118742r(4.0f);
        f58441e9 = AbstractC23136l9.m118759w1(18);
    }

    public ChatRowRecommendLink(Context context) {
        super(context);
        this.f58465f8 = 0;
        this.f58478s8 = false;
        this.f58479t8 = false;
        this.f58451E8 = "";
        this.f58459M8 = new C3977j(context);
        this.f58460N8 = new C3977j(context);
        if (f58442f9 == null || f58425O8) {
            C13704p1 c13704p1 = new C13704p1(1);
            f58442f9 = c13704p1;
            c13704p1.m76613c();
            f58442f9.setColor(AbstractC11531v0.m62153I3());
            f58442f9.setTextSize(AbstractC23136l9.m118759w1(14));
            int i11 = f58441e9;
            f58445i9 = Math.max(0.0f, i11 - (f58442f9.getFontMetrics().descent - f58442f9.getFontMetrics().ascent));
            C13704p1 c13704p12 = new C13704p1(1);
            f58443g9 = c13704p12;
            Typeface typeface = Typeface.DEFAULT;
            c13704p12.setTypeface(typeface);
            f58443g9.setColor(AbstractC11531v0.m62153I3());
            f58443g9.setTextSize(AbstractC23136l9.m118759w1(14));
            f58446j9 = Math.max(0.0f, i11 - (f58443g9.getFontMetrics().descent - f58443g9.getFontMetrics().ascent));
            C13704p1 c13704p13 = new C13704p1(1);
            f58444h9 = c13704p13;
            c13704p13.setTypeface(typeface);
            f58444h9.setColor(C23212s8.m119607o(context, AbstractC16781w.LinkColor2));
            f58444h9.setTextSize(AbstractC23136l9.m118759w1(12));
            f58425O8 = false;
        }
        this.f58489C7.m76482w(ChatRow.f57255z5.getColor());
        this.f58489C7.m76484y(1);
        this.f58462c8 = new C13697o(this);
        C13697o c13697o = new C13697o(this);
        this.f58480u8 = c13697o;
        int i12 = f58434X8;
        c13697o.m76463K(5, i12, i12);
        this.f58480u8.m76482w(ChatRow.f57255z5.getColor());
        this.f58480u8.m76484y(1);
        this.f58480u8.m76457E(false);
        this.f58480u8.m76461I(f58437a9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f58454H8 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = f58440d9;
        this.f58477r8 = i18;
        this.f58473n8 = i18;
        this.f58474o8 = i18;
        int i19 = 0;
        if (this.f58499M7 == 6) {
            StaticLayout staticLayout = this.f58496J7;
            if (staticLayout != null) {
                i19 = Math.max(staticLayout.getHeight(), f58434X8) + i18 + i18;
            }
            StaticLayout staticLayout2 = this.f58490D7;
            if (staticLayout2 != null) {
                i19 += this.f58473n8 + staticLayout2.getHeight();
            }
            i17 = i19 + this.f58474o8 + AbstractC11531v0.m62201T1().getIntrinsicHeight();
        } else {
            int i21 = this.f58465f8;
            if (i21 != 0) {
                if (i21 != 1) {
                    if (!mo61163l4()) {
                        this.f58477r8 = 0;
                    }
                    StaticLayout staticLayout3 = this.f58496J7;
                    if (staticLayout3 != null) {
                        int width = staticLayout3.getWidth();
                        int i22 = f58434X8;
                        i19 = Math.max(0, width + i22 + f58435Y8 + (ChatRow.f57203M5 * 2));
                        i16 = this.f58477r8 + Math.max(this.f58496J7.getHeight(), i22);
                    } else {
                        i16 = 0;
                    }
                    StaticLayout staticLayout4 = this.f58490D7;
                    if (staticLayout4 != null) {
                        i19 = Math.max(i19, staticLayout4.getWidth() + (ChatRow.f57203M5 * 2));
                        i16 += this.f58473n8 + this.f58490D7.getHeight();
                    }
                    StaticLayout staticLayout5 = this.f58493G7;
                    if (staticLayout5 != null) {
                        i19 = Math.max(i19, staticLayout5.getWidth() + (ChatRow.f57203M5 * 2));
                        i16 += this.f58474o8 + this.f58493G7.getHeight();
                    }
                } else {
                    this.f58473n8 = f58438b9;
                    int i23 = this.f58469j8 + i18;
                    StaticLayout staticLayout6 = this.f58496J7;
                    if (staticLayout6 != null) {
                        i23 += i18 + Math.max(staticLayout6.getHeight(), f58434X8);
                    }
                    StaticLayout staticLayout7 = this.f58490D7;
                    if (staticLayout7 != null) {
                        i23 += this.f58473n8 + staticLayout7.getHeight();
                    }
                    i17 = i23;
                    StaticLayout staticLayout8 = this.f58493G7;
                    if (staticLayout8 != null) {
                        i17 += this.f58474o8 + staticLayout8.getHeight();
                    }
                }
            } else {
                StaticLayout staticLayout9 = this.f58496J7;
                if (staticLayout9 != null) {
                    int width2 = staticLayout9.getWidth();
                    int i24 = f58434X8;
                    i13 = Math.max(0, width2 + i24 + f58435Y8 + (ChatRow.f57203M5 * 2));
                    i14 = this.f58477r8 + Math.max(this.f58496J7.getHeight(), i24) + i18;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                StaticLayout staticLayout10 = this.f58490D7;
                if (staticLayout10 != null) {
                    i15 = staticLayout10.getWidth();
                } else {
                    i15 = 0;
                }
                StaticLayout staticLayout11 = this.f58490D7;
                if (staticLayout11 != null) {
                    i19 = staticLayout11.getHeight();
                }
                int i25 = this.f58470k8 + f58426P8 + i15;
                int i26 = ChatRow.f57203M5;
                int max = Math.max(i13, i25 + (i26 * 2));
                int max2 = i14 + Math.max(i19, f58427Q8) + this.f58473n8;
                this.f58474o8 = f58439c9;
                StaticLayout staticLayout12 = this.f58493G7;
                if (staticLayout12 != null) {
                    int max3 = Math.max(max, staticLayout12.getWidth() + (i26 * 2));
                    int height = max2 + this.f58474o8 + this.f58493G7.getHeight();
                    i19 = max3;
                    i16 = height;
                } else {
                    i16 = max2;
                    i19 = max;
                }
            }
            c28227x3.f131648a = Math.min(i19, i12);
            c28227x3.f131649b = i16;
            return c28227x3;
        }
        i16 = i17;
        i19 = i12;
        c28227x3.f131648a = Math.min(i19, i12);
        c28227x3.f131649b = i16;
        return c28227x3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkBase, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        super.mo60953C3(c17945a0, c28769a, z11);
        boolean z15 = false;
        if (c17945a0.m94929K2() instanceof C18013y0) {
            C18013y0 c18013y0 = (C18013y0) c17945a0.m94929K2();
            C32098s c32098s = c18013y0.f91251B;
            if (c32098s != null) {
                String str = c32098s.f147951a;
                if (str == null) {
                    str = "";
                }
                this.f58500N7 = str;
                String str2 = c32098s.f147953c;
                if (str2 == null) {
                    str2 = "";
                }
                this.f58485z8 = str2;
                int i11 = c32098s.f147956f;
                this.f58499M7 = i11;
                String str3 = c32098s.f147952b;
                if (str3 == null) {
                    str3 = "";
                }
                this.f58450D8 = str3;
                if (i11 != 1 && i11 != 3) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                this.f58455I8 = z14;
                this.f58501O7 = c32098s.f147954d;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                this.f58448B8 = c18013y0.f91015t;
                                if (c32098s != null && c32098s.m154938h()) {
                                    this.f58502P7 = C32106s7.m154972a(c18013y0);
                                }
                                C32098s c32098s2 = c18013y0.f91251B;
                                this.f58465f8 = c32098s2.f147970t;
                                this.f58466g8 = c32098s2.f147971u;
                                this.f58467h8 = c32098s2.f147972v;
                                this.f58468i8 = c32098s2.f147973w;
                            }
                        }
                    }
                    this.f58448B8 = c18013y0.f91015t;
                    this.f58451E8 = c32098s.f147961k;
                    if (c32098s != null) {
                        this.f58502P7 = C32106s7.m154972a(c18013y0);
                    }
                    C32098s c32098s22 = c18013y0.f91251B;
                    this.f58465f8 = c32098s22.f147970t;
                    this.f58466g8 = c32098s22.f147971u;
                    this.f58467h8 = c32098s22.f147972v;
                    this.f58468i8 = c32098s22.f147973w;
                }
                String str4 = c32098s.f147957g;
                if (str4 == null) {
                    str4 = "";
                }
                this.f58448B8 = str4;
                if (c32098s != null) {
                }
                C32098s c32098s222 = c18013y0.f91251B;
                this.f58465f8 = c32098s222.f147970t;
                this.f58466g8 = c32098s222.f147971u;
                this.f58467h8 = c32098s222.f147972v;
                this.f58468i8 = c32098s222.f147973w;
            } else {
                this.f58485z8 = c18013y0.f91011p;
                this.f58499M7 = 0;
                this.f58448B8 = "";
                if (!TextUtils.isEmpty(c18013y0.f91014s)) {
                    this.f58451E8 = AbstractC20550a.m106804a(c18013y0.f91014s);
                }
            }
            String str5 = this.f58463d8;
            String m95266u2 = c17945a0.m95266u2();
            this.f58463d8 = m95266u2;
            if (!z11 && !TextUtils.equals(m95266u2, str5)) {
                C23999j.m125719b2(str5, this.f58463d8, C23278z2.m120136k0());
            }
            if (TextUtils.isEmpty(this.f58463d8) || !c17945a0.m95026V0()) {
                this.f58465f8 = -1;
            }
        }
        if (this.f57560z4.mo60993N() && c17945a0.m94963O0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f57271C1 = z12;
        this.f58479t8 = !TextUtils.isEmpty(this.f58468i8);
        if (this.f58499M7 == 6) {
            this.f58488B7 = false;
            this.f58458L8 = true;
            this.f58448B8 = "";
            this.f58465f8 = -1;
        }
        int i12 = this.f58465f8;
        if (i12 != 1 && i12 != 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f58488B7 = z13;
        if (mo61163l4() && this.f58465f8 != 1) {
            z15 = true;
        }
        this.f58481v8 = z15;
        this.f58459M8.setImageInfo(null);
        this.f58460N8.setImageInfo(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: E2 */
    public C28227x3 mo60959E2(int i11, int i12, int i13, C28227x3 c28227x3) {
        C28227x3 mo60959E2 = super.mo60959E2(i11, i12, i13, c28227x3);
        if (mo61163l4()) {
            mo60959E2.f131648a = Math.max(mo60959E2.f131648a, getTextWidth() + getBubblePaddingLeft() + getBubblePaddingRight());
            mo60959E2.f131649b += getTextHeight() + ChatRow.f57201L5;
        }
        if (this.f58481v8) {
            mo60959E2.f131649b = (int) (mo60959E2.f131649b + ChatRow.f57255z5.getStrokeWidth() + f58433W8);
        }
        return mo60959E2;
    }

    /* renamed from: H4 */
    boolean m61610H4(float f11, float f12) {
        try {
            if (f11 < this.f58452F8 || f11 > r1 + this.f58489C7.m76473l()) {
                return false;
            }
            if (f12 < this.f58453G8) {
                return false;
            }
            if (f12 > r4 + this.f58489C7.m76472k()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        int i12;
        int i13;
        super.mo60975I3(c17945a0, c28769a, i11);
        int i14 = this.f58465f8;
        if (i14 != 0) {
            if (i14 == 1) {
                int i15 = this.f58466g8;
                if (i15 > 0 && (i13 = this.f58467h8) > 0) {
                    this.f58469j8 = (int) Math.max(i11 * Math.min(i13 / i15, 1.5f), f58430T8);
                } else {
                    this.f58469j8 = (int) (i11 * 0.5625f);
                }
                this.f58447A8 = 2;
                this.f58449C8 = 5;
                this.f58489C7.m76463K(5, i11 - 2, this.f58469j8 - 1);
                this.f58489C7.m76457E(false);
                this.f58481v8 = false;
            }
        } else {
            int i16 = f58428R8;
            this.f58470k8 = i16;
            int i17 = this.f58466g8;
            if (i17 > 0 && (i12 = this.f58467h8) > 0) {
                int i18 = (f58427Q8 * i17) / i12;
                this.f58470k8 = i18;
                int max = Math.max(i18, i16);
                this.f58470k8 = max;
                this.f58470k8 = Math.min(max, f58429S8);
            }
            this.f58461b8 = this.f58470k8 + f58426P8;
            this.f58447A8 = 3;
            this.f58489C7.m76461I(f58432V8);
            this.f58489C7.m76463K(5, this.f58470k8, f58427Q8);
            this.f58489C7.m76457E(true);
        }
        int i19 = i11 - (ChatRow.f57203M5 * 2);
        if (!TextUtils.isEmpty(this.f58485z8)) {
            int i21 = i19 - this.f58461b8;
            int i22 = this.f58447A8;
            if (i22 <= 0) {
                this.f58490D7 = AbstractC23214t.m119628o(this.f58485z8, f58442f9, i21, Layout.Alignment.ALIGN_NORMAL, f58445i9, 1.0f, false);
            } else {
                this.f58490D7 = AbstractC23214t.m119626m(this.f58485z8, f58442f9, i21, i22, 1.0f, f58445i9);
            }
        }
        if (!TextUtils.isEmpty(this.f58448B8)) {
            int i23 = this.f58449C8;
            if (i23 <= 0) {
                this.f58493G7 = AbstractC23214t.m119628o(this.f58448B8, f58443g9, i19, Layout.Alignment.ALIGN_NORMAL, f58446j9, 1.0f, false);
            } else {
                this.f58493G7 = AbstractC23214t.m119626m(this.f58448B8, f58443g9, i19, i23, 1.0f, f58446j9);
            }
        }
        if (!TextUtils.isEmpty(this.f58450D8)) {
            this.f58496J7 = AbstractC23214t.m119625l(this.f58450D8, f58444h9, (i19 - f58434X8) - f58435Y8, 1);
        }
    }

    /* renamed from: I4 */
    boolean m61611I4() {
        return this.f58465f8 == 1 && this.f58499M7 != 6;
    }

    /* renamed from: J4 */
    void m61612J4() {
        try {
            if (TextUtils.isEmpty(this.f58468i8)) {
                return;
            }
            if (!m60988L3() && !C23999j.m125696L2(this.f58468i8, C23278z2.m120146o0())) {
                return;
            }
            ((C23528a) this.f57275D.m123612r(this.f58460N8)).m123579C(this.f58468i8, C23278z2.m120146o0(), new C11397a());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K4 */
    void m61613K4() {
        try {
            if (TextUtils.isEmpty(this.f58463d8)) {
                this.f58489C7.m76477r();
                this.f58462c8.m76477r();
                invalidate();
                this.f58464e8 = true;
                return;
            }
            C24003n m120136k0 = C23278z2.m120136k0();
            this.f58489C7.m76477r();
            this.f58462c8.m76477r();
            if (m60988L3() || C23999j.m125696L2(this.f58463d8, m120136k0)) {
                ((C23528a) this.f57275D.m123612r(this.f58459M8)).m123579C(this.f58463d8, m120136k0, new C11398b());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Q2 */
    public void mo61009Q2() {
        float[] fArr;
        super.mo61009Q2();
        if (m61611I4()) {
            C13697o c13697o = this.f58489C7;
            if (this.f57389W == 0) {
                fArr = ChatRow.f57185D5;
            } else {
                fArr = ChatRow.f57181B5;
            }
            c13697o.m76461I(fArr);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkBase, com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f58464e8) {
            m61613K4();
        }
        if (this.f58479t8 && !this.f58478s8) {
            m61612J4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = ChatRow.f57203M5 + i11;
        if (this.f58499M7 == 6) {
            StaticLayout staticLayout = this.f58496J7;
            if (staticLayout != null) {
                this.f58475p8 = i15;
                int i16 = this.f58477r8 + i12;
                this.f58476q8 = i16;
                this.f58497K7 = (this.f58479t8 ? f58435Y8 + f58434X8 : 0) + i15;
                int i17 = f58434X8;
                this.f58498L7 = i16 + ((i17 - staticLayout.getHeight()) / 2);
                i12 += this.f58477r8 + Math.max(this.f58496J7.getHeight(), i17) + f58440d9;
            }
            StaticLayout staticLayout2 = this.f58490D7;
            if (staticLayout2 != null) {
                this.f58491E7 = i15;
                int i18 = this.f58473n8;
                this.f58492F7 = i12 + i18;
                i12 += i18 + staticLayout2.getHeight();
            }
            this.f58456J8 = i15;
            this.f58457K8 = i12 + this.f58474o8;
            return;
        }
        int i19 = this.f58465f8;
        if (i19 == 0) {
            StaticLayout staticLayout3 = this.f58496J7;
            if (staticLayout3 != null) {
                this.f58475p8 = i15;
                int i21 = this.f58477r8 + i12;
                this.f58476q8 = i21;
                this.f58497K7 = (this.f58479t8 ? f58434X8 + f58435Y8 : 0) + i15;
                int i22 = f58434X8;
                this.f58498L7 = i21 + ((i22 - staticLayout3.getHeight()) / 2);
                i12 += this.f58477r8 + Math.max(this.f58496J7.getHeight(), i22) + f58440d9;
            }
            this.f58452F8 = i15;
            int i23 = i12 + this.f58473n8;
            this.f58453G8 = i23;
            this.f58489C7.m76460H(i15, i23);
            StaticLayout staticLayout4 = this.f58490D7;
            if (staticLayout4 != null) {
                staticLayout4.getWidth();
            }
            StaticLayout staticLayout5 = this.f58490D7;
            int height = staticLayout5 != null ? staticLayout5.getHeight() : 0;
            this.f58491E7 = this.f58452F8 + this.f58470k8 + f58426P8;
            int i24 = this.f58453G8;
            int i25 = f58427Q8;
            int i26 = ((i25 - height) / 2) + i24;
            this.f58492F7 = i26;
            int max = Math.max(i26 + height, i24 + i25);
            if (this.f58493G7 != null) {
                this.f58494H7 = i15;
                this.f58495I7 = max + this.f58474o8;
            }
        } else if (i19 != 1) {
            StaticLayout staticLayout6 = this.f58496J7;
            if (staticLayout6 != null) {
                this.f58475p8 = i15;
                int i27 = this.f58477r8 + i12;
                this.f58476q8 = i27;
                this.f58497K7 = (this.f58479t8 ? f58435Y8 + f58434X8 : 0) + i15;
                int i28 = f58434X8;
                this.f58498L7 = i27 + ((i28 - staticLayout6.getHeight()) / 2);
                i12 += this.f58477r8 + Math.max(this.f58496J7.getHeight(), i28);
            }
            StaticLayout staticLayout7 = this.f58490D7;
            if (staticLayout7 != null) {
                this.f58491E7 = i15;
                int i29 = this.f58473n8;
                this.f58492F7 = i12 + i29;
                i12 += i29 + staticLayout7.getHeight();
            }
            if (this.f58493G7 != null) {
                this.f58494H7 = i15;
                this.f58495I7 = i12 + this.f58474o8;
            }
        } else {
            int i31 = i11 + 1;
            this.f58452F8 = i31;
            int i32 = i12 + 1;
            this.f58453G8 = i32;
            this.f58489C7.m76460H(i31, i32);
            int i33 = i12 + this.f58469j8 + f58440d9;
            StaticLayout staticLayout8 = this.f58496J7;
            if (staticLayout8 != null) {
                this.f58475p8 = i15;
                int i34 = this.f58477r8 + i33;
                this.f58476q8 = i34;
                this.f58497K7 = (this.f58479t8 ? f58435Y8 + f58434X8 : 0) + i15;
                int i35 = f58434X8;
                this.f58498L7 = i34 + ((i35 - staticLayout8.getHeight()) / 2);
                i33 += this.f58477r8 + Math.max(this.f58496J7.getHeight(), i35);
            }
            StaticLayout staticLayout9 = this.f58490D7;
            if (staticLayout9 != null) {
                this.f58491E7 = i15;
                int i36 = this.f58473n8;
                this.f58492F7 = i33 + i36;
                i33 += i36 + staticLayout9.getHeight();
            }
            if (this.f58493G7 != null) {
                this.f58494H7 = i15;
                this.f58495I7 = i33 + this.f58474o8;
            }
        }
        if (this.f58488B7) {
            this.f58510X7 = this.f58452F8 + ((this.f58489C7.m76473l() - this.f58509W7.m76348s()) / 2);
            this.f58511Y7 = this.f58453G8 + ((this.f58489C7.m76472k() - this.f58509W7.m76347r()) / 2);
            this.f58507U7 = this.f58452F8 + ((this.f58489C7.m76473l() - this.f58505S7.m77064c()) / 2);
            this.f58508V7 = this.f58453G8 + ((this.f58489C7.m76472k() - this.f58505S7.m77063b()) / 2);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        if (m61611I4() && !mo61163l4()) {
            return 0;
        }
        return super.getDefaultBubblePaddingTop();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58471l8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58472m8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: i2 */
    public int mo61071i2(int i11, int i12, int i13, int i14, boolean z11) {
        int mo61071i2 = super.mo61071i2(i11, i12, i13, i14, z11);
        if (mo61163l4()) {
            this.f58471l8 = getBubblePaddingLeft() + i11;
            this.f58472m8 = mo61071i2;
            mo61071i2 += getTextHeight();
        }
        if (this.f58481v8) {
            this.f58482w8 = i11 + getBubblePaddingLeft();
            this.f58483x8 = i13 - getBubblePaddingRight();
            this.f58484y8 = ChatRow.f57201L5 + mo61071i2;
            return (int) (mo61071i2 + ChatRow.f57255z5.getStrokeWidth() + f58433W8);
        }
        return mo61071i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:            if (r2 == false) goto L21;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        if (i11 != 0) {
            if (i11 == 1 && this.f58454H8 && m61610H4(f11, f12)) {
                getDelegate().mo62074a4(this);
            }
            if (!super.mo61075j3(motionEvent, i11, f11, f12)) {
                return false;
            }
        } else {
            if (this.f58499M7 == 5 && !TextUtils.isEmpty(this.f58463d8) && m61610H4(f11, f12)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f58454H8 = z11;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: k0 */
    public int mo61076k0(C17945a0 c17945a0) {
        int mo61076k0 = super.mo61076k0(c17945a0);
        if (c17945a0.m95032V6() && !c17945a0.m95180k8()) {
            int m95089b4 = c17945a0.m95089b4();
            if (m95089b4 != 2 && m95089b4 != 3 && m95089b4 != 4) {
                return mo61076k0;
            }
        } else if (c17945a0.m95107d3() != 5) {
            return mo61076k0;
        }
        return mo61076k0 | 9;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        if (c17945a0.m94929K2() != null) {
            return c17945a0.m94929K2().f91011p;
        }
        return "";
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        if (this.f58496J7 != null) {
            if (this.f58479t8) {
                canvas.save();
                canvas.translate(this.f58475p8, this.f58476q8);
                if (this.f58478s8 && this.f58480u8.m76468g() != null) {
                    this.f58480u8.m76467d(canvas);
                } else {
                    Drawable m62205U1 = AbstractC11531v0.m62205U1();
                    int i11 = f58434X8;
                    m62205U1.setBounds(0, 0, i11, i11);
                    AbstractC11531v0.m62205U1().draw(canvas);
                }
                canvas.restore();
            }
            canvas.save();
            canvas.translate(this.f58497K7, this.f58498L7);
            this.f58496J7.draw(canvas);
            canvas.restore();
        }
        if (this.f58488B7) {
            this.f58489C7.m76467d(canvas);
        }
        if (this.f58490D7 != null) {
            canvas.save();
            canvas.translate(this.f58491E7, this.f58492F7);
            this.f58490D7.draw(canvas);
            canvas.restore();
        }
        if (this.f58493G7 != null) {
            canvas.save();
            canvas.translate(this.f58494H7, this.f58495I7);
            this.f58493G7.draw(canvas);
            canvas.restore();
        }
        if (this.f58458L8) {
            Drawable m62201T1 = AbstractC11531v0.m62201T1();
            int i12 = this.f58456J8;
            m62201T1.setBounds(i12, this.f58457K8, AbstractC11531v0.m62201T1().getIntrinsicWidth() + i12, this.f58457K8 + AbstractC11531v0.m62201T1().getIntrinsicHeight());
            AbstractC11531v0.m62201T1().draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: v0 */
    public void mo61117v0(Canvas canvas) {
        super.mo61117v0(canvas);
        if (this.f58481v8) {
            float f11 = this.f58482w8;
            int i11 = this.f58484y8;
            canvas.drawLine(f11, i11, this.f58483x8, i11, ChatRow.f57255z5);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58461b8 = 0;
        this.f58499M7 = 0;
        this.f58485z8 = "";
        this.f58447A8 = 0;
        this.f58448B8 = "";
        this.f58449C8 = 0;
        this.f58450D8 = "";
        this.f58501O7 = "";
        this.f58451E8 = "";
        this.f58509W7.m76349t(false);
        this.f58490D7 = null;
        this.f58496J7 = null;
        this.f58493G7 = null;
        this.f58452F8 = 0;
        this.f58453G8 = 0;
        this.f58455I8 = false;
        this.f58488B7 = true;
        this.f58465f8 = 0;
        this.f58466g8 = 0;
        this.f58467h8 = 0;
        this.f58468i8 = "";
        this.f58475p8 = 0;
        this.f58476q8 = 0;
        this.f58481v8 = false;
        this.f58484y8 = 0;
        this.f58482w8 = 0;
        this.f58483x8 = 0;
        this.f58478s8 = false;
        this.f58479t8 = false;
        this.f58477r8 = f58440d9;
        this.f58458L8 = false;
        this.f58464e8 = false;
    }
}
