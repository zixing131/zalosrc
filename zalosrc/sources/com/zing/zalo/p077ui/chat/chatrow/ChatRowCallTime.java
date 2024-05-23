package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18013y0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23214t;
import me0.C23212s8;
import vg.AbstractC28236y3;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowCallTime extends ChatRow {

    /* renamed from: A7 */
    private static C13704p1 f57647A7;

    /* renamed from: B7 */
    private static C13704p1 f57648B7;

    /* renamed from: D7 */
    private static TextPaint f57650D7;

    /* renamed from: E7 */
    private static RectF f57651E7;

    /* renamed from: F7 */
    private static int f57652F7;

    /* renamed from: G7 */
    private static Paint f57653G7;

    /* renamed from: w7 */
    private static C13704p1 f57657w7;

    /* renamed from: x7 */
    private static C13704p1 f57658x7;

    /* renamed from: y7 */
    static String f57659y7;

    /* renamed from: z7 */
    static String f57660z7;

    /* renamed from: V6 */
    private String f57661V6;

    /* renamed from: W6 */
    private int f57662W6;

    /* renamed from: X6 */
    private int f57663X6;

    /* renamed from: Y6 */
    private int f57664Y6;

    /* renamed from: Z6 */
    private int f57665Z6;

    /* renamed from: a7 */
    private C13704p1 f57666a7;

    /* renamed from: b7 */
    private Drawable f57667b7;

    /* renamed from: c7 */
    private int f57668c7;

    /* renamed from: d7 */
    private int f57669d7;

    /* renamed from: e7 */
    private int f57670e7;

    /* renamed from: f7 */
    private int f57671f7;

    /* renamed from: g7 */
    private int f57672g7;

    /* renamed from: h7 */
    private int f57673h7;

    /* renamed from: i7 */
    private int f57674i7;

    /* renamed from: j7 */
    private String f57675j7;

    /* renamed from: k7 */
    private StaticLayout f57676k7;

    /* renamed from: l7 */
    private boolean f57677l7;

    /* renamed from: m7 */
    private boolean f57678m7;

    /* renamed from: n7 */
    private boolean f57679n7;

    /* renamed from: o7 */
    private int f57680o7;

    /* renamed from: p7 */
    private int f57681p7;

    /* renamed from: q7 */
    private int f57682q7;

    /* renamed from: r7 */
    private long f57683r7;

    /* renamed from: s7 */
    private boolean f57684s7;

    /* renamed from: t7 */
    public static int f57654t7 = AbstractC23136l9.m118742r(180.0f);

    /* renamed from: u7 */
    public static boolean f57655u7 = false;

    /* renamed from: v7 */
    private static final int f57656v7 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: C7 */
    private static final int f57649C7 = AbstractC23136l9.m118742r(10.0f);

    public ChatRowCallTime(Context context) {
        super(context);
        if (f57657w7 == null || f57655u7) {
            C13704p1 c13704p1 = new C13704p1(1);
            f57657w7 = c13704p1;
            c13704p1.m76613c();
            f57657w7.setColor(AbstractC11531v0.m62153I3());
            f57657w7.setTextSize(AbstractC23136l9.m118742r(14.0f));
            C13704p1 c13704p12 = new C13704p1(1);
            f57658x7 = c13704p12;
            c13704p12.m76613c();
            f57658x7.setColor(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
            f57658x7.setTextSize(AbstractC23136l9.m118742r(14.0f));
            C13704p1 c13704p13 = new C13704p1(1);
            f57647A7 = c13704p13;
            c13704p13.setColor(C23212s8.m119607o(context, AbstractC16781w.TextColor5));
            f57647A7.setTextSize(AbstractC23136l9.m118742r(14.0f));
            C13704p1 c13704p14 = new C13704p1(1);
            f57648B7 = c13704p14;
            c13704p14.m76613c();
            f57648B7.setColor(C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor));
            f57648B7.setTextSize(AbstractC23136l9.m118742r(13.0f));
            f57659y7 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_voice_call_type);
            f57660z7 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_video_call_type);
            f57655u7 = false;
        }
    }

    /* renamed from: U3 */
    private String m61182U3(int i11, boolean z11, boolean z12, boolean z13, boolean z14, long j11, C17969i0 c17969i0) {
        int i12;
        if (z13) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_des_call_native_outgoing);
        }
        if (z11 && (!z14 || i11 == 3 || i11 == 1 || i11 == 4 || i11 == 5)) {
            if (z12) {
                i12 = AbstractC8020f0.str_new_time_miss_call_audio;
            } else {
                i12 = AbstractC8020f0.str_new_time_miss_call_video;
            }
            return AbstractC23136l9.m118743r0(i12);
        }
        if (j11 < 0) {
            return c17969i0.f91011p;
        }
        return AbstractC23160o0.m119253g1(j11);
    }

    /* renamed from: V3 */
    private Drawable m61183V3(int i11, boolean z11, boolean z12, boolean z13) {
        if (z11) {
            if (z13 && i11 != 3 && i11 != 5 && i11 != 4) {
                if (z12) {
                    return AbstractC11531v0.m62325t2();
                }
                return AbstractC11531v0.m62190Q2();
            }
            if (z12) {
                return AbstractC11531v0.m62310q2();
            }
            return AbstractC11531v0.m62177N2();
        }
        if (z13) {
            if (z12) {
                return AbstractC11531v0.m62325t2();
            }
            return AbstractC11531v0.m62190Q2();
        }
        if (z12) {
            return AbstractC11531v0.m62320s2();
        }
        return AbstractC11531v0.m62186P2();
    }

    /* renamed from: W3 */
    private String m61184W3(int i11, boolean z11, boolean z12, boolean z13) {
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        String str2;
        if (z11) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 != 4 && i11 != 5) {
                        if (z13) {
                            int i16 = AbstractC8020f0.str_call_out_come;
                            Object[] objArr = new Object[1];
                            if (z12) {
                                str2 = f57659y7;
                            } else {
                                str2 = f57660z7;
                            }
                            objArr[0] = str2;
                            return AbstractC23136l9.m118746s0(i16, objArr);
                        }
                        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_miss_cal_in_come);
                    }
                    if (z13) {
                        i15 = AbstractC8020f0.str_new_call_cancel_out_come;
                    } else {
                        i15 = AbstractC8020f0.str_new_miss_cal_in_come;
                    }
                    return AbstractC23136l9.m118743r0(i15);
                }
                if (z13) {
                    i14 = AbstractC8020f0.str_new_call_reject_out_come;
                } else {
                    i14 = AbstractC8020f0.str_new_call_reject_in_come;
                }
                return AbstractC23136l9.m118743r0(i14);
            }
            if (z13) {
                i13 = AbstractC8020f0.str_new_call_busy_out_come;
            } else {
                i13 = AbstractC8020f0.str_new_miss_cal_in_come;
            }
            return AbstractC23136l9.m118743r0(i13);
        }
        if (z13) {
            i12 = AbstractC8020f0.str_call_out_come;
        } else {
            i12 = AbstractC8020f0.str_call_in_come;
        }
        Object[] objArr2 = new Object[1];
        if (z12) {
            str = f57659y7;
        } else {
            str = f57660z7;
        }
        objArr2[0] = str;
        return AbstractC23136l9.m118746s0(i12, objArr2);
    }

    /* renamed from: X3 */
    private void m61185X3() {
        C13704p1 c13704p1 = new C13704p1(1);
        f57650D7 = c13704p1;
        c13704p1.setColor(-1);
        f57650D7.setTypeface(Typeface.DEFAULT_BOLD);
        f57650D7.setTextSize(AbstractC23136l9.m118759w1(10));
        Paint paint = new Paint(1);
        f57653G7 = paint;
        paint.setStyle(Paint.Style.FILL);
        f57653G7.setColor(-21727);
        f57651E7 = new RectF();
        f57652F7 = AbstractC23136l9.m118742r(4.0f);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int i13 = this.f57662W6;
        int i14 = this.f57663X6;
        Drawable drawable = this.f57667b7;
        if (drawable != null) {
            i13 = Math.max(i13, drawable.getIntrinsicWidth() + this.f57670e7 + f57656v7);
            i14 += this.f57667b7.getIntrinsicHeight() + ChatRow.f57189F5;
        }
        c28227x3.f131648a = Math.max(getBubblePaddingLeft() + i13 + getBubblePaddingRight(), f57654t7);
        c28227x3.f131649b = i14;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        C13704p1 c13704p1;
        boolean z12;
        super.mo60953C3(c17945a0, c28769a, z11);
        if ((c17945a0.m94929K2() instanceof C18013y0) && ((C18013y0) c17945a0.m94929K2()).f91252C != null) {
            if (((C18013y0) c17945a0.m94929K2()).f91252C.f91038a == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f57677l7 = z12;
            this.f57679n7 = ((C18013y0) c17945a0.m94929K2()).f91252C.m95615a();
            this.f57682q7 = ((C18013y0) c17945a0.m94929K2()).f91252C.f91040c;
            this.f57683r7 = ((C18013y0) c17945a0.m94929K2()).f91252C.f91041d;
            this.f57684s7 = ((C18013y0) c17945a0.m94929K2()).f91252C.f91042e;
        }
        boolean equals = c17945a0.m94929K2().f91016u.equals("recommened.misscall");
        this.f57678m7 = equals;
        if (equals && !c17945a0.m95032V6()) {
            c13704p1 = f57658x7;
        } else {
            c13704p1 = f57657w7;
        }
        this.f57666a7 = c13704p1;
        this.f57675j7 = m61182U3(this.f57682q7, this.f57678m7, this.f57677l7, this.f57684s7, c17945a0.m95032V6(), this.f57683r7, c17945a0.m94929K2());
        this.f57661V6 = m61184W3(this.f57682q7, this.f57678m7, this.f57677l7, c17945a0.m95032V6());
        this.f57667b7 = m61183V3(this.f57682q7, this.f57678m7, this.f57677l7, c17945a0.m95032V6());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        super.mo60975I3(c17945a0, c28769a, i11);
        this.f57670e7 = AbstractC23136l9.m118764y0(ChatRow.f57251x5, this.f57675j7);
        this.f57671f7 = AbstractC23136l9.m118761x0(ChatRow.f57251x5, this.f57675j7);
        this.f57662W6 = AbstractC23136l9.m118764y0(ChatRow.f57251x5, this.f57661V6);
        this.f57663X6 = AbstractC23136l9.m118761x0(ChatRow.f57251x5, this.f57661V6);
        if (this.f57679n7) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_callback);
            this.f57676k7 = AbstractC23214t.m119625l(m118743r0, f57648B7, AbstractC23136l9.m118764y0(f57648B7, m118743r0), 1);
        }
        if (this.f57684s7 && f57653G7 == null) {
            m61185X3();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: d2 */
    public int mo61051d2(int i11, int i12, int i13, int i14, boolean z11) {
        StaticLayout staticLayout;
        if (this.f57679n7 && (staticLayout = this.f57676k7) != null) {
            int i15 = ChatRow.f57201L5;
            this.f57674i7 = i12 + i15;
            int i16 = i12 + i15;
            this.f57680o7 = ((i11 + i13) / 2) - (staticLayout.getWidth() / 2);
            int i17 = f57649C7;
            this.f57681p7 = i16 + i17;
            i12 = i16 + this.f57676k7.getHeight() + (i17 * 2);
        }
        return super.mo61051d2(i11, i12, i13, i14, z11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int bubblePaddingLeft = i11 + getBubblePaddingLeft();
        this.f57664Y6 = bubblePaddingLeft;
        int i15 = i12 + this.f57663X6;
        this.f57665Z6 = i15;
        this.f57668c7 = bubblePaddingLeft;
        this.f57669d7 = i15 + ChatRow.f57189F5;
        this.f57672g7 = bubblePaddingLeft + this.f57667b7.getIntrinsicWidth() + f57656v7;
        this.f57673h7 = this.f57669d7 + (this.f57667b7.getIntrinsicHeight() / 2) + (this.f57671f7 / 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        String str = "";
        try {
            if (!TextUtils.isEmpty(this.f57661V6)) {
                str = "" + this.f57661V6 + " ";
            }
            if (!TextUtils.isEmpty(this.f57675j7)) {
                str = str + this.f57675j7 + " ";
            }
            if (this.f57679n7 && this.f57676k7 != null) {
                return str + ((Object) this.f57676k7.getText());
            }
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: q0 */
    public void mo61103q0(Canvas canvas) {
        super.mo61103q0(canvas);
        if (this.f57679n7 && this.f57676k7 != null) {
            float f11 = this.f57530u0;
            int i11 = this.f57674i7;
            canvas.drawLine(f11, i11, this.f57536v0, i11, ChatRow.f57255z5);
            canvas.save();
            canvas.translate(this.f57680o7, this.f57681p7);
            this.f57676k7.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        C13704p1 c13704p1;
        int m118742r;
        canvas.drawText(this.f57675j7, this.f57672g7, this.f57673h7, f57647A7);
        AbstractC28236y3.m142204o(this.f57667b7, this.f57668c7, this.f57669d7).draw(canvas);
        String str = this.f57661V6;
        float f11 = this.f57664Y6;
        float f12 = this.f57665Z6;
        if (this.f57678m7) {
            c13704p1 = this.f57666a7;
        } else {
            c13704p1 = f57657w7;
        }
        canvas.drawText(str, f11, f12, c13704p1);
        if (this.f57684s7) {
            if (this.f57263B.m94987Q7()) {
                f57651E7.set(this.f57536v0 + AbstractC23136l9.m118742r(2.0f), this.f57541w0 - AbstractC23136l9.m118742r(20.0f), this.f57536v0 + AbstractC23136l9.m118742r(30.0f), this.f57541w0);
                m118742r = this.f57536v0 + AbstractC23136l9.m118742r(7.0f);
            } else {
                f57651E7.set(this.f57530u0 - AbstractC23136l9.m118742r(30.0f), this.f57541w0 - AbstractC23136l9.m118742r(20.0f), this.f57530u0 - AbstractC23136l9.m118742r(2.0f), this.f57541w0);
                m118742r = this.f57530u0 - AbstractC23136l9.m118742r(25.0f);
            }
            RectF rectF = f57651E7;
            int i11 = f57652F7;
            canvas.drawRoundRect(rectF, i11, i11, f57653G7);
            canvas.drawText("SIM", m118742r, this.f57541w0 - AbstractC23136l9.m118742r(6.5f), f57650D7);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f57670e7 = 0;
        this.f57671f7 = 0;
        this.f57677l7 = true;
        this.f57682q7 = 0;
        this.f57683r7 = -1L;
        this.f57684s7 = false;
        this.f57676k7 = null;
        this.f57679n7 = false;
        this.f57680o7 = -1;
        this.f57681p7 = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: z2 */
    public C28227x3 mo61130z2(int i11, int i12, int i13, C28227x3 c28227x3) {
        C28227x3 mo61130z2 = super.mo61130z2(i11, i12, i13, c28227x3);
        if (this.f57679n7 && this.f57676k7 != null) {
            mo61130z2.f131648a = Math.max(mo61130z2.f131648a, getBubblePaddingLeft() + this.f57676k7.getWidth() + getBubblePaddingRight());
            mo61130z2.f131649b += ChatRow.f57201L5 + this.f57676k7.getHeight() + (f57649C7 * 2);
        }
        return mo61130z2;
    }
}
