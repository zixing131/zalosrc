package com.zing.zalo.p077ui.chat.chatrow;

import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import dj.C17945a0;
import dj.C17996r0;
import hu.AbstractC20130d;
import java.io.FileOutputStream;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23214t;
import me0.C23212s8;
import me0.C23278z2;
import nh0.C23793c;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p471r3.EnumC25629a;
import vg.C28227x3;
import w50.C28769a;

/* loaded from: classes5.dex */
public class ChatRowLiveLocation extends ChatRow {

    /* renamed from: D7 */
    static boolean f58010D7 = false;

    /* renamed from: E7 */
    public static boolean f58011E7 = false;

    /* renamed from: F7 */
    static String f58012F7 = "";

    /* renamed from: G7 */
    static Paint f58013G7;

    /* renamed from: H7 */
    static Paint f58014H7;

    /* renamed from: I7 */
    static C13704p1 f58015I7;

    /* renamed from: J7 */
    static C13704p1 f58016J7;

    /* renamed from: A7 */
    int f58017A7;

    /* renamed from: B7 */
    int f58018B7;

    /* renamed from: C7 */
    private InterfaceC11371c f58019C7;

    /* renamed from: V6 */
    final float f58020V6;

    /* renamed from: W6 */
    final int f58021W6;

    /* renamed from: X6 */
    final float f58022X6;

    /* renamed from: Y6 */
    final float f58023Y6;

    /* renamed from: Z6 */
    final int f58024Z6;

    /* renamed from: a7 */
    final int f58025a7;

    /* renamed from: b7 */
    C17996r0 f58026b7;

    /* renamed from: c7 */
    C3977j f58027c7;

    /* renamed from: d7 */
    C13697o f58028d7;

    /* renamed from: e7 */
    boolean f58029e7;

    /* renamed from: f7 */
    volatile boolean f58030f7;

    /* renamed from: g7 */
    String f58031g7;

    /* renamed from: h7 */
    String f58032h7;

    /* renamed from: i7 */
    StaticLayout f58033i7;

    /* renamed from: j7 */
    int f58034j7;

    /* renamed from: k7 */
    StaticLayout f58035k7;

    /* renamed from: l7 */
    int f58036l7;

    /* renamed from: m7 */
    int f58037m7;

    /* renamed from: n7 */
    int f58038n7;

    /* renamed from: o7 */
    int f58039o7;

    /* renamed from: p7 */
    int f58040p7;

    /* renamed from: q7 */
    private int f58041q7;

    /* renamed from: r7 */
    private int f58042r7;

    /* renamed from: s7 */
    private int f58043s7;

    /* renamed from: t7 */
    private int f58044t7;

    /* renamed from: u7 */
    private int f58045u7;

    /* renamed from: v7 */
    private int f58046v7;

    /* renamed from: w7 */
    boolean f58047w7;

    /* renamed from: x7 */
    double f58048x7;

    /* renamed from: y7 */
    double f58049y7;

    /* renamed from: z7 */
    int f58050z7;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowLiveLocation$a */
    /* loaded from: classes5.dex */
    public class C11369a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f58051l1;

        C11369a(String str) {
            this.f58051l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (!TextUtils.equals(str, this.f58051l1)) {
                    return;
                }
                boolean z11 = false;
                ChatRowLiveLocation.this.f58027c7.setImageInfo(c3979l, false);
                if (c3979l != null && c3979l.m18839c() != null) {
                    ChatRowLiveLocation chatRowLiveLocation = ChatRowLiveLocation.this;
                    chatRowLiveLocation.f58029e7 = true;
                    C13697o c13697o = chatRowLiveLocation.f58028d7;
                    Bitmap m18839c = c3979l.m18839c();
                    if (c23995f.m125666q() != 4) {
                        z11 = true;
                    }
                    c13697o.m76480u(m18839c, z11);
                    ChatRowLiveLocation.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowLiveLocation$b */
    /* loaded from: classes5.dex */
    public class C11370b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f58053a;

        /* renamed from: b */
        final /* synthetic */ String f58054b;

        /* renamed from: c */
        final /* synthetic */ Bitmap f58055c;

        C11370b(C17945a0 c17945a0, String str, Bitmap bitmap) {
            this.f58053a = c17945a0;
            this.f58054b = str;
            this.f58055c = bitmap;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
                AbstractC23041d2.m118208g(this.f58053a.m94983Q3());
                fileOutputStream = new FileOutputStream(this.f58054b);
            } catch (Exception e12) {
                fileOutputStream = null;
                e11 = e12;
            } catch (Throwable th3) {
                fileOutputStream = null;
                th2 = th3;
                if (fileOutputStream != null) {
                }
                if (!ChatRowLiveLocation.this.f57263B.equals(this.f58053a)) {
                }
            }
            try {
                try {
                    this.f58055c.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    this.f58053a.m94934Ka(this.f58054b);
                    C7956b.m41474B().m41569z0(this.f58053a, this.f58054b);
                    try {
                        fileOutputStream.close();
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                    if (!ChatRowLiveLocation.this.f57263B.equals(this.f58053a)) {
                        return;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e14) {
                            e14.printStackTrace();
                        }
                    }
                    if (!ChatRowLiveLocation.this.f57263B.equals(this.f58053a)) {
                        ChatRowLiveLocation.this.f58030f7 = false;
                        throw th2;
                    }
                    throw th2;
                }
            } catch (Exception e15) {
                e11 = e15;
                e11.printStackTrace();
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e16) {
                        e16.printStackTrace();
                    }
                }
                if (!ChatRowLiveLocation.this.f57263B.equals(this.f58053a)) {
                    return;
                }
                ChatRowLiveLocation.this.f58030f7 = false;
            }
            ChatRowLiveLocation.this.f58030f7 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowLiveLocation$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC11371c {
        /* renamed from: a */
        void mo61452a(C17945a0 c17945a0);
    }

    public ChatRowLiveLocation(Context context) {
        super(context);
        this.f58020V6 = 0.5625f;
        this.f58021W6 = AbstractC23136l9.m118742r(0.5f);
        this.f58022X6 = 0.4f;
        this.f58023Y6 = 0.725f;
        this.f58024Z6 = AbstractC23136l9.m118742r(8.0f);
        this.f58025a7 = AbstractC23136l9.m118742r(3.0f);
        this.f58027c7 = new C3977j(getContext());
        this.f58029e7 = false;
        this.f58030f7 = false;
        this.f58031g7 = "";
        this.f58032h7 = "";
        this.f58050z7 = 0;
        if (TextUtils.isEmpty(f58012F7)) {
            f58012F7 = AbstractC20130d.m104907z(context);
        }
        if (!f58010D7 || f58011E7) {
            Paint paint = new Paint(1);
            f58014H7 = paint;
            paint.setColor(-2016988);
            Paint paint2 = new Paint(1);
            f58013G7 = paint2;
            paint2.setColor(1728053247);
            C13704p1 c13704p1 = new C13704p1(1);
            f58015I7 = c13704p1;
            c13704p1.m76613c();
            f58015I7.setColor(AbstractC11531v0.m62226Z2());
            f58015I7.setTextSize(AbstractC23136l9.m118742r(14.0f));
            C13704p1 c13704p12 = new C13704p1(1);
            f58016J7 = c13704p12;
            c13704p12.setTypeface(Typeface.DEFAULT);
            f58016J7.setColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            f58016J7.setTextSize(AbstractC23136l9.m118742r(14.0f));
            f58010D7 = true;
            f58011E7 = false;
        }
        C13697o c13697o = new C13697o(this);
        this.f58028d7 = c13697o;
        c13697o.m76485z(AbstractC11531v0.m62225Z1());
        this.f58028d7.m76458F(true, false);
        this.f58028d7.m76461I(ChatRow.f57185D5);
    }

    /* renamed from: V3 */
    private void m61448V3() {
        try {
            C17996r0 c17996r0 = (C17996r0) this.f57263B.m94929K2();
            if (!c17996r0.f91151F && C23793c.m124316k().mo124310e() >= c17996r0.f91153H) {
                C8967m.m47867E().m47918h0(c17996r0.f91147B, this.f57263B.mo95039W2(), this.f57263B.m95029V3(), c17996r0.f91154I, c17996r0.f91150E, c17996r0.f91149D);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.chat.chatrow.i0.<init>(com.zing.zalo.ui.chat.chatrow.ChatRowLiveLocation, dj.a0, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: W3 */
    private void m61449W3() {
        /*
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LiveLocation_"
            r1.append(r2)
            dj.a0 r2 = r0.f57263B
            com.zing.zalo.data.entity.chat.message.MessageId r2 = r2.m95029V3()
            java.lang.String r2 = r2.m41044h()
            r1.append(r2)
            boolean r2 = r0.f58047w7
            r1.append(r2)
            dj.r0 r2 = r0.f58026b7
            double r2 = r2.f91150E
            r1.append(r2)
            dj.r0 r2 = r0.f58026b7
            double r2 = r2.f91149D
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = mm0.AbstractC23352g.m122788d(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.zing.zalo.p077ui.chat.chatrow.ChatRowLiveLocation.f58012F7
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            dj.a0 r2 = r0.f57263B
            java.lang.String r2 = r2.m94983Q3()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L57
            boolean r2 = me0.AbstractC23041d2.m118194A(r1)
            if (r2 != 0) goto L9c
        L57:
            boolean r2 = r0.f58030f7
            if (r2 != 0) goto L9c
            r2 = 1
            r0.f58030f7 = r2
            dj.a0 r2 = r0.f57263B
            android.content.Context r3 = r17.getContext()
            int r7 = com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0.m62210V2(r3)
            com.zing.zalo.location.v r3 = com.zing.zalo.location.C8976v.m47987h()
            com.zing.zalo.location.w r15 = new com.zing.zalo.location.w
            dj.a0 r4 = r0.f57263B
            com.zing.zalo.data.entity.chat.message.MessageId r4 = r4.m95029V3()
            long r5 = r4.m41045i()
            int r4 = r7 * 9
            float r4 = (float) r4
            r8 = 1098907648(0x41800000, float:16.0)
            float r4 = r4 / r8
            int r8 = (int) r4
            dj.r0 r4 = r0.f58026b7
            double r9 = r4.f91150E
            double r11 = r4.f91149D
            r13 = 1097859072(0x41700000, float:15.0)
            boolean r4 = r4.f91151F
            com.zing.zalo.ui.chat.chatrow.i0 r14 = new com.zing.zalo.ui.chat.chatrow.i0
            r14.<init>()
            r1 = r4
            r4 = r15
            r16 = r14
            r2 = 0
            r14 = r2
            r2 = r15
            r15 = r1
            r4.<init>(r5, r7, r8, r9, r11, r13, r14, r15, r16)
            r3.m48000g(r2)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.chat.chatrow.ChatRowLiveLocation.m61449W3():void");
    }

    /* renamed from: X3 */
    public /* synthetic */ void m61450X3(C17945a0 c17945a0, String str, Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (this.f57263B == c17945a0 && isShown()) {
                    C23999j.m125686E1(new C3979l(bitmap, EnumC25629a.DEFAULT), str, C23278z2.m120068F());
                    this.f58028d7.m76480u(bitmap, true);
                    this.f58029e7 = true;
                    invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C0824j.m2153b(new C11370b(c17945a0, str, bitmap));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int m76472k = this.f58028d7.m76472k();
        int i13 = this.f58034j7;
        if (i13 > 0) {
            m76472k += ChatRow.f57201L5 + i13;
        }
        int i14 = this.f58036l7;
        if (i14 > 0) {
            m76472k += ChatRow.f57201L5 + i14;
        }
        c28227x3.f131649b = m76472k;
        c28227x3.f131648a = this.f58028d7.m76473l();
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        int i11;
        super.mo60953C3(c17945a0, c28769a, z11);
        if (c17945a0.m94929K2() instanceof C17996r0) {
            C17996r0 c17996r0 = (C17996r0) c17945a0.m94929K2();
            this.f58026b7 = c17996r0;
            this.f57471k1 = true;
            boolean z12 = c17996r0.f91151F;
            this.f58047w7 = z12;
            this.f58048x7 = c17996r0.f91150E;
            this.f58049y7 = c17996r0.f91149D;
            if (z12) {
                i11 = AbstractC8020f0.str_live_location_bubble_my_ended_title_v2;
            } else {
                i11 = AbstractC8020f0.str_live_location_bubble_my_title_v2;
            }
            this.f58031g7 = AbstractC23136l9.m118743r0(i11);
            if (this.f58047w7) {
                long j11 = this.f58026b7.f91154I;
                if (j11 > 0) {
                    this.f58032h7 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_live_location_bubble_someone_ended_title_with_time, AbstractC23160o0.m119192F0(j11));
                } else {
                    this.f58032h7 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_live_location_bubble_someone_ended_title_v2);
                }
            } else if (c17945a0.m95032V6()) {
                this.f58032h7 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_live_location_bubble_desc_mine, AbstractC23160o0.m119192F0(this.f58026b7.f91153H));
            } else {
                int mo124310e = (int) (((C23793c.m124316k().mo124310e() - this.f58026b7.f91154I) / 1000) / 60);
                this.f58050z7 = mo124310e;
                if (mo124310e == 0) {
                    this.f58032h7 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_live_location_bubble_just_now);
                } else {
                    this.f58032h7 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_live_location_bubble_desc_last_update, Integer.valueOf(mo124310e));
                }
            }
        }
        if (z11) {
            this.f58028d7.m76477r();
            this.f58030f7 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        int i12;
        super.mo60975I3(c17945a0, c28769a, i11);
        this.f58028d7.m76462J(0, i11 - (this.f58021W6 * 2));
        this.f58028d7.m76481v(i11 - (this.f58021W6 * 2), (int) ((i11 - (r5 * 2)) * 0.5625f));
        int m76472k = (int) (this.f58028d7.m76472k() * 0.4f);
        this.f58041q7 = m76472k;
        this.f58044t7 = (int) (m76472k * 0.725f);
        int bubblePaddingLeft = (i11 - getBubblePaddingLeft()) - getBubblePaddingRight();
        if (!TextUtils.isEmpty(this.f58031g7)) {
            if (this.f58026b7.f91151F) {
                i12 = bubblePaddingLeft;
            } else {
                i12 = (bubblePaddingLeft - this.f58024Z6) - this.f58025a7;
            }
            StaticLayout m119625l = AbstractC23214t.m119625l(this.f58031g7, f58015I7, i12, 1);
            this.f58033i7 = m119625l;
            this.f58034j7 = m119625l.getHeight();
        }
        if (!TextUtils.isEmpty(this.f58032h7)) {
            StaticLayout m119625l2 = AbstractC23214t.m119625l(this.f58032h7, f58016J7, bubblePaddingLeft, 2);
            this.f58035k7 = m119625l2;
            this.f58036l7 = m119625l2.getHeight();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L2 */
    public boolean mo60987L2() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N2 */
    protected void mo60995N2() {
        InterfaceC11371c interfaceC11371c = this.f58019C7;
        if (interfaceC11371c != null) {
            interfaceC11371c.mo61452a(this.f57263B);
        }
        ActionLogChatLocation.f55164a.m56650d(this.f57263B);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        if (!this.f58029e7) {
            m61451Y3();
        }
        C8967m.m47867E().m47929o(c17945a0);
        m61448V3();
    }

    /* renamed from: Y3 */
    void m61451Y3() {
        try {
            if (this.f58026b7 == null) {
                return;
            }
            m61449W3();
            String m94983Q3 = this.f57263B.m94983Q3();
            C24003n m120068F = C23278z2.m120068F();
            if (!m60988L3() && !C23999j.m125696L2(m94983Q3, m120068F)) {
                return;
            }
            ((C23528a) this.f57275D.m123612r(this.f58027c7)).m123579C(m94983Q3, m120068F, new C11369a(m94983Q3));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        if (super.mo61046c0(c17945a0, c28769a)) {
            return true;
        }
        C17996r0 c17996r0 = this.f58026b7;
        if (c17996r0 != null) {
            boolean z11 = this.f58047w7;
            if (z11 != c17996r0.f91151F || this.f58048x7 != c17996r0.f91150E || this.f58049y7 != c17996r0.f91149D) {
                return true;
            }
            if (!z11 && !c17945a0.m95032V6()) {
                if (this.f58050z7 != ((int) (((C23793c.m124316k().mo124310e() - this.f58026b7.f91154I) / 1000) / 60))) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        C13697o c13697o = this.f58028d7;
        int i16 = this.f58021W6;
        c13697o.m76460H(i11 + i16, i16 + i12);
        this.f58042r7 = this.f58028d7.m76469h() + ((this.f58028d7.m76473l() - this.f58041q7) / 2);
        int m76471j = ((this.f58028d7.m76471j() + (this.f58028d7.m76472k() / 2)) - this.f58041q7) + AbstractC23136l9.m118742r(4.0f);
        this.f58043s7 = m76471j;
        int i17 = this.f58042r7;
        int i18 = this.f58041q7;
        this.f58045u7 = i17 + ((i18 - this.f58044t7) / 2);
        this.f58046v7 = (int) (m76471j + (i18 * 0.0925f));
        int m76472k = i12 + this.f58028d7.m76472k() + (this.f58021W6 * 2) + ChatRow.f57201L5;
        if (!this.f58047w7) {
            this.f58017A7 = getBubblePaddingLeft() + i11 + (this.f58024Z6 / 2);
            this.f58018B7 = (this.f58034j7 / 2) + m76472k;
        }
        int bubblePaddingLeft = getBubblePaddingLeft() + i11;
        if (this.f58047w7) {
            i15 = 0;
        } else {
            i15 = this.f58024Z6 + this.f58025a7;
        }
        this.f58037m7 = bubblePaddingLeft + i15;
        this.f58038n7 = m76472k;
        int i19 = m76472k + this.f58034j7;
        this.f58039o7 = i11 + getBubblePaddingLeft();
        this.f58040p7 = i19;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        String str = "";
        try {
            if (this.f58033i7 != null) {
                str = "" + ((Object) this.f58033i7.getText()) + "\n";
            }
            if (this.f58035k7 != null) {
                return str + ((Object) this.f58035k7.getText()) + "\n";
            }
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public void setLiveLocationDelegate(InterfaceC11371c interfaceC11371c) {
        this.f58019C7 = interfaceC11371c;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        this.f58028d7.m76467d(canvas);
        Drawable m62202T2 = AbstractC11531v0.m62202T2();
        if (m62202T2 != null) {
            int i11 = this.f58042r7;
            int i12 = this.f58043s7;
            int i13 = this.f58041q7;
            m62202T2.setBounds(i11, i12, i11 + i13, i13 + i12);
            m62202T2.draw(canvas);
        }
        Drawable drawable = this.f57372T0;
        if (drawable != null) {
            int i14 = this.f58045u7;
            int i15 = this.f58046v7;
            int i16 = this.f58044t7;
            drawable.setBounds(i14, i15, i14 + i16, i16 + i15);
            this.f57372T0.draw(canvas);
            if (this.f58047w7) {
                float f11 = this.f58045u7;
                int i17 = this.f58044t7;
                canvas.drawCircle(f11 + (i17 / 2.0f), this.f58046v7 + (i17 / 2.0f), i17 / 2.0f, f58013G7);
            }
        }
        if (!this.f58047w7) {
            canvas.drawCircle(this.f58017A7, this.f58018B7, this.f58024Z6 / 2.0f, f58014H7);
        }
        if (this.f58033i7 != null) {
            canvas.save();
            canvas.translate(this.f58037m7, this.f58038n7);
            this.f58033i7.draw(canvas);
            canvas.restore();
        }
        if (this.f58035k7 != null) {
            canvas.save();
            canvas.translate(this.f58039o7, this.f58040p7);
            this.f58035k7.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f57471k1 = false;
        this.f58031g7 = "";
        this.f58033i7 = null;
        this.f58032h7 = "";
        this.f58035k7 = null;
        this.f58026b7 = null;
        this.f58029e7 = false;
        this.f58047w7 = false;
        this.f58049y7 = 0.0d;
        this.f58048x7 = 0.0d;
        this.f58037m7 = -1;
        this.f58038n7 = -1;
        this.f58039o7 = -1;
        this.f58040p7 = -1;
        this.f58017A7 = -1;
        this.f58018B7 = -1;
        this.f58042r7 = -1;
        this.f58043s7 = -1;
        this.f58045u7 = -1;
        this.f58046v7 = -1;
        this.f58034j7 = 0;
        this.f58036l7 = 0;
    }
}
