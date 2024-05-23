package com.zing.zalo.p077ui.chat.chatrow;

import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.location.C8976v;
import com.zing.zalo.location.C8977w;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import dj.C17945a0;
import dj.C18002t0;
import ho0.AbstractC20110a;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23217t2;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p716zh.C31868c5;
import vg.AbstractC28236y3;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowLocation extends ChatRowHasCaption {

    /* renamed from: h8 */
    public static boolean f58057h8 = false;

    /* renamed from: j8 */
    private static C13704p1 f58059j8;

    /* renamed from: k8 */
    private static C13704p1 f58060k8;

    /* renamed from: B7 */
    final float f58062B7;

    /* renamed from: C7 */
    C18002t0 f58063C7;

    /* renamed from: D7 */
    C23528a f58064D7;

    /* renamed from: E7 */
    C3977j f58065E7;

    /* renamed from: F7 */
    C13697o f58066F7;

    /* renamed from: G7 */
    private boolean f58067G7;

    /* renamed from: H7 */
    private int f58068H7;

    /* renamed from: I7 */
    private int f58069I7;

    /* renamed from: J7 */
    private String f58070J7;

    /* renamed from: K7 */
    private String f58071K7;

    /* renamed from: L7 */
    private StaticLayout f58072L7;

    /* renamed from: M7 */
    private StaticLayout f58073M7;

    /* renamed from: N7 */
    private int f58074N7;

    /* renamed from: O7 */
    private int f58075O7;

    /* renamed from: P7 */
    private int f58076P7;

    /* renamed from: Q7 */
    private int f58077Q7;

    /* renamed from: R7 */
    private int f58078R7;

    /* renamed from: S7 */
    private int f58079S7;

    /* renamed from: T7 */
    private int f58080T7;

    /* renamed from: U7 */
    private int f58081U7;

    /* renamed from: V7 */
    private boolean f58082V7;

    /* renamed from: W7 */
    private boolean f58083W7;

    /* renamed from: X7 */
    String f58084X7;

    /* renamed from: Y7 */
    boolean f58085Y7;

    /* renamed from: Z7 */
    private C31868c5 f58086Z7;

    /* renamed from: a8 */
    private boolean f58087a8;

    /* renamed from: b8 */
    private int f58088b8;

    /* renamed from: c8 */
    private int f58089c8;

    /* renamed from: d8 */
    private int f58090d8;

    /* renamed from: e8 */
    private int f58091e8;

    /* renamed from: f8 */
    private int f58092f8;

    /* renamed from: g8 */
    private int f58093g8;

    /* renamed from: i8 */
    static final int f58058i8 = AbstractC23136l9.m118742r(1.0f);

    /* renamed from: l8 */
    private static final int f58061l8 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowLocation$a */
    /* loaded from: classes5.dex */
    class C11372a extends C23999j {
        C11372a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (str != null && str.equals(ChatRowLocation.this.f58084X7)) {
                boolean z11 = false;
                ChatRowLocation.this.f58065E7.setImageInfo(c3979l, false);
                if (c3979l != null && c3979l.m18839c() != null) {
                    ChatRowLocation chatRowLocation = ChatRowLocation.this;
                    chatRowLocation.f58085Y7 = true;
                    C13697o c13697o = chatRowLocation.f58066F7;
                    Bitmap m18839c = c3979l.m18839c();
                    if (c23995f.m125666q() != 4) {
                        z11 = true;
                    }
                    c13697o.m76480u(m18839c, z11);
                    ChatRowLocation.this.f57560z4.invalidate();
                    return;
                }
                ChatRowLocation.this.m61456z4();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowLocation$b */
    /* loaded from: classes5.dex */
    public class C11373b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ Bitmap f58095a;

        /* renamed from: b */
        final /* synthetic */ String f58096b;

        C11373b(Bitmap bitmap, String str) {
            this.f58095a = bitmap;
            this.f58096b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0032 -> B:8:0x004b). Please report as a decompilation issue!!! */
        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo928a() {
            FileOutputStream fileOutputStream;
            Throwable th2;
            Exception e11;
            try {
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            try {
                try {
                    C24003n m120068F = C23278z2.m120068F();
                    C3979l c3979l = new C3979l(this.f58095a, m120068F.f116266g);
                    C23999j.m125686E1(c3979l, this.f58096b, m120068F);
                    ChatRowLocation.this.f58065E7.setImageInfo(c3979l);
                    fileOutputStream = new FileOutputStream(this.f58096b);
                } catch (Exception e13) {
                    fileOutputStream = null;
                    e11 = e13;
                } catch (Throwable th3) {
                    fileOutputStream = null;
                    th2 = th3;
                    if (fileOutputStream != null) {
                    }
                    throw th2;
                }
                try {
                    this.f58095a.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception e14) {
                    e11 = e14;
                    e11.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e15) {
                        e15.printStackTrace();
                    }
                }
                throw th2;
            }
        }
    }

    public ChatRowLocation(Context context) {
        super(context);
        this.f58062B7 = 0.725f;
        this.f58070J7 = "";
        this.f58071K7 = "";
        this.f58074N7 = 0;
        this.f58075O7 = 0;
        this.f58076P7 = 0;
        this.f58077Q7 = 0;
        this.f58065E7 = new C3977j(MainApplication.getAppContext());
        if (f58059j8 == null || f58057h8) {
            C13704p1 c13704p1 = new C13704p1(1);
            f58059j8 = c13704p1;
            c13704p1.m76613c();
            f58059j8.setColor(AbstractC11531v0.m62226Z2());
            f58059j8.setTextSize(AbstractC23136l9.m118759w1(14));
            C13704p1 c13704p12 = new C13704p1(1);
            f58060k8 = c13704p12;
            c13704p12.setTypeface(Typeface.DEFAULT);
            f58060k8.setColor(AbstractC11531v0.m62153I3());
            f58060k8.setTextSize(AbstractC23136l9.m118759w1(14));
            f58057h8 = false;
        }
        this.f58064D7 = new C23528a(context);
        C13697o c13697o = new C13697o(this);
        this.f58066F7 = c13697o;
        c13697o.m76485z(AbstractC11531v0.m62225Z1());
    }

    /* renamed from: A4 */
    public /* synthetic */ void m61453A4(MessageId messageId, Bitmap bitmap) {
        try {
            C17945a0 c17945a0 = this.f57263B;
            if (c17945a0 != null && (c17945a0.m94929K2() instanceof C18002t0) && this.f57263B.m95135f9(messageId) && bitmap != null) {
                this.f58066F7.m76480u(bitmap, true);
                this.f57560z4.invalidate();
                this.f58085Y7 = true;
                m61454B4(bitmap, ((C18002t0) this.f57263B.m94929K2()).m95715h(true));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: B4 */
    private void m61454B4(Bitmap bitmap, String str) {
        if (!TextUtils.isEmpty(str) && bitmap != null) {
            C0824j.m2153b(new C11373b(bitmap, str));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int i13;
        int m118742r;
        int i14;
        int i15 = 0;
        if (this.f58082V7) {
            int m76473l = this.f58066F7.m76473l();
            int i16 = f58058i8;
            m118742r = Math.max(0, m76473l + (i16 * 2));
            i14 = this.f58066F7.m76472k() + (i16 * 2);
        } else {
            int max = Math.max(this.f58074N7, this.f58076P7);
            if (this.f58067G7) {
                i13 = AbstractC11531v0.m62198S2().getIntrinsicWidth() + f58061l8;
            } else {
                i13 = 0;
            }
            m118742r = AbstractC23136l9.m118742r(20.0f) + getBubblePaddingLeft() + i13 + max + getBubblePaddingRight();
            i14 = 0;
        }
        if (this.f58072L7 != null || this.f58073M7 != null || this.f58067G7) {
            int i17 = ChatRow.f57201L5;
            int i18 = i14 + i17;
            if (this.f58067G7) {
                i15 = AbstractC11531v0.m62198S2().getIntrinsicHeight();
            }
            i14 = i18 + Math.max(i15, this.f58077Q7 + this.f58075O7) + i17;
        }
        c28227x3.f131648a = m118742r;
        c28227x3.f131649b = i14;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        boolean z13;
        super.mo60953C3(c17945a0, c28769a, z11);
        if (c17945a0.m94929K2() instanceof C18002t0) {
            this.f58063C7 = (C18002t0) c17945a0.m94929K2();
        }
        boolean z14 = false;
        if (this.f58063C7 != null) {
            this.f58070J7 = c17945a0.m94929K2().f91011p;
            this.f58071K7 = c17945a0.m94929K2().f91015t;
            this.f58084X7 = this.f58063C7.m95715h(false);
            C18002t0 c18002t0 = this.f58063C7;
            this.f58086Z7 = c18002t0.f91181B;
            this.f58087a8 = c18002t0.f91184E;
        }
        if (this.f58084X7 != null && this.f58086Z7 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f58082V7 = z12;
        this.f58067G7 = !z12;
        if (this.f58087a8 && TextUtils.isEmpty(this.f58070J7)) {
            if (c17945a0.m95032V6()) {
                this.f58070J7 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_current_location_in_bubble);
            } else {
                this.f58070J7 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_other_current_location_in_bubble), c28769a.f133305a);
            }
            this.f58071K7 = "";
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z15 = this.f58082V7;
        if (!z15 || !this.f58087a8 || z13) {
            z14 = true;
        }
        this.f58083W7 = z14;
        this.f57471k1 = true;
        if (z15) {
            if (!z14) {
                this.f58066F7.m76461I(ChatRow.f57183C5);
            } else {
                this.f58066F7.m76461I(ChatRow.f57185D5);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        int i12;
        super.mo60975I3(c17945a0, c28769a, i11);
        C13697o c13697o = this.f58066F7;
        int i13 = f58058i8;
        c13697o.m76463K(5, i11 - (i13 * 2), ((int) (i11 * 0.5625f)) - (i13 * 2));
        int m76472k = (int) (this.f58066F7.m76472k() * 0.4f);
        this.f58088b8 = m76472k;
        this.f58091e8 = (int) (m76472k * 0.725f);
        if (this.f58083W7) {
            int bubblePaddingLeft = i11 - getBubblePaddingLeft();
            if (this.f58067G7) {
                i12 = AbstractC11531v0.m62198S2().getIntrinsicWidth();
            } else {
                i12 = 0;
            }
            int bubblePaddingRight = ((bubblePaddingLeft - i12) - getBubblePaddingRight()) - f58061l8;
            if (!TextUtils.isEmpty(this.f58070J7)) {
                StaticLayout m119625l = AbstractC23214t.m119625l(this.f58070J7, f58059j8, bubblePaddingRight, 1);
                this.f58072L7 = m119625l;
                this.f58074N7 = (int) m119625l.getLineWidth(0);
                this.f58075O7 = this.f58072L7.getHeight();
            }
            if (!TextUtils.isEmpty(this.f58071K7)) {
                StaticLayout m119625l2 = AbstractC23214t.m119625l(this.f58071K7, f58060k8, bubblePaddingRight, 2);
                this.f58073M7 = m119625l2;
                this.f58076P7 = AbstractC23136l9.m118695b0(m119625l2);
                this.f58077Q7 = this.f58073M7.getHeight();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L2 */
    public boolean mo60987L2() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return !this.f58082V7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (this.f58082V7 && !this.f58085Y7) {
            ((C23528a) this.f58064D7.m123612r(this.f58065E7)).m123579C(this.f58084X7, C23278z2.m120068F(), new C11372a());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: a4 */
    public List mo61270a4(List list) {
        ArrayList m119662n;
        ArrayList m119662n2;
        List list2 = null;
        try {
            if (this.f57263B == null || list == null || list.isEmpty()) {
                return null;
            }
            if (!TextUtils.isEmpty(this.f58070J7) && this.f58072L7 != null && (m119662n2 = AbstractC23217t2.m119662n(this.f58070J7, list)) != null && !m119662n2.isEmpty()) {
                list2 = AbstractC23214t.m119614a(m119662n2, this.f58072L7, this.f58070J7.length(), this.f58078R7, this.f58079S7);
            }
            if ((list2 == null || list2.isEmpty()) && !TextUtils.isEmpty(this.f58071K7) && this.f58073M7 != null && (m119662n = AbstractC23217t2.m119662n(this.f58071K7, list)) != null && !m119662n.isEmpty()) {
                return AbstractC23214t.m119614a(m119662n, this.f58073M7, this.f58071K7.length(), this.f58080T7, this.f58081U7);
            }
            return list2;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        if (this.f58082V7) {
            C13697o c13697o = this.f58066F7;
            int i15 = f58058i8;
            c13697o.m76460H(i11 + i15, i12 + i15);
            if (this.f58087a8) {
                this.f58089c8 = this.f58066F7.m76469h() + ((this.f58066F7.m76473l() - this.f58088b8) / 2);
                int m76471j = ((this.f58066F7.m76471j() + (this.f58066F7.m76472k() / 2)) - this.f58088b8) + AbstractC23136l9.m118742r(4.0f);
                this.f58090d8 = m76471j;
                if (this.f57372T0 != null) {
                    int i16 = this.f58089c8;
                    int i17 = this.f58088b8;
                    this.f58092f8 = i16 + ((i17 - this.f58091e8) / 2);
                    this.f58093g8 = (int) (m76471j + (i17 * 0.0925f));
                }
            } else {
                this.f58089c8 = this.f58066F7.m76469h() + ((this.f58066F7.m76473l() - AbstractC11531v0.m62217X1().getIntrinsicWidth()) / 2);
                this.f58090d8 = (this.f58066F7.m76471j() + (this.f58066F7.m76472k() / 2)) - AbstractC11531v0.m62217X1().getIntrinsicHeight();
            }
            i12 += this.f58066F7.m76472k() + (i15 * 2);
        }
        if (this.f58072L7 != null || this.f58073M7 != null || this.f58067G7) {
            int i18 = i12 + ChatRow.f57201L5;
            int bubblePaddingLeft = i11 + getBubblePaddingLeft();
            if (this.f58067G7) {
                this.f58068H7 = bubblePaddingLeft;
                this.f58069I7 = i18;
                bubblePaddingLeft += AbstractC11531v0.m62198S2().getIntrinsicWidth() + f58061l8;
            }
            if (this.f58072L7 != null) {
                this.f58078R7 = bubblePaddingLeft;
                this.f58079S7 = i18;
                i18 += this.f58075O7;
            }
            if (this.f58073M7 != null) {
                this.f58080T7 = bubblePaddingLeft;
                this.f58081U7 = i18;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        String msgContentTalkText = super.getMsgContentTalkText();
        try {
            String str = msgContentTalkText + AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_location) + "\n";
            if (this.f58072L7 != null) {
                str = str + ((Object) this.f58072L7.getText()) + "\n";
            }
            if (this.f58073M7 != null) {
                return str + ((Object) this.f58073M7.getText()) + "\n";
            }
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return msgContentTalkText;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        if (this.f58082V7) {
            this.f58066F7.m76467d(canvas);
            if (this.f58087a8) {
                Drawable m62202T2 = AbstractC11531v0.m62202T2();
                int i11 = this.f58089c8;
                int i12 = this.f58090d8;
                int i13 = this.f58088b8;
                m62202T2.setBounds(i11, i12, i11 + i13, i13 + i12);
                AbstractC11531v0.m62202T2().draw(canvas);
                Drawable drawable = this.f57372T0;
                if (drawable != null) {
                    int i14 = this.f58092f8;
                    int i15 = this.f58093g8;
                    int i16 = this.f58091e8;
                    drawable.setBounds(i14, i15, i14 + i16, i16 + i15);
                    this.f57372T0.draw(canvas);
                }
            } else {
                AbstractC28236y3.m142204o(AbstractC11531v0.m62217X1(), this.f58089c8, this.f58090d8).draw(canvas);
            }
        }
        if (this.f58067G7) {
            AbstractC28236y3.m142204o(AbstractC11531v0.m62198S2(), this.f58068H7, this.f58069I7).draw(canvas);
        }
        if (this.f58072L7 != null) {
            canvas.save();
            canvas.translate(this.f58078R7, this.f58079S7);
            this.f58072L7.draw(canvas);
            canvas.restore();
        }
        if (this.f58073M7 != null) {
            canvas.save();
            canvas.translate(this.f58080T7, this.f58081U7);
            this.f58073M7.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58071K7 = "";
        this.f58070J7 = "";
        this.f58072L7 = null;
        this.f58073M7 = null;
        this.f58074N7 = 0;
        this.f58075O7 = 0;
        this.f58076P7 = 0;
        this.f58077Q7 = 0;
        this.f58082V7 = false;
        this.f58083W7 = true;
        this.f58067G7 = true;
        this.f58086Z7 = null;
        this.f58084X7 = null;
        this.f58085Y7 = false;
        this.f58066F7.m76477r();
        this.f58063C7 = null;
        this.f58089c8 = -1;
        this.f58090d8 = -1;
        this.f58092f8 = -1;
        this.f58093g8 = -1;
        this.f58068H7 = -1;
        this.f58069I7 = -1;
        this.f58078R7 = -1;
        this.f58079S7 = -1;
        this.f58080T7 = -1;
        this.f58081U7 = -1;
    }

    /* renamed from: z4 */
    void m61456z4() {
        try {
            C8976v.m47987h().m48000g(new C8977w(this.f57263B.m95029V3().m41045i(), AbstractC11531v0.m62206U2(), (int) (AbstractC11531v0.m62206U2() * 0.5625f), this.f58086Z7.m153169a(), this.f58086Z7.m153170b(), 15.0f, false, false, new C8976v.a() { // from class: com.zing.zalo.ui.chat.chatrow.j0

                /* renamed from: b */
                public final /* synthetic */ MessageId f59174b;

                public /* synthetic */ C11487j0(MessageId messageId) {
                    r2 = messageId;
                }

                @Override // com.zing.zalo.location.C8976v.a
                /* renamed from: a */
                public final void mo48001a(Bitmap bitmap) {
                    ChatRowLocation.this.m61453A4(r2, bitmap);
                }
            }));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
