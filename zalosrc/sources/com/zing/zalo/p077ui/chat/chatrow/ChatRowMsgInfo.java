package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.content.AbstractC1388a;
import au.C2343e;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.group.poll.C11996a;
import com.zing.zalo.p077ui.widget.C13658k;
import com.zing.zalo.p077ui.widget.C13703p0;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import dj.AbstractC18007v0;
import dj.C17945a0;
import dj.C18005u0;
import dj.C18011x0;
import h70.AbstractC19907a;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23278z2;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p716zh.C31961i8;
import th.AbstractC26683d;
import vg.AbstractC28245z3;
import vg.C28176r6;
import vg.C28203u6;
import vg.C28227x3;
import w50.C28769a;
import w50.C28771c;

/* loaded from: classes5.dex */
public class ChatRowMsgInfo extends ChatRowHasCaption {

    /* renamed from: f8 */
    public static boolean f58150f8 = false;

    /* renamed from: g8 */
    public static final int f58151g8 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: h8 */
    public static final int f58152h8 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: i8 */
    static final int f58153i8;

    /* renamed from: j8 */
    public static final int f58154j8;

    /* renamed from: k8 */
    public static final int f58155k8;

    /* renamed from: l8 */
    public static final int f58156l8;

    /* renamed from: m8 */
    static StaticLayout f58157m8;

    /* renamed from: n8 */
    static int f58158n8;

    /* renamed from: o8 */
    static int f58159o8;

    /* renamed from: p8 */
    static C13704p1 f58160p8;

    /* renamed from: B7 */
    private final int f58161B7;

    /* renamed from: C7 */
    int f58162C7;

    /* renamed from: D7 */
    int f58163D7;

    /* renamed from: E7 */
    int f58164E7;

    /* renamed from: F7 */
    int f58165F7;

    /* renamed from: G7 */
    int f58166G7;

    /* renamed from: H7 */
    C13703p0 f58167H7;

    /* renamed from: I7 */
    AbstractC18007v0 f58168I7;

    /* renamed from: J7 */
    boolean f58169J7;

    /* renamed from: K7 */
    boolean f58170K7;

    /* renamed from: L7 */
    boolean f58171L7;

    /* renamed from: M7 */
    int f58172M7;

    /* renamed from: N7 */
    ArrayList f58173N7;

    /* renamed from: O7 */
    ArrayList f58174O7;

    /* renamed from: P7 */
    Drawable[] f58175P7;

    /* renamed from: Q7 */
    boolean[] f58176Q7;

    /* renamed from: R7 */
    Drawable f58177R7;

    /* renamed from: S7 */
    C13658k f58178S7;

    /* renamed from: T7 */
    C3977j[] f58179T7;

    /* renamed from: U7 */
    Drawable f58180U7;

    /* renamed from: V7 */
    C11996a f58181V7;

    /* renamed from: W7 */
    boolean f58182W7;

    /* renamed from: X7 */
    boolean f58183X7;

    /* renamed from: Y7 */
    int f58184Y7;

    /* renamed from: Z7 */
    int f58185Z7;

    /* renamed from: a8 */
    int f58186a8;

    /* renamed from: b8 */
    int f58187b8;

    /* renamed from: c8 */
    int f58188c8;

    /* renamed from: d8 */
    int f58189d8;

    /* renamed from: e8 */
    boolean f58190e8;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowMsgInfo$a */
    /* loaded from: classes5.dex */
    class C11379a extends AbstractC19907a {

        /* renamed from: a */
        final /* synthetic */ C31961i8 f58191a;

        /* renamed from: b */
        final /* synthetic */ C18011x0 f58192b;

        C11379a(C31961i8 c31961i8, C18011x0 c18011x0) {
            this.f58191a = c31961i8;
            this.f58192b = c18011x0;
        }

        @Override // h70.AbstractC19907a
        /* renamed from: c */
        public void mo35630c(boolean z11) {
            if (z11) {
                AbstractC23647d.m123897g("10010018");
            } else {
                AbstractC23647d.m123897g("10010010");
            }
            ChatRowMsgInfo.this.getDelegate().mo62080d4(this.f58191a.f146883d, this.f58192b.f91248K, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowMsgInfo$b */
    /* loaded from: classes5.dex */
    public class C11380b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f58194l1;

        /* renamed from: m1 */
        final /* synthetic */ int f58195m1;

        C11380b(String str, int i11) {
            this.f58194l1 = str;
            this.f58195m1 = i11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (ChatRowMsgInfo.this.f57263B != null && TextUtils.equals(str, this.f58194l1)) {
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        ChatRowMsgInfo chatRowMsgInfo = ChatRowMsgInfo.this;
                        chatRowMsgInfo.f58175P7[this.f58195m1] = chatRowMsgInfo.f58177R7;
                        ChatRowMsgInfo chatRowMsgInfo2 = ChatRowMsgInfo.this;
                        chatRowMsgInfo2.f58167H7.m76605e(chatRowMsgInfo2.f58175P7);
                    }
                    ChatRowMsgInfo chatRowMsgInfo3 = ChatRowMsgInfo.this;
                    boolean[] zArr = chatRowMsgInfo3.f58176Q7;
                    int i11 = this.f58195m1;
                    zArr[i11] = true;
                    C3977j c3977j = chatRowMsgInfo3.f58179T7[i11];
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    Drawable drawable = ChatRowMsgInfo.this.f58175P7[this.f58195m1];
                    if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == c3979l.m18839c()) {
                        return;
                    }
                    if (c23995f.m125666q() == 4) {
                        ChatRowMsgInfo.this.f58175P7[this.f58195m1] = new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c());
                    } else {
                        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{C23278z2.m120143n().f116261b, new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c())});
                        transitionDrawable.setCallback(ChatRowMsgInfo.this);
                        transitionDrawable.setCrossFadeEnabled(true);
                        transitionDrawable.startTransition(1000);
                        ChatRowMsgInfo.this.f58175P7[this.f58195m1] = transitionDrawable;
                    }
                    ChatRowMsgInfo chatRowMsgInfo22 = ChatRowMsgInfo.this;
                    chatRowMsgInfo22.f58167H7.m76605e(chatRowMsgInfo22.f58175P7);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowMsgInfo$c */
    /* loaded from: classes5.dex */
    public class C11381c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f58197l1;

        /* renamed from: m1 */
        final /* synthetic */ int f58198m1;

        C11381c(String str, int i11) {
            this.f58197l1 = str;
            this.f58198m1 = i11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (ChatRowMsgInfo.this.f57263B != null && TextUtils.equals(str, this.f58197l1)) {
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        ChatRowMsgInfo chatRowMsgInfo = ChatRowMsgInfo.this;
                        chatRowMsgInfo.f58175P7[this.f58198m1] = chatRowMsgInfo.f58177R7;
                        ChatRowMsgInfo chatRowMsgInfo2 = ChatRowMsgInfo.this;
                        chatRowMsgInfo2.f58167H7.m76605e(chatRowMsgInfo2.f58175P7);
                    }
                    ChatRowMsgInfo chatRowMsgInfo3 = ChatRowMsgInfo.this;
                    boolean[] zArr = chatRowMsgInfo3.f58176Q7;
                    int i11 = this.f58198m1;
                    zArr[i11] = true;
                    C3977j c3977j = chatRowMsgInfo3.f58179T7[i11];
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    Drawable drawable = ChatRowMsgInfo.this.f58175P7[this.f58198m1];
                    if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == c3979l.m18839c()) {
                        return;
                    }
                    if (c23995f.m125666q() == 4) {
                        ChatRowMsgInfo.this.f58175P7[this.f58198m1] = new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c());
                    } else {
                        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{C23278z2.m120143n().f116261b, new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c())});
                        transitionDrawable.setCallback(ChatRowMsgInfo.this);
                        transitionDrawable.setCrossFadeEnabled(true);
                        transitionDrawable.startTransition(1000);
                        ChatRowMsgInfo.this.f58175P7[this.f58198m1] = transitionDrawable;
                    }
                    ChatRowMsgInfo chatRowMsgInfo22 = ChatRowMsgInfo.this;
                    chatRowMsgInfo22.f58167H7.m76605e(chatRowMsgInfo22.f58175P7);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowMsgInfo$d */
    /* loaded from: classes5.dex */
    public class C11382d extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f58200l1;

        C11382d(String str) {
            this.f58200l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            try {
                if (!str.equals(this.f58200l1)) {
                    return;
                }
                ChatRowMsgInfo chatRowMsgInfo = ChatRowMsgInfo.this;
                boolean z11 = true;
                chatRowMsgInfo.f58176Q7[0] = true;
                C3977j c3977j = chatRowMsgInfo.f58179T7[0];
                if (c3977j != null) {
                    c3977j.setImageInfo(c3979l, false);
                }
                if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                        C13658k c13658k = ChatRowMsgInfo.this.f58178S7;
                        if (c23995f.m125666q() == 4) {
                            z11 = false;
                        }
                        c13658k.m76334m(m18839c, z11);
                        ChatRowMsgInfo.this.invalidate();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(12.0f);
        f58153i8 = m118742r;
        f58154j8 = AbstractC23136l9.m118742r(6.0f);
        f58155k8 = AbstractC23136l9.m118742r(18.0f);
        f58156l8 = m118742r;
    }

    public ChatRowMsgInfo(Context context) {
        super(context);
        this.f58173N7 = new ArrayList();
        this.f58174O7 = new ArrayList();
        this.f58175P7 = new Drawable[4];
        this.f58176Q7 = new boolean[4];
        this.f58179T7 = new C3977j[4];
        this.f58182W7 = false;
        this.f58183X7 = true;
        this.f58190e8 = false;
        this.f58161B7 = m61472y4(context) - AbstractC23136l9.m118742r(50.0f);
        this.f58167H7 = new C13703p0(this);
        this.f58177R7 = C23278z2.m120143n().f116261b;
        int i11 = 0;
        while (true) {
            C3977j[] c3977jArr = this.f58179T7;
            if (i11 >= c3977jArr.length) {
                break;
            }
            c3977jArr[i11] = new C3977j(getContext());
            i11++;
        }
        C13658k c13658k = new C13658k(this);
        this.f58178S7 = c13658k;
        c13658k.m76341t(0, f58155k8);
        this.f58178S7.m76343v(false);
        if (f58150f8) {
            f58160p8 = null;
            f58150f8 = false;
        }
    }

    public static int getMaxMsgInfoWidth() {
        return (AbstractC23136l9.m118681V() - (f58151g8 * 2)) - (f58154j8 * 2);
    }

    /* renamed from: y4 */
    public static int m61472y4(Context context) {
        return (AbstractC23136l9.m118683W(context) - (f58151g8 * 2)) - (f58154j8 * 2);
    }

    /* renamed from: z4 */
    private void m61473z4() {
        if (f58160p8 == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f58160p8 = c13704p1;
            c13704p1.setTypeface(Typeface.DEFAULT);
            f58160p8.setColor(AbstractC11531v0.m62222Y2());
            f58160p8.setTextSize(AbstractC23136l9.m118742r(12.0f));
        }
        if (f58157m8 == null) {
            StaticLayout m119623j = AbstractC23214t.m119623j(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more_msg_info_group), f58160p8, AbstractC23136l9.m118728m0(getContext(), getDelegate().mo62071Y3()), 1, Layout.Alignment.ALIGN_NORMAL);
            f58157m8 = m119623j;
            f58158n8 = (int) m119623j.getLineWidth(0);
            f58159o8 = f58157m8.getHeight();
        }
    }

    /* renamed from: A4 */
    boolean m61474A4(float f11, float f12) {
        return f11 >= ((float) this.f58184Y7) && f11 <= ((float) this.f58186a8) && f12 >= ((float) this.f58185Z7) && f12 <= ((float) this.f58187b8);
    }

    /* renamed from: B4 */
    void m61475B4() {
        try {
            if (this.f58176Q7[0]) {
                return;
            }
            String str = this.f58168I7.f91205G;
            this.f58178S7.m76331h();
            if (!TextUtils.isEmpty(str)) {
                ((C23528a) this.f57275D.m123612r(this.f58179T7[0])).m123579C(str, C23278z2.m120146o0(), new C11382d(str));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int i13;
        int i14 = 0;
        if (mo61163l4()) {
            i14 = getTextWidth() + (f58151g8 * 2);
            i13 = Math.max(0, getTextHeight());
        } else {
            i13 = 0;
        }
        if (this.f58169J7) {
            i14 += C13703p0.f70894r + f58154j8;
            i13 = Math.max(i13, C13703p0.f70895s);
        } else if (this.f58170K7 || this.f58171L7) {
            int i15 = f58155k8;
            i14 += f58154j8 + i15;
            i13 = Math.max(i13, i15);
        }
        c28227x3.f131648a = i14;
        c28227x3.f131649b = i13;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        C31961i8 m141707h;
        super.mo60953C3(c17945a0, c28769a, z11);
        this.f58183X7 = c28769a.m143907a();
        if (c17945a0.m94929K2() != null) {
            if (!c17945a0.m95161i7() && !c17945a0.m94899G7() && !c17945a0.m94872D8()) {
                if (c17945a0.m95031V5()) {
                    this.f58171L7 = true;
                    this.f58180U7 = AbstractC1388a.m6964f(getContext(), C18005u0.m95716h(1));
                    return;
                }
                return;
            }
            AbstractC18007v0 abstractC18007v0 = (AbstractC18007v0) c17945a0.m94929K2();
            this.f58168I7 = abstractC18007v0;
            ArrayList arrayList = abstractC18007v0.f91204F;
            if (arrayList != null && arrayList.size() > 0) {
                this.f58169J7 = true;
                Iterator it = this.f58168I7.f91204F.iterator();
                while (it.hasNext()) {
                    ContactProfile contactProfile = (ContactProfile) it.next();
                    if (contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                        contactProfile.f42446v = AbstractC23304d.f113368c0.f42446v;
                    } else {
                        ContactProfile m141811g = C28203u6.f131407a.m141811g(contactProfile.f42434r);
                        if (m141811g != null) {
                            contactProfile.f42446v = m141811g.f42446v;
                        }
                    }
                }
                ArrayList arrayList2 = this.f58168I7.f91204F;
                this.f58174O7 = arrayList2;
                int min = Math.min(arrayList2.size(), 4);
                this.f58172M7 = min;
                this.f58167H7.m76607g(min, this.f58168I7.f91206H, this.f58175P7);
            } else {
                ArrayList arrayList3 = this.f58168I7.f91203E;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    this.f58169J7 = true;
                    ArrayList arrayList4 = this.f58168I7.f91203E;
                    this.f58173N7 = arrayList4;
                    int min2 = Math.min(arrayList4.size(), 4);
                    this.f58172M7 = min2;
                    this.f58167H7.m76607g(min2, this.f58168I7.f91206H, this.f58175P7);
                } else if (!TextUtils.isEmpty(this.f58168I7.f91205G)) {
                    this.f58170K7 = true;
                } else if (this.f58168I7.f91207I > 0) {
                    this.f58171L7 = true;
                    this.f58180U7 = AbstractC23136l9.m118665N(getContext(), C18005u0.m95716h(this.f58168I7.f91207I));
                }
            }
            if (c17945a0.m94899G7()) {
                C18011x0 c18011x0 = (C18011x0) this.f58168I7;
                if (!TextUtils.isEmpty(c18011x0.f91248K) && (m141707h = C28176r6.m141702d().m141707h(c17945a0.mo95039W2(), c18011x0.f91248K, c18011x0.f91249L)) != null && m141707h.m153670h()) {
                    this.f58182W7 = true;
                    if (this.f58181V7 == null) {
                        C11996a c11996a = new C11996a(this);
                        this.f58181V7 = c11996a;
                        c11996a.m66626j(AbstractC23136l9.m118742r(40.0f));
                        this.f58181V7.m66629m(false);
                    }
                    this.f58181V7.m66625i(m141707h, true);
                    this.f58181V7.m66624h(new C11379a(m141707h, c18011x0));
                }
            }
        }
    }

    /* renamed from: C4 */
    void m61476C4() {
        for (int i11 = 0; i11 < this.f58172M7; i11++) {
            try {
                if (!this.f58176Q7[i11]) {
                    AbstractC3972e.m18781f0(this.f58179T7[i11]);
                    ContactProfile contactProfile = (ContactProfile) this.f58174O7.get(i11);
                    String str = contactProfile.f42446v;
                    if (!TextUtils.isEmpty(str) && this.f58169J7) {
                        if (C23302b.f113247a.m120523d(str)) {
                            int m12307a = C2343e.m12307a(contactProfile.f42434r, false);
                            this.f58175P7[i11] = C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(AbstractC21935u.m114542i(contactProfile.f42434r, contactProfile.f42437s)), m12307a);
                            this.f58167H7.m76605e(this.f58175P7);
                            this.f58176Q7[i11] = true;
                        } else if (getDelegate().mo62069W3() || C23999j.m125696L2(str, C23278z2.m120143n())) {
                            ((C23528a) this.f57275D.m123612r(this.f58179T7[i11])).m123579C(str, C23278z2.m120143n(), new C11380b(str, i11));
                        }
                    }
                    this.f58176Q7[i11] = true;
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        super.mo60975I3(c17945a0, c28769a, i11);
        if (this.f58183X7) {
            m61473z4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: J */
    protected boolean mo60976J() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: K */
    protected boolean mo60981K() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L0 */
    protected boolean mo60985L0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Q */
    public boolean mo61007Q(boolean z11, boolean z12) {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: R */
    protected boolean mo61011R() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: R0 */
    protected int mo61012R0(int i11, int i12, int i13, int i14, boolean z11) {
        return (i11 - i12) / 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: S0 */
    public int mo61017S0(int i11, int i12, int i13, boolean z11) {
        return ((i11 + i12) / 2) - (i13 / 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: T */
    public boolean mo61021T(C28769a c28769a) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: W */
    public boolean mo61028W(C28771c c28771c, C17945a0 c17945a0) {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        if (this.f58169J7) {
            if (this.f58174O7 != null) {
                m61476C4();
            } else {
                mo61100p2();
            }
        } else if (this.f58170K7) {
            m61475B4();
        }
        if (AbstractC26683d.f126393l) {
            CharSequence processedText = getProcessedText();
            if (!TextUtils.isEmpty(processedText)) {
                AbstractC28245z3.m142219b(processedText, this);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: b2 */
    protected int mo61043b2(int i11, int i12, int i13, int i14, boolean z11) {
        if (this.f58183X7 && f58157m8 != null) {
            int i15 = ((i11 + i13) / 2) - (this.f57341O / 2);
            int i16 = f58158n8;
            int i17 = f58151g8;
            this.f58184Y7 = i15;
            this.f58186a8 = i16 + (i17 * 2) + i15;
            this.f58185Z7 = i12;
            int i18 = f58159o8;
            int i19 = f58152h8;
            this.f58187b8 = i12 + i18 + (i19 * 2);
            this.f58188c8 = i15 + i17;
            this.f58189d8 = i12 + i19;
            return i12 + i18 + (i19 * 2) + f58156l8;
        }
        return i12;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        C31961i8 c31961i8;
        if (super.mo61046c0(c17945a0, c28769a)) {
            return true;
        }
        if (this.f58183X7 != c28769a.m143907a()) {
            return true;
        }
        if (c17945a0.m94899G7()) {
            AbstractC18007v0 abstractC18007v0 = this.f58168I7;
            if (abstractC18007v0 instanceof C18011x0) {
                C18011x0 c18011x0 = (C18011x0) abstractC18007v0;
                if (!TextUtils.isEmpty(c18011x0.f91248K)) {
                    C11996a c11996a = this.f58181V7;
                    if (c11996a != null) {
                        c31961i8 = c11996a.m66621e();
                    } else {
                        c31961i8 = null;
                    }
                    C31961i8 m141707h = C28176r6.m141702d().m141707h(c17945a0.mo95039W2(), c18011x0.f91248K, c18011x0.f91249L);
                    if (c31961i8 == null && m141707h == null) {
                        return false;
                    }
                    if (c31961i8 == null || m141707h == null || c31961i8.f146895p < m141707h.f146895p || c31961i8.m153670h() != m141707h.m153670h()) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c2 */
    public void mo61048c2(int i11, int i12, int i13, int i14, boolean z11) {
        C11996a c11996a;
        if (this.f58182W7 && (c11996a = this.f58181V7) != null) {
            c11996a.m66627k(((i11 + i13) / 2) - (this.f57353Q / 2), i12 + f58153i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        int i16;
        int i17 = ((i11 + i13) / 2) - (this.f57422c0 / 2);
        this.f58166G7 = i17;
        int i18 = i17 + f58151g8;
        if (this.f58169J7) {
            this.f58164E7 = i18;
            this.f58165F7 = i12;
            i15 = C13703p0.f70894r;
            i16 = f58154j8;
        } else {
            if (this.f58170K7 || this.f58171L7) {
                this.f58164E7 = i18;
                this.f58165F7 = i12;
                i15 = f58155k8;
                i16 = f58154j8;
            }
            if (!mo61163l4()) {
                this.f58162C7 = i18;
                this.f58163D7 = ((i12 + i14) / 2) - (getTextHeight() / 2);
                return;
            }
            return;
        }
        i18 += i15 + i16;
        if (!mo61163l4()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMarginBottom() {
        if (this.f57413a3) {
            return f58153i8;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMarginTop() {
        return f58153i8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        return Math.max(getWidthMeasurement() - (f58154j8 * 2), this.f58161B7);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingBottom() {
        return f58152h8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return f58152h8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        String msgContentTalkText = super.getMsgContentTalkText();
        try {
            if (this.f58183X7 && f58157m8 != null) {
                return f58157m8.getText().toString() + "\n" + msgContentTalkText;
            }
            return msgContentTalkText;
        } catch (Exception e11) {
            e11.printStackTrace();
            return msgContentTalkText;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58162C7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58163D7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: h3 */
    protected boolean mo61069h3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 != 1 || !this.f58190e8 || !m61474A4(f11, f12)) {
                return false;
            }
            getDelegate().mo62104v4(this);
            return true;
        }
        if (!this.f58183X7 || !m61474A4(f11, f12)) {
            z11 = false;
        }
        this.f58190e8 = z11;
        return z11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: h4 */
    protected AbstractC23214t.a mo61199h4(C17945a0 c17945a0, String str, int i11, boolean z11) {
        if (i11 > 0 && !TextUtils.isEmpty(str)) {
            return c17945a0.m94958N5(str, i11);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: i3 */
    public boolean mo61072i3(MotionEvent motionEvent, int i11, float f11, float f12) {
        if (this.f58182W7 && this.f58181V7.m66623g(i11, f11, f12)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: j4 */
    public int mo61198j4(int i11) {
        return i11 - (f58151g8 * 2);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        return c17945a0.m95019U3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.ChatRowBase
    /* renamed from: n */
    public void mo61088n() {
        if (this.f57263B.m94899G7() && !TextUtils.isEmpty(((C18011x0) this.f58168I7).f91248K)) {
            AbstractC23647d.m123897g("1001678");
            getDelegate().mo62090j4(this, null);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: n0 */
    protected void mo61089n0(Canvas canvas) {
        if (this.f58183X7 && f58157m8 != null) {
            AbstractC11531v0.m62181O1().setBounds(this.f58184Y7, this.f58185Z7, this.f58186a8, this.f58187b8);
            AbstractC11531v0.m62181O1().draw(canvas);
            canvas.save();
            canvas.translate(this.f58188c8, this.f58189d8);
            f58157m8.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: o0 */
    public void mo61093o0(Canvas canvas, int i11, int i12, int i13, int i14) {
        Drawable m62181O1 = AbstractC11531v0.m62181O1();
        int i15 = this.f58166G7;
        m62181O1.setBounds(i15, i12, this.f57422c0 + i15, i14);
        AbstractC11531v0.m62181O1().draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11996a c11996a = this.f58181V7;
        if (c11996a != null) {
            c11996a.m66618b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: p0 */
    public void mo61098p0(Canvas canvas) {
        C11996a c11996a;
        if (this.f58182W7 && (c11996a = this.f58181V7) != null) {
            c11996a.m66619c(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: p2 */
    void mo61100p2() {
        for (int i11 = 0; i11 < this.f58172M7; i11++) {
            try {
                if (!this.f58176Q7[i11]) {
                    AbstractC3972e.m18781f0(this.f58179T7[i11]);
                    String str = (String) this.f58173N7.get(i11);
                    if (!TextUtils.isEmpty(str) && this.f58169J7) {
                        if (!getDelegate().mo62069W3() && !C23999j.m125696L2(str, C23278z2.m120143n())) {
                        }
                        ((C23528a) this.f57275D.m123612r(this.f58179T7[i11])).m123579C(str, C23278z2.m120143n(), new C11381c(str, i11));
                    }
                    this.f58176Q7[i11] = true;
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: p4 */
    protected boolean mo61430p4(int i11, C17945a0 c17945a0) {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public void setMessage(C28771c c28771c) {
        this.f57257A = c28771c;
        setMessage(c28771c.m143954n());
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        if (this.f58169J7 && this.f58167H7 != null) {
            canvas.save();
            canvas.translate(this.f58164E7, this.f58165F7);
            this.f58167H7.m76603a(canvas);
            canvas.restore();
            return;
        }
        if (this.f58170K7) {
            canvas.save();
            canvas.translate(this.f58164E7, this.f58165F7);
            this.f58178S7.m76325a(canvas);
            canvas.restore();
            return;
        }
        if (this.f58171L7) {
            Drawable drawable = this.f58180U7;
            int i11 = this.f58164E7;
            int i12 = this.f58165F7;
            int i13 = f58155k8;
            drawable.setBounds(i11, i12, i11 + i13, i13 + i12);
            this.f58180U7.draw(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58162C7 = -1;
        this.f58163D7 = -1;
        this.f58164E7 = -1;
        this.f58165F7 = -1;
        this.f58166G7 = -1;
        this.f58169J7 = false;
        this.f58171L7 = false;
        this.f58170K7 = false;
        this.f58182W7 = false;
        this.f58183X7 = false;
        this.f58173N7 = null;
        this.f58174O7 = null;
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f58175P7;
            if (i11 < drawableArr.length) {
                drawableArr[i11] = this.f58177R7;
                this.f58176Q7[i11] = false;
                i11++;
            } else {
                this.f58172M7 = 0;
                return;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: x2 */
    protected C28227x3 mo61125x2(int i11, int i12, int i13, C28227x3 c28227x3) {
        if (this.f58183X7 && f58157m8 != null) {
            c28227x3.f131649b += f58159o8 + (f58152h8 * 2) + f58156l8;
            c28227x3.f131648a = Math.max(c28227x3.f131648a, f58158n8 + (f58151g8 * 2));
        }
        return c28227x3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: y2 */
    public C28227x3 mo61128y2(int i11, int i12, int i13, C28227x3 c28227x3) {
        C11996a c11996a;
        if (this.f58182W7 && (c11996a = this.f58181V7) != null) {
            c28227x3.f131648a = c11996a.m66622f();
            c28227x3.f131649b = this.f58181V7.m66620d() + f58153i8;
        }
        return c28227x3;
    }
}
