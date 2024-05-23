package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import am.C0943w;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import au.AbstractC2353j;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.datetimepicker.C8003a;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.EmojiBottomSheetView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ed0.AbstractC18391a;
import ee.C18418z;
import ge.C19411c;
import ge.C19424p;
import ge.C19425q;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p588vw.C28652r;
import p716zh.C31973j5;
import p716zh.C31997l;

/* loaded from: classes6.dex */
public class QuickCreateReminderView extends BaseZaloView implements View.OnClickListener, ZaloView.InterfaceC17421f, InterfaceC0733x {

    /* renamed from: M0 */
    View f76749M0;

    /* renamed from: N0 */
    View f76750N0;

    /* renamed from: O0 */
    View f76751O0;

    /* renamed from: P0 */
    View f76752P0;

    /* renamed from: Q0 */
    TextView f76753Q0;

    /* renamed from: R0 */
    ImageView f76754R0;

    /* renamed from: S0 */
    View f76755S0;

    /* renamed from: T0 */
    ImageView f76756T0;

    /* renamed from: U0 */
    RobotoTextView f76757U0;

    /* renamed from: V0 */
    RobotoTextView f76758V0;

    /* renamed from: W0 */
    RobotoTextView f76759W0;

    /* renamed from: X0 */
    CustomEditText f76760X0;

    /* renamed from: a1 */
    C19425q f76763a1;

    /* renamed from: b1 */
    String f76764b1;

    /* renamed from: c1 */
    String f76765c1;

    /* renamed from: f1 */
    String f76768f1;

    /* renamed from: Y0 */
    int f76761Y0 = 0;

    /* renamed from: Z0 */
    long f76762Z0 = Long.MIN_VALUE;

    /* renamed from: d1 */
    int f76766d1 = 1;

    /* renamed from: e1 */
    int f76767e1 = 1;

    /* renamed from: g1 */
    int f76769g1 = -1;

    /* renamed from: h1 */
    boolean f76770h1 = false;

    /* renamed from: i1 */
    EmojiBottomSheetView f76771i1 = null;

    /* renamed from: j1 */
    boolean f76772j1 = false;

    /* renamed from: k1 */
    Calendar f76773k1 = Calendar.getInstance();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateReminderView$a */
    /* loaded from: classes6.dex */
    public class C14862a extends AbstractC18391a {
        C14862a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (QuickCreateReminderView.this.f76760X0.getText().length() > 3000) {
                ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_max_chars_input), 3000));
                QuickCreateReminderView.this.f76760X0.setText(QuickCreateReminderView.this.f76760X0.getText().toString().substring(0, 3000));
                QuickCreateReminderView.this.f76760X0.setSelection(3000);
            } else {
                QuickCreateReminderView.this.m83344pM();
                C28652r.m143349v().m143361W(editable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateReminderView$b */
    /* loaded from: classes6.dex */
    public class C14863b implements C8003a.b {
        C14863b() {
        }

        @Override // com.zing.zalo.dialog.datetimepicker.C8003a.b
        /* renamed from: a */
        public void mo43146a(Date date, boolean z11) {
            C19424p c19424p;
            long time = date.getTime();
            QuickCreateReminderView quickCreateReminderView = QuickCreateReminderView.this;
            quickCreateReminderView.f76762Z0 = time;
            quickCreateReminderView.m83346rM(time, z11);
            QuickCreateReminderView quickCreateReminderView2 = QuickCreateReminderView.this;
            C19425q c19425q = quickCreateReminderView2.f76763a1;
            if (c19425q != null && (c19424p = c19425q.f96376a) != null) {
                boolean z12 = true;
                if (c19424p.f96375f != 1) {
                    z12 = false;
                }
                if (z11 != z12) {
                    c19424p.f96375f = quickCreateReminderView2.f76761Y0;
                    quickCreateReminderView2.f76764b1 = c19425q.m101573a().toString();
                    QuickCreateReminderView quickCreateReminderView3 = QuickCreateReminderView.this;
                    quickCreateReminderView3.m83345qM(quickCreateReminderView3.f76763a1.f96376a);
                }
            }
            QuickCreateReminderView.this.m83336fM();
            QuickCreateReminderView.this.m83344pM();
            QuickCreateReminderView.this.f76770h1 = false;
        }

        @Override // com.zing.zalo.dialog.datetimepicker.C8003a.b
        /* renamed from: b */
        public void mo43147b() {
            QuickCreateReminderView.this.f76770h1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QuickCreateReminderView$c */
    /* loaded from: classes6.dex */
    public class C14864c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f76776a;

        C14864c(boolean z11) {
            this.f76776a = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                QuickCreateReminderView.this.mo49315c4();
                QuickCreateReminderView.this.f76772j1 = false;
                if (c20096c != null) {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            QuickCreateReminderView.this.mo49315c4();
            QuickCreateReminderView.this.f76772j1 = false;
            if (this.f76776a) {
                C18418z.m97607b().m97608a(QuickCreateReminderView.this.f76768f1);
            }
            QuickCreateReminderView.this.mo50035CK(-1, null);
            QuickCreateReminderView.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public /* synthetic */ void m83334jM() {
        AbstractC2379w.m12432f(this.f76760X0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public /* synthetic */ void m83335kM(String str) {
        TextView textView = this.f76753Q0;
        if (textView != null) {
            textView.setText(str);
        }
        m83337gM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (m92676n2() != null && m92676n2().getWindow() != null) {
            m92676n2().mo35554O(AbstractC2379w.m12428b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        C8009j c8009j = null;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (i11 != 1) {
            if (i11 == 2) {
                C8009j.a aVar = new C8009j.a(getContext());
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invalid_date_dialog_title)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_hint_choose_time_in_1_year)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
                c8009j = aVar.m43152a();
            }
            return c8009j;
        }
        C8009j.a aVar2 = new C8009j.a(getContext());
        aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invalid_date_dialog_title)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_hint_choose_time_in_future)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
        c8009j = aVar2.m43152a();
        return c8009j;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f76749M0 = layoutInflater.inflate(AbstractC7409c0.quick_create_reminder_layout, (ViewGroup) null);
        m83339iM();
        return this.f76749M0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        AbstractC2379w.m12430d(this.f76760X0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                if (m83340lM()) {
                    return true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return super.mo37491QJ(i11);
    }

    /* renamed from: fM */
    void m83336fM() {
        C19424p c19424p;
        int i11;
        C19425q c19425q = this.f76763a1;
        if (c19425q != null && (c19424p = c19425q.f96376a) != null) {
            long j11 = this.f76762Z0;
            if (j11 > Long.MIN_VALUE && (((i11 = c19424p.f96370a) == 2 || i11 == 3) && this.f76761Y0 == 1)) {
                this.f76773k1.setTimeInMillis(j11);
                int[] m12344g = AbstractC2353j.m12344g(this.f76773k1.get(5), this.f76773k1.get(2) + 1, this.f76773k1.get(1), 7.0d);
                if (m12344g[0] == 30) {
                    this.f76763a1.f96376a.f96372c.clear();
                    this.f76763a1.f96376a.f96373d.clear();
                    this.f76763a1.f96376a.f96372c.add(-1);
                    C19424p c19424p2 = this.f76763a1.f96376a;
                    if (c19424p2.f96370a == 3) {
                        c19424p2.f96373d.add(Integer.valueOf(m12344g[1]));
                    }
                    this.f76764b1 = this.f76763a1.m101573a().toString();
                } else {
                    this.f76763a1.f96376a.f96372c.clear();
                    this.f76763a1.f96376a.f96373d.clear();
                    this.f76764b1 = this.f76763a1.m101573a().toString();
                }
            } else {
                c19424p.f96372c.clear();
                this.f76763a1.f96376a.f96373d.clear();
                this.f76764b1 = this.f76763a1.m101573a().toString();
            }
            m83345qM(this.f76763a1.f96376a);
        }
    }

    /* renamed from: gM */
    void m83337gM() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("EmojiBottomSheetView");
            if (m92996E0 != null) {
                this.f72421L0.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "QuickCreateReminderView";
    }

    /* renamed from: hM */
    C8003a.b m83338hM() {
        return new C14863b();
    }

    /* renamed from: iM */
    void m83339iM() {
        View findViewById = this.f76749M0.findViewById(AbstractC6918a0.keyboard_frame_layout);
        this.f76750N0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f76751O0 = this.f76749M0.findViewById(AbstractC6918a0.layoutPopupRoot);
        ImageView imageView = (ImageView) this.f76749M0.findViewById(AbstractC6918a0.icn_close);
        this.f76754R0 = imageView;
        imageView.setOnClickListener(this);
        View findViewById2 = this.f76749M0.findViewById(AbstractC6918a0.icon_layout);
        this.f76752P0 = findViewById2;
        findViewById2.setOnClickListener(this);
        this.f76753Q0 = (TextView) this.f76749M0.findViewById(AbstractC6918a0.icon_topic);
        View findViewById3 = this.f76749M0.findViewById(AbstractC6918a0.reminder_time_wrapper);
        this.f76755S0 = findViewById3;
        findViewById3.setOnClickListener(this);
        this.f76756T0 = (ImageView) this.f76755S0.findViewById(AbstractC6918a0.reminder_time_icon);
        this.f76757U0 = (RobotoTextView) this.f76755S0.findViewById(AbstractC6918a0.reminder_time_text);
        this.f76758V0 = (RobotoTextView) this.f76755S0.findViewById(AbstractC6918a0.reminder_repeat_hint);
        RobotoTextView robotoTextView = (RobotoTextView) this.f76749M0.findViewById(AbstractC6918a0.btn_done);
        this.f76759W0 = robotoTextView;
        robotoTextView.setOnClickListener(this);
        this.f76759W0.setEnabled(false);
        CustomEditText customEditText = (CustomEditText) this.f76749M0.findViewById(AbstractC6918a0.et_group_topic);
        this.f76760X0 = customEditText;
        customEditText.setForceHideClearBtn(true);
        this.f76760X0.addTextChangedListener(new C14862a());
    }

    /* renamed from: lM */
    boolean m83340lM() {
        AbstractC2379w.m12430d(this.f76760X0);
        return false;
    }

    /* renamed from: mM */
    void m83341mM() {
        if (this.f76772j1) {
            return;
        }
        this.f76772j1 = true;
        if (TextUtils.isEmpty(this.f76768f1)) {
            this.f76772j1 = false;
            finish();
            return;
        }
        mo46829Y();
        boolean z11 = !TextUtils.isEmpty(this.f76765c1);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14864c(z11));
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f76768f1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C31997l(0, 4));
        C19411c.a aVar = new C19411c.a();
        aVar.f96288b = new C19411c.a.c(this.f76768f1, m4472f.m153793y());
        arrayList.add(new C31997l(2, aVar.m101534a()));
        arrayList.add(new C31997l(3, new Object[]{this.f76760X0.getText().toString().trim(), null}));
        C19411c.b bVar = new C19411c.b();
        bVar.f96314a = this.f76753Q0.getText().toString();
        arrayList.add(new C31997l(9, bVar.m101542a()));
        arrayList.add(new C31997l(6, new Object[]{Integer.valueOf(this.f76761Y0), Long.valueOf(this.f76762Z0), Long.valueOf(this.f76762Z0), Integer.valueOf(this.f76767e1)}));
        arrayList.add(new C31997l(7, 1));
        arrayList.add(new C31997l(8, 2));
        arrayList.add(new C31997l(4, this.f76763a1.m101573a()));
        if (!TextUtils.isEmpty(this.f76765c1)) {
            arrayList.add(new C31997l(11, Integer.valueOf(Integer.parseInt(this.f76765c1))));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("srcType", this.f76769g1);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        c0766k.mo1388A7(arrayList, jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nM */
    public void m83342nM() {
        if (this.f76770h1) {
            return;
        }
        boolean z11 = true;
        this.f76770h1 = true;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        long j11 = this.f76762Z0;
        if (j11 <= Long.MIN_VALUE) {
            calendar.setTimeInMillis(currentTimeMillis + 3600000);
            int i11 = calendar.get(12);
            int i12 = i11 % 5;
            if (i12 != 0) {
                int i13 = i11 / 5;
                if (i12 >= 3) {
                    i13++;
                }
                calendar.set(12, i13 * 5);
            }
            calendar.set(13, 0);
            calendar.set(14, 0);
            j11 = calendar.getTimeInMillis();
        }
        C8003a.a m43140d = new C8003a.a(this.f72421L0.m92649TI()).m43142f(m83338hM()).m43138b(new Date(j11)).m43139c(true).m43140d(true);
        if (this.f76761Y0 != 1) {
            z11 = false;
        }
        m43140d.m43140d(z11).m43141e(false).m43137a().m43136j();
    }

    /* renamed from: oM */
    void m83343oM() {
        try {
            m83337gM();
            this.f76771i1 = EmojiBottomSheetView.m79472nL(new EmojiBottomSheetView.InterfaceC14247b() { // from class: com.zing.zalo.ui.zviews.y90
                @Override // com.zing.zalo.p077ui.zviews.EmojiBottomSheetView.InterfaceC14247b
                /* renamed from: c */
                public final void mo79474c(String str) {
                    QuickCreateReminderView.this.m83335kM(str);
                }
            }, AbstractC8020f0.str_emoji_picker_title);
            this.f72421L0.m92649TI().m93060e2(0, this.f76771i1, "EmojiBottomSheetView", 0, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != AbstractC6918a0.icn_close && id2 != AbstractC6918a0.keyboard_frame_layout) {
            if (id2 == AbstractC6918a0.reminder_time_wrapper) {
                m83342nM();
                return;
            } else if (id2 == AbstractC6918a0.btn_done) {
                m83341mM();
                return;
            } else {
                if (id2 == AbstractC6918a0.icon_layout) {
                    m83343oM();
                    return;
                }
                return;
            }
        }
        if (!m83340lM()) {
            finish();
        }
    }

    /* renamed from: pM */
    void m83344pM() {
        boolean z11;
        RobotoTextView robotoTextView = this.f76759W0;
        if (robotoTextView == null) {
            return;
        }
        CustomEditText customEditText = this.f76760X0;
        if (customEditText != null && customEditText.getText().toString().trim().length() > 0 && this.f76762Z0 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        robotoTextView.setEnabled(z11);
    }

    /* renamed from: qM */
    void m83345qM(C19424p c19424p) {
        if (c19424p != null) {
            this.f76758V0.setText(c19424p.m101571c());
        }
    }

    /* renamed from: rM */
    void m83346rM(long j11, boolean z11) {
        if (j11 > Long.MIN_VALUE) {
            RobotoTextView robotoTextView = this.f76757U0;
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            ImageView imageView = this.f76756T0;
            imageView.setImageDrawable(AbstractC23136l9.m118665N(imageView.getContext(), AbstractC16803z.icn_groupboard_reminder_decor_time_n));
            if (z11) {
                this.f76761Y0 = 1;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(this.f76762Z0);
                this.f76757U0.setText(AbstractC23160o0.m119187D(calendar));
                return;
            }
            this.f76761Y0 = 0;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(this.f76762Z0);
            this.f76757U0.setText(AbstractC23160o0.m119193G(calendar2, true, true, true));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        boolean z11;
        boolean z12;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        boolean z13 = true;
        if (m92642L3 != null) {
            this.f76768f1 = m92642L3.getString("extra_group_id");
            this.f76769g1 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE", -1);
            String string = m92642L3.getString("EXTRA_POST_CONTENT", "");
            String string2 = m92642L3.getString("EXTRA_EMOJI", "⏰");
            long j11 = m92642L3.getLong("EXTRA_START_TIME", Long.MIN_VALUE);
            int i11 = m92642L3.getInt("INT_EXTRA_CALENDAR_TYPE", 0);
            String string3 = m92642L3.getString("STR_EXTRA_REPEAT_RULE");
            this.f76767e1 = m92642L3.getInt("INT_EXTRA_ALLDAY", 1);
            if (!TextUtils.isEmpty(string)) {
                this.f76760X0.setText(string);
                this.f76760X0.requestFocus();
                this.f76760X0.setSelection(string.length());
            }
            if (!TextUtils.isEmpty(string2)) {
                this.f76753Q0.setText(string2);
            }
            if (j11 > Long.MIN_VALUE) {
                this.f76762Z0 = j11;
                if (i11 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m83346rM(j11, z12);
            } else {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis() + 3600000);
                if (this.f76767e1 == 1) {
                    AbstractC23160o0.m119301w1(calendar);
                } else {
                    int i12 = calendar.get(12);
                    int i13 = i12 % 5;
                    if (i13 != 0) {
                        int i14 = i12 / 5;
                        if (i13 >= 3) {
                            i14++;
                        }
                        calendar.set(12, i14 * 5);
                    }
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                long timeInMillis = calendar.getTimeInMillis();
                this.f76762Z0 = timeInMillis;
                if (i11 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m83346rM(timeInMillis, z11);
            }
            if (!TextUtils.isEmpty(string3)) {
                this.f76763a1 = new C19425q(string3, i11);
                this.f76764b1 = string3;
                m83336fM();
            } else {
                this.f76763a1 = new C19425q();
            }
            m83345qM(this.f76763a1.f96376a);
            if (m92642L3.getBoolean("BOL_EXTRA_OPEN_TIME_PICKER", false)) {
                mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.z90
                    @Override // java.lang.Runnable
                    public final void run() {
                        QuickCreateReminderView.this.m83342nM();
                    }
                }, 200L);
                z13 = false;
            }
            this.f76765c1 = m92642L3.getString("STR_EXTRA_SUGGESTION_ID");
        }
        m83344pM();
        if (z13) {
            mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.aa0
                @Override // java.lang.Runnable
                public final void run() {
                    QuickCreateReminderView.this.m83334jM();
                }
            }, 200L);
        }
    }
}
