package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import me0.AbstractC23118k2;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p604wb.C28905e;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowGame extends ChatRow {

    /* renamed from: A7 */
    public static boolean f57865A7 = false;

    /* renamed from: C7 */
    static C13704p1 f57867C7 = null;

    /* renamed from: D7 */
    static C13704p1 f57868D7 = null;

    /* renamed from: G7 */
    static C13704p1 f57871G7 = null;

    /* renamed from: H7 */
    static C13704p1 f57872H7 = null;

    /* renamed from: J7 */
    static TextPaint f57874J7 = null;

    /* renamed from: K7 */
    static int f57875K7 = 0;

    /* renamed from: L7 */
    static int f57876L7 = 0;

    /* renamed from: M7 */
    static String f57877M7 = null;

    /* renamed from: z7 */
    static final String f57878z7 = "ChatRowGame";

    /* renamed from: V6 */
    String f57879V6;

    /* renamed from: W6 */
    StaticLayout f57880W6;

    /* renamed from: X6 */
    int f57881X6;

    /* renamed from: Y6 */
    int f57882Y6;

    /* renamed from: Z6 */
    String f57883Z6;

    /* renamed from: a7 */
    StaticLayout f57884a7;

    /* renamed from: b7 */
    int f57885b7;

    /* renamed from: c7 */
    int f57886c7;

    /* renamed from: d7 */
    String f57887d7;

    /* renamed from: e7 */
    StaticLayout f57888e7;

    /* renamed from: f7 */
    int f57889f7;

    /* renamed from: g7 */
    int f57890g7;

    /* renamed from: h7 */
    String f57891h7;

    /* renamed from: i7 */
    Drawable f57892i7;

    /* renamed from: j7 */
    boolean f57893j7;

    /* renamed from: k7 */
    int f57894k7;

    /* renamed from: l7 */
    int f57895l7;

    /* renamed from: m7 */
    boolean f57896m7;

    /* renamed from: n7 */
    boolean f57897n7;

    /* renamed from: o7 */
    boolean f57898o7;

    /* renamed from: p7 */
    int f57899p7;

    /* renamed from: q7 */
    int f57900q7;

    /* renamed from: r7 */
    int f57901r7;

    /* renamed from: s7 */
    int f57902s7;

    /* renamed from: t7 */
    Rect f57903t7;

    /* renamed from: u7 */
    StaticLayout f57904u7;

    /* renamed from: v7 */
    StaticLayout f57905v7;

    /* renamed from: w7 */
    C3977j f57906w7;

    /* renamed from: x7 */
    int f57907x7;

    /* renamed from: y7 */
    int f57908y7;

    /* renamed from: B7 */
    static int f57866B7 = AbstractC23136l9.m118742r(70.0f);

    /* renamed from: E7 */
    static int f57869E7 = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: F7 */
    static int f57870F7 = AbstractC23136l9.m118742r(5.0f);

    /* renamed from: I7 */
    static int f57873I7 = AbstractC23136l9.m118742r(8.0f);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowGame$a */
    /* loaded from: classes5.dex */
    public class C11362a extends C23999j {
        C11362a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (TextUtils.equals(str, ChatRowGame.this.f57891h7) && c3979l != null && c3979l.m18839c() != null) {
                    ChatRowGame chatRowGame = ChatRowGame.this;
                    chatRowGame.f57896m7 = true;
                    chatRowGame.f57906w7.setImageInfo(c3979l, false);
                    ChatRowGame.this.f57892i7 = new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c());
                    ChatRowGame.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public ChatRowGame(Context context) {
        super(context);
        this.f57879V6 = "";
        this.f57883Z6 = "";
        this.f57887d7 = "";
        this.f57891h7 = "";
        this.f57893j7 = false;
        this.f57898o7 = false;
        this.f57903t7 = new Rect();
        this.f57906w7 = new C3977j(context);
        if (f57867C7 == null || f57865A7) {
            C13704p1 c13704p1 = new C13704p1(1);
            f57867C7 = c13704p1;
            c13704p1.setColor(C23212s8.m119606n(AbstractC21196a.TextColor1));
            f57867C7.m76613c();
            f57867C7.setTextSize(AbstractC23136l9.m118759w1(14));
            C13704p1 c13704p12 = new C13704p1(1);
            f57868D7 = c13704p12;
            c13704p12.setTypeface(Typeface.DEFAULT);
            f57868D7.setColor(C23212s8.m119606n(AbstractC16781w.TextColor4));
            f57868D7.setTextSize(AbstractC23136l9.m118742r(14.0f));
            C13704p1 c13704p13 = new C13704p1(1);
            f57872H7 = c13704p13;
            c13704p13.setColor(AbstractC11531v0.m62143G3());
            f57872H7.setTextSize(AbstractC23136l9.m118759w1(12));
            C13704p1 c13704p14 = new C13704p1(1);
            f57871G7 = c13704p14;
            c13704p14.m76613c();
            f57871G7.setColor(AbstractC11531v0.m62222Y2());
            f57871G7.setTextSize(AbstractC23136l9.m118742r(12.0f));
            C13704p1 c13704p15 = new C13704p1(1);
            f57874J7 = c13704p15;
            c13704p15.setColor(AbstractC11531v0.m62143G3());
            f57874J7.setTextSize(AbstractC23136l9.m118742r(14.0f));
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bubble_game);
            f57877M7 = m118743r0;
            f57875K7 = AbstractC23136l9.m118761x0(f57874J7, m118743r0);
            f57876L7 = AbstractC23136l9.m118764y0(f57874J7, f57877M7);
            f57865A7 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f57893j7 = false;
        this.f57898o7 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int i13;
        int i14;
        StaticLayout staticLayout = this.f57884a7;
        if (staticLayout != null) {
            i13 = staticLayout.getHeight() + ChatRow.f57189F5;
        } else {
            i13 = 0;
        }
        if (this.f57888e7 != null) {
            i14 = Math.max(f57866B7, f57875K7 + AbstractC23136l9.m118742r(4.0f) + this.f57888e7.getHeight());
        } else {
            i14 = f57866B7;
        }
        int i15 = i13 + i14;
        StaticLayout staticLayout2 = this.f57880W6;
        if (staticLayout2 != null) {
            i15 += ChatRow.f57189F5 + staticLayout2.getHeight();
        }
        c28227x3.f131649b = i15;
        c28227x3.f131648a = i12;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        super.mo60953C3(c17945a0, c28769a, z11);
        this.f57897n7 = c28769a.f133327w;
        if (c17945a0.m94929K2() != null) {
            this.f57887d7 = c17945a0.m94929K2().f91011p;
            this.f57883Z6 = c17945a0.m94929K2().f91015t;
            this.f57891h7 = c17945a0.m94929K2().f91013r;
            if (c17945a0.m94950M7()) {
                this.f57879V6 = c17945a0.m94929K2().f91017v;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        super.mo60975I3(c17945a0, c28769a, i11);
        try {
            int i12 = ChatRow.f57203M5;
            int i13 = i11 - (i12 * 2);
            if (!TextUtils.isEmpty(this.f57879V6)) {
                this.f57880W6 = AbstractC23214t.m119624k(this.f57879V6, ChatRow.f57251x5, i13);
            }
            if (!TextUtils.isEmpty(this.f57883Z6)) {
                this.f57884a7 = AbstractC23214t.m119624k(this.f57883Z6, f57868D7, i13);
            }
            if (!TextUtils.isEmpty(this.f57887d7)) {
                this.f57888e7 = AbstractC23214t.m119624k(this.f57887d7, f57867C7, ((i11 - f57866B7) - (i12 * 2)) - f57869E7);
            }
            if (this.f57897n7) {
                int i14 = AbstractC8020f0.str_msg_game_block_msg;
                Object[] objArr = new Object[1];
                String str = this.f57887d7;
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                String upperCase = AbstractC23136l9.m118746s0(i14, objArr).toUpperCase();
                this.f57905v7 = AbstractC23214t.m119629p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_game_block_msg_hint), f57872H7, i13 - (i12 * 2));
                this.f57904u7 = AbstractC23214t.m119629p(upperCase, f57871G7, i13 - (i12 * 2));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N2 */
    protected void mo60995N2() {
        try {
            if (this.f57263B.m94929K2() != null) {
                int m40666e = TrackingSource.m40666e();
                String m40669h = TrackingSource.m40669h(m40666e);
                if (TextUtils.equals(this.f57263B.m94929K2().f91016u, "recommened.msg.game")) {
                    if (this.f57263B.m94912I2() != null) {
                        int i11 = this.f57263B.m94912I2().f147326t;
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    String m118595h = AbstractC23118k2.m118595h(this.f57263B.m94912I2().f147325s);
                                    if (!TextUtils.isEmpty(m118595h)) {
                                        AbstractC23118k2.m118590c(getContext(), m118595h, this.f57263B.m94912I2().f147323q, AbstractC23118k2.m118593f(this.f57263B), AbstractC23118k2.m118594g(this.f57263B.m94912I2().f147325s), 81, this.f57263B.m95029V3().m41046j(), this.f57263B.m94862C4(), m40666e, m40669h);
                                    } else if (this.f57263B.m94912I2().f147323q > 0) {
                                        AbstractC23118k2.m118600m(getContext(), this.f57263B.m94912I2().f147323q, m40666e, m40669h);
                                        C28905e.m144373n().m144396r(2, 81, this.f57263B.m94912I2().f147323q + "", this.f57263B.m95029V3().m41046j(), this.f57263B.m94862C4());
                                    }
                                }
                            } else if (this.f57263B.m94912I2().f147325s != null) {
                                AbstractC23118k2.m118602o(getContext(), this.f57263B.m94912I2().f147325s, m40666e, m40669h);
                                C28905e.m144373n().m144396r(0, 81, this.f57263B.m94912I2().f147323q + "", this.f57263B.m95029V3().m41046j(), this.f57263B.m94862C4());
                            }
                        } else {
                            AbstractC23118k2.m118600m(getContext(), this.f57263B.m94912I2().f147323q, m40666e, m40669h);
                            C28905e.m144373n().m144396r(2, 81, this.f57263B.m94912I2().f147323q + "", this.f57263B.m95029V3().m41046j(), this.f57263B.m94862C4());
                        }
                    }
                } else if (TextUtils.equals(this.f57263B.m94929K2().f91016u, "recommened.game")) {
                    AbstractC23118k2.m118600m(getContext(), Long.parseLong(this.f57263B.m94929K2().f91017v), m40666e, m40669h);
                    C28905e.m144373n().m144396r(2, 81, this.f57263B.m94912I2().f147323q + "", this.f57263B.m95029V3().m41046j(), this.f57263B.m94862C4());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f57878z7, e11);
        }
    }

    /* renamed from: U3 */
    boolean m61394U3(float f11, float f12) {
        try {
            if (f11 < this.f57894k7) {
                return false;
            }
            int i11 = f57866B7;
            if (f11 > r1 + i11) {
                return false;
            }
            if (f12 < this.f57895l7 || f12 > r4 + i11) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: V3 */
    boolean m61395V3(float f11, float f12) {
        try {
            if (f11 < this.f57899p7 || f11 > r1 + this.f57901r7) {
                return false;
            }
            if (f12 < this.f57900q7) {
                return false;
            }
            if (f12 > r4 + this.f57902s7) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: W3 */
    void m61396W3() {
        try {
            this.f57892i7 = AbstractC11531v0.m62161K1();
            if (TextUtils.isEmpty(this.f57891h7)) {
                this.f57896m7 = true;
            } else if (getDelegate().mo62069W3() || C23999j.m125696L2(this.f57891h7, C23278z2.m120120d0())) {
                ((C23528a) this.f57275D.m123612r(this.f57906w7)).m123579C(this.f57891h7, C23278z2.m120120d0(), new C11362a());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f57896m7) {
            m61396W3();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        if (super.mo61046c0(c17945a0, c28769a) || this.f57897n7 != c28769a.f133327w) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c2 */
    public void mo61048c2(int i11, int i12, int i13, int i14, boolean z11) {
        if (this.f57897n7) {
            this.f57899p7 = i11;
            this.f57900q7 = f57870F7 + i12;
            int i15 = i13 - i11;
            this.f57901r7 = i15;
            this.f57903t7.set(0, 0, i15, this.f57902s7);
            i12 += this.f57902s7;
        }
        super.mo61048c2(i11, i12, i13, i14, z11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        if (this.f57884a7 != null) {
            this.f57885b7 = getBubblePaddingLeft() + i11;
            this.f57886c7 = i12;
            i12 += this.f57884a7.getHeight() + ChatRow.f57189F5;
        }
        int i16 = f57869E7 + i11;
        this.f57894k7 = i16;
        this.f57895l7 = i12;
        if (this.f57888e7 != null) {
            int i17 = i16 + f57866B7 + ChatRow.f57203M5;
            this.f57907x7 = i17;
            int i18 = f57875K7 + i12;
            this.f57908y7 = i18;
            this.f57889f7 = i17;
            this.f57890g7 = i18 + AbstractC23136l9.m118742r(4.0f);
        }
        StaticLayout staticLayout = this.f57888e7;
        if (staticLayout != null) {
            i15 = staticLayout.getHeight();
        } else {
            i15 = 0;
        }
        int max = i12 + Math.max(f57866B7, f57875K7 + AbstractC23136l9.m118742r(4.0f) + i15);
        if (this.f57880W6 != null) {
            this.f57881X6 = i11 + getBubblePaddingLeft();
            this.f57882Y6 = max + ChatRow.f57189F5;
            this.f57880W6.getHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:            if (r2 == false) goto L19;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: i3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61072i3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        if (i11 != 0) {
            if (i11 == 1 && this.f57898o7 && m61395V3(f11, f12)) {
                getDelegate().mo62105w4(this);
            }
            if (!super.mo61072i3(motionEvent, i11, f11, f12)) {
                return false;
            }
        } else {
            if (this.f57897n7 && m61395V3(f11, f12)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f57898o7 = z11;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: j3 */
    public boolean mo61075j3(MotionEvent motionEvent, int i11, float f11, float f12) {
        if (i11 != 0) {
            if (i11 == 1 && this.f57893j7 && m61394U3(f11, f12)) {
                getDelegate().mo62074a4(this);
                return true;
            }
        } else {
            boolean m61394U3 = m61394U3(f11, f12);
            this.f57893j7 = m61394U3;
            if (m61394U3) {
                return true;
            }
        }
        if (super.mo61075j3(motionEvent, i11, f11, f12)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: p0 */
    public void mo61098p0(Canvas canvas) {
        super.mo61098p0(canvas);
        if (this.f57897n7) {
            canvas.save();
            canvas.translate(this.f57899p7, this.f57900q7);
            if (this.f57904u7 != null && this.f57905v7 != null) {
                Drawable background = getBackground();
                if (background != null) {
                    background.setBounds(this.f57903t7);
                    background.draw(canvas);
                }
                canvas.save();
                canvas.translate((this.f57901r7 - this.f57905v7.getWidth()) >> 1, f57873I7);
                this.f57905v7.draw(canvas);
                canvas.restore();
                int height = this.f57905v7.getHeight();
                int i11 = f57873I7;
                float f11 = height + i11 + i11;
                float width = this.f57903t7.width();
                int height2 = this.f57905v7.getHeight();
                int i12 = f57873I7;
                canvas.drawLine(0.0f, f11, width, height2 + i12 + i12, ChatRow.f57255z5);
                canvas.save();
                float width2 = (this.f57901r7 - this.f57904u7.getWidth()) >> 1;
                int height3 = f57873I7 + this.f57905v7.getHeight();
                int i13 = f57873I7;
                canvas.translate(width2, height3 + i13 + i13);
                this.f57904u7.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        if (this.f57884a7 != null) {
            canvas.save();
            canvas.translate(this.f57885b7, this.f57886c7);
            this.f57884a7.draw(canvas);
            canvas.restore();
        }
        Drawable drawable = this.f57892i7;
        if (drawable != null) {
            int i11 = this.f57894k7;
            int i12 = this.f57895l7;
            int i13 = f57866B7;
            drawable.setBounds(i11, i12, i11 + i13, i13 + i12);
            this.f57892i7.draw(canvas);
        }
        if (this.f57888e7 != null) {
            canvas.drawText(f57877M7, this.f57907x7, this.f57908y7, f57874J7);
            canvas.save();
            canvas.translate(this.f57889f7, this.f57890g7);
            this.f57888e7.draw(canvas);
            canvas.restore();
        }
        if (this.f57880W6 != null) {
            canvas.save();
            canvas.translate(this.f57881X6, this.f57882Y6);
            this.f57880W6.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f57879V6 = "";
        this.f57880W6 = null;
        this.f57887d7 = "";
        this.f57888e7 = null;
        this.f57883Z6 = "";
        this.f57884a7 = null;
        this.f57891h7 = "";
        this.f57893j7 = false;
        this.f57896m7 = false;
        this.f57902s7 = 0;
        this.f57901r7 = 0;
        this.f57898o7 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: y2 */
    public C28227x3 mo61128y2(int i11, int i12, int i13, C28227x3 c28227x3) {
        int height;
        C28227x3 mo61128y2 = super.mo61128y2(i11, i12, i13, c28227x3);
        if (this.f57897n7) {
            StaticLayout staticLayout = this.f57905v7;
            int i14 = 0;
            if (staticLayout == null) {
                height = 0;
            } else {
                height = staticLayout.getHeight();
            }
            StaticLayout staticLayout2 = this.f57904u7;
            if (staticLayout2 != null) {
                i14 = staticLayout2.getHeight();
            }
            int i15 = f57873I7;
            int i16 = height + i15 + i15 + i15 + i14 + i15;
            this.f57902s7 = i16;
            mo61128y2.f131649b += f57870F7 + i16;
            mo61128y2.f131648a = Math.max(mo61128y2.f131648a, i11);
        }
        return mo61128y2;
    }
}
