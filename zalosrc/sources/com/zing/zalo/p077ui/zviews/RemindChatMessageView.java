package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import am.AbstractC0924m0;
import am.C0943w;
import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b40.C2526d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.datetimepicker.DateTimePickerLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.SuggestionTimeSpan;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import ed0.AbstractC18391a;
import ge.C19411c;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.AbstractC23143m5;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import org.json.JSONObject;
import p056cj.C3535c;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p588vw.C28652r;
import p716zh.C31973j5;
import p716zh.C31997l;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class RemindChatMessageView extends ZaloView implements View.OnClickListener, ZaloView.InterfaceC17421f, C23744a.c, InterfaceC0733x {

    /* renamed from: A0 */
    TextView f76896A0;

    /* renamed from: B0 */
    ProgressBar f76897B0;

    /* renamed from: C0 */
    CustomEditText f76898C0;

    /* renamed from: D0 */
    RobotoTextView f76899D0;

    /* renamed from: E0 */
    DateTimePickerLayout f76900E0;

    /* renamed from: F0 */
    TextView f76901F0;

    /* renamed from: G0 */
    View f76902G0;

    /* renamed from: H0 */
    ImageView f76903H0;

    /* renamed from: I0 */
    RobotoTextView f76904I0;

    /* renamed from: J0 */
    ImageView f76905J0;

    /* renamed from: K0 */
    RobotoTextView f76906K0;

    /* renamed from: L0 */
    RobotoTextView f76907L0;

    /* renamed from: M0 */
    View f76908M0;

    /* renamed from: N0 */
    C17945a0 f76909N0;

    /* renamed from: Q0 */
    String f76912Q0;

    /* renamed from: w0 */
    View f76921w0;

    /* renamed from: x0 */
    KeyboardAwareRelativeLayout f76922x0;

    /* renamed from: y0 */
    LinearLayout f76923y0;

    /* renamed from: z0 */
    TextView f76924z0;

    /* renamed from: O0 */
    boolean f76910O0 = false;

    /* renamed from: P0 */
    boolean f76911P0 = false;

    /* renamed from: R0 */
    int f76913R0 = -1;

    /* renamed from: S0 */
    boolean f76914S0 = false;

    /* renamed from: T0 */
    int f76915T0 = 0;

    /* renamed from: U0 */
    String f76916U0 = "";

    /* renamed from: V0 */
    String f76917V0 = "0";

    /* renamed from: W0 */
    long f76918W0 = Long.MIN_VALUE;

    /* renamed from: X0 */
    private boolean f76919X0 = false;

    /* renamed from: Y0 */
    long f76920Y0 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RemindChatMessageView$a */
    /* loaded from: classes6.dex */
    public class C14930a extends AbstractC18391a {
        C14930a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            RemindChatMessageView remindChatMessageView = RemindChatMessageView.this;
            if (remindChatMessageView.f76914S0) {
                remindChatMessageView.f76914S0 = false;
                remindChatMessageView.f76898C0.setText(editable.toString());
                RemindChatMessageView.this.f76898C0.setSelection(editable.toString().length());
            } else if (editable.length() > 3000) {
                ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_max_chars_input), 3000));
                RemindChatMessageView.this.f76898C0.setText(editable.toString().substring(0, 3000));
                RemindChatMessageView.this.f76898C0.setSelection(3000);
            } else {
                C28652r.m143349v().m143361W(editable);
                RemindChatMessageView.this.m83584dL();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RemindChatMessageView$b */
    /* loaded from: classes6.dex */
    public class C14931b implements InterfaceC20094a {
        C14931b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            RemindChatMessageView.this.m83583cL(false, false);
            if (c20096c != null) {
                String m104492d = c20096c.m104492d();
                if (!TextUtils.isEmpty(m104492d)) {
                    ToastUtils.showMess(m104492d);
                }
            }
            RemindChatMessageView.this.f76919X0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            RemindChatMessageView.this.m83583cL(false, false);
            RemindChatMessageView.this.f76919X0 = false;
            RemindChatMessageView.this.f88762c0.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RemindChatMessageView$c */
    /* loaded from: classes6.dex */
    public class C14932c implements InterfaceC20094a {
        C14932c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            RemindChatMessageView.this.m83583cL(false, true);
            if (c20096c != null) {
                try {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            RemindChatMessageView.this.f76919X0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            RemindChatMessageView.this.m83583cL(false, true);
            RemindChatMessageView.this.f76919X0 = false;
            RemindChatMessageView.this.f88762c0.finish();
        }
    }

    /* renamed from: MK */
    private void m83566MK() {
        C17945a0 c17945a0 = this.f76909N0;
        if (c17945a0 != null && !AbstractC25495a.m132078c(c17945a0.mo95039W2())) {
            int m3244M4 = AbstractC0924m0.m3244M4();
            this.f76915T0 = m3244M4;
            m83576ZK(m3244M4);
        }
    }

    /* renamed from: NK */
    private void m83567NK(long j11) {
        String str;
        String str2;
        String m95019U3;
        String str3;
        String str4;
        boolean z11;
        if (this.f76919X0) {
            return;
        }
        this.f76919X0 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14931b());
        String m94862C4 = this.f76909N0.m94862C4();
        if (CoreUtility.f89233i.equals(m94862C4)) {
            str = this.f76909N0.mo95039W2();
        } else {
            str = CoreUtility.f89233i;
        }
        String str5 = str;
        if (CoreUtility.f89233i.equals(m94862C4)) {
            str2 = str5;
        } else {
            str2 = m94862C4;
        }
        if (this.f76914S0) {
            m95019U3 = m83578bL(this.f76909N0.m95019U3());
        } else {
            CustomEditText customEditText = this.f76898C0;
            if (customEditText != null && customEditText.getText() != null) {
                m95019U3 = this.f76898C0.getText().toString();
            } else {
                m95019U3 = this.f76909N0.m95019U3();
            }
        }
        String m83578bL = m83578bL(m95019U3);
        C19411c.a aVar = new C19411c.a();
        C28203u6 c28203u6 = C28203u6.f131407a;
        ContactProfile m141809c = c28203u6.m141809c(str5);
        String str6 = "";
        if (m141809c == null) {
            str3 = "";
        } else {
            str3 = m141809c.mo2475c();
        }
        ContactProfile m141809c2 = c28203u6.m141809c(m94862C4);
        if (m141809c2 == null) {
            str4 = "";
        } else {
            str4 = m141809c2.mo2475c();
        }
        aVar.f96289c = new C19411c.a.e(this.f76909N0.m95029V3(), str4, m94862C4, str3, str5, 1, null);
        if (this.f76915T0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f96293g = z11;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C31997l(0, 3));
        arrayList.add(new C31997l(1, new Object[]{str2}));
        arrayList.add(new C31997l(3, new Object[]{m83578bL, ""}));
        arrayList.add(new C31997l(2, aVar.m101534a()));
        arrayList.add(new C31997l(6, new Object[]{0, Long.valueOf(j11), Long.valueOf(j11), 0}));
        arrayList.add(new C31997l(7, 1));
        arrayList.add(new C31997l(8, 1));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startTime", j11);
            int i11 = this.f76913R0;
            if (i11 != -1) {
                jSONObject.put("srcType", i11);
            }
            str6 = jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        c0766k.mo1388A7(arrayList, str6);
    }

    /* renamed from: OK */
    private void m83568OK(String str, long j11) {
        String str2;
        C7907e c7907e;
        boolean z11;
        String m95019U3;
        if (this.f76919X0) {
            return;
        }
        this.f76919X0 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14932c());
        C31973j5 m4472f = C0943w.m4462l().m4472f(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C31997l(0, 5));
        C19411c.a aVar = new C19411c.a();
        aVar.f96288b = new C19411c.a.c(str, m4472f.m153793y());
        String m94862C4 = this.f76909N0.m94862C4();
        ContactProfile m141809c = C28203u6.f131407a.m141809c(m94862C4);
        String str3 = "";
        if (m141809c == null) {
            str2 = "";
        } else {
            str2 = m141809c.mo2475c();
        }
        MessageId m95029V3 = this.f76909N0.m95029V3();
        if (this.f76914S0) {
            c7907e = this.f76909N0.m95011T3();
        } else {
            c7907e = null;
        }
        aVar.f96289c = new C19411c.a.e(m95029V3, str2, m94862C4, "", "", 2, c7907e);
        if (this.f76915T0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f96293g = z11;
        if (this.f76914S0) {
            m95019U3 = this.f76909N0.m95019U3();
        } else {
            CustomEditText customEditText = this.f76898C0;
            if (customEditText != null && customEditText.getText() != null) {
                m95019U3 = this.f76898C0.getText().toString();
            } else {
                m95019U3 = this.f76909N0.m95019U3();
            }
        }
        arrayList.add(new C31997l(2, aVar.m101534a()));
        arrayList.add(new C31997l(3, new Object[]{m83578bL(m95019U3), null}));
        C19411c.b bVar = new C19411c.b();
        bVar.f96314a = "⏰";
        arrayList.add(new C31997l(9, bVar.m101542a()));
        arrayList.add(new C31997l(6, new Object[]{0, Long.valueOf(j11), Long.valueOf(j11), 0}));
        arrayList.add(new C31997l(7, 1));
        arrayList.add(new C31997l(8, 2));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startTime", j11);
            int i11 = this.f76913R0;
            if (i11 != -1) {
                jSONObject.put("srcType", i11);
            }
            str3 = jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        c0766k.mo1388A7(arrayList, str3);
    }

    /* renamed from: QK */
    private void m83569QK() {
        int i11;
        try {
            this.f76922x0 = (KeyboardAwareRelativeLayout) this.f76921w0.findViewById(AbstractC6918a0.container_view);
            if (this.f88762c0.m92676n2() instanceof Activity) {
                this.f88762c0.m92676n2().mo35554O(18);
                this.f76922x0.setEnableMeasureKeyboard(false);
            }
            this.f76922x0.setOnClickListener(this);
            LinearLayout linearLayout = (LinearLayout) this.f76921w0.findViewById(AbstractC6918a0.content_view);
            this.f76923y0 = linearLayout;
            ((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AbstractC23136l9.m118737p0();
            RobotoTextView robotoTextView = (RobotoTextView) this.f76921w0.findViewById(AbstractC6918a0.header_title);
            this.f76907L0 = robotoTextView;
            robotoTextView.setText(AbstractC8020f0.str_create_new_reminder);
            View findViewById = this.f76921w0.findViewById(AbstractC6918a0.btn_close);
            this.f76908M0 = findViewById;
            findViewById.setOnClickListener(this);
            TextView textView = (TextView) this.f76921w0.findViewById(AbstractC6918a0.btn_remind_setting_more);
            this.f76924z0 = textView;
            textView.setOnClickListener(this);
            TextView textView2 = (TextView) this.f76921w0.findViewById(AbstractC6918a0.btn_remind_chat_msg);
            this.f76896A0 = textView2;
            textView2.setOnClickListener(this);
            this.f76896A0.setText(AbstractC8020f0.str_btn_remind_pin_msg);
            ProgressBar progressBar = (ProgressBar) this.f76921w0.findViewById(AbstractC6918a0.progress_bar);
            this.f76897B0 = progressBar;
            progressBar.setVisibility(8);
            CustomEditText customEditText = (CustomEditText) this.f76921w0.findViewById(AbstractC6918a0.et_remind_title);
            this.f76898C0 = customEditText;
            customEditText.setText(m83575XK());
            this.f76898C0.addTextChangedListener(new C14930a());
            this.f76901F0 = (TextView) this.f76921w0.findViewById(AbstractC6918a0.notify_label);
            this.f76902G0 = this.f76921w0.findViewById(AbstractC6918a0.notify_container);
            ImageView imageView = (ImageView) this.f76921w0.findViewById(AbstractC6918a0.cb_noti_for_only_me);
            this.f76903H0 = imageView;
            imageView.setOnClickListener(this);
            RobotoTextView robotoTextView2 = (RobotoTextView) this.f76921w0.findViewById(AbstractC6918a0.tv_noti_for_only_me);
            this.f76904I0 = robotoTextView2;
            robotoTextView2.setOnClickListener(this);
            ImageView imageView2 = (ImageView) this.f76921w0.findViewById(AbstractC6918a0.cb_noti_for_group);
            this.f76905J0 = imageView2;
            imageView2.setOnClickListener(this);
            RobotoTextView robotoTextView3 = (RobotoTextView) this.f76921w0.findViewById(AbstractC6918a0.tv_noti_for_group);
            this.f76906K0 = robotoTextView3;
            if (this.f76910O0) {
                i11 = AbstractC8020f0.str_reminder_notify_for_group;
            } else {
                i11 = AbstractC8020f0.str_reminder_notify_for_both;
            }
            robotoTextView3.setText(AbstractC23136l9.m118743r0(i11));
            this.f76906K0.setOnClickListener(this);
            this.f76899D0 = (RobotoTextView) this.f76921w0.findViewById(AbstractC6918a0.date_time_text);
            m83580PK();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RK */
    private void m83570RK() {
        if (!TextUtils.isEmpty(this.f76912Q0)) {
            this.f76920Y0 = AbstractC23143m5.m118816d(this.f76912Q0).f54805u;
            return;
        }
        ArrayList m118814b = AbstractC23143m5.m118814b(this.f76909N0.m95019U3());
        if (m118814b.size() > 0) {
            this.f76920Y0 = ((SuggestionTimeSpan) m118814b.get(0)).f54805u;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TK */
    public /* synthetic */ void m83571TK(long j11) {
        this.f76918W0 = j11;
        m83579eL(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UK */
    public /* synthetic */ void m83572UK(boolean z11) {
        int width = this.f76896A0.getWidth();
        if (z11) {
            this.f76896A0.setEnabled(false);
            this.f76896A0.setText((CharSequence) null);
            this.f76897B0.setVisibility(0);
        } else {
            this.f76896A0.setEnabled(true);
            this.f76896A0.setText(AbstractC8020f0.str_btn_remind_pin_msg);
            this.f76897B0.setVisibility(8);
        }
        this.f76896A0.getLayoutParams().width = width;
        this.f76896A0.requestLayout();
    }

    /* renamed from: VK */
    public static RemindChatMessageView m83573VK(C17945a0 c17945a0, int i11, boolean z11, boolean z12, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_MESSAGE_ID", c17945a0.m95029V3());
        bundle.putString("EXTRA_MESSAGE_OWNER", c17945a0.mo95039W2());
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", i11);
        bundle.putBoolean("EXTRA_MSG_IS_GROUP", z11);
        bundle.putBoolean("EXTRA_MSG_IS_START_REMINDER_WITH_TIME_PICKER", z12);
        bundle.putString("EXTRA_MSG_STRING_TIME_SUGGESTION", str);
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        bundle.putString("STR_LOG_CHAT_TYPE", str3);
        RemindChatMessageView remindChatMessageView = new RemindChatMessageView();
        remindChatMessageView.mo60305zK(bundle);
        return remindChatMessageView;
    }

    /* renamed from: WK */
    private void m83574WK() {
        Conversation conversation;
        String m95019U3;
        String str;
        String str2;
        C3535c m2634q = AbstractC23306f.m120584H0().m2634q(this.f76909N0.mo95039W2());
        C7907e c7907e = null;
        if (m2634q != null) {
            conversation = m2634q.m17971y0();
        } else {
            conversation = null;
        }
        if (conversation == null) {
            return;
        }
        Bundle bundle = new Bundle();
        if (this.f76914S0) {
            m95019U3 = this.f76909N0.m95019U3();
        } else {
            CustomEditText customEditText = this.f76898C0;
            if (customEditText != null && customEditText.getText() != null) {
                m95019U3 = this.f76898C0.getText().toString();
            } else {
                m95019U3 = this.f76909N0.m95019U3();
            }
        }
        m83578bL(m95019U3);
        bundle.putString("EXTRA_POST_CONTENT", m95019U3);
        bundle.putLong("EXTRA_START_TIME", this.f76918W0);
        bundle.putInt("INT_EXTRA_TRACKING_SOURCE", this.f76913R0);
        bundle.putInt("BOL_EXTRA_EVENT_ONLY_ME", this.f76915T0);
        String str3 = "";
        if (conversation.m41013q()) {
            C31973j5 m41001e = conversation.m41001e(true);
            if (m41001e != null) {
                bundle.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 2);
                bundle.putString("extra_group_id", m41001e.m153781r());
                String m94862C4 = this.f76909N0.m94862C4();
                if (C28203u6.f131407a.m141809c(m94862C4) != null) {
                    str3 = conversation.f42894r;
                }
                String str4 = str3;
                C19411c.a aVar = new C19411c.a();
                MessageId m95029V3 = this.f76909N0.m95029V3();
                if (this.f76914S0) {
                    c7907e = this.f76909N0.m95011T3();
                }
                C19411c.a.e eVar = new C19411c.a.e(m95029V3, str4, m94862C4, "", "", 2, c7907e);
                aVar.f96289c = eVar;
                bundle.putString("STR_EXTRA_EVENT_MSG_INFO", eVar.m101541a().toString());
            }
        } else {
            bundle.putInt("INT_EXTRA_MODE_REMINDER_COMPOSE", 1);
            String m94862C42 = this.f76909N0.m94862C4();
            if (CoreUtility.f89233i.equals(m94862C42)) {
                str = this.f76909N0.mo95039W2();
            } else {
                str = CoreUtility.f89233i;
            }
            String str5 = str;
            bundle.putString("STR_EXTRA_CONTACT_UID", this.f76909N0.mo95039W2());
            bundle.putString("STR_EXTRA_CONTACT_NAME", this.f76909N0.mo17217c());
            C19411c.a aVar2 = new C19411c.a();
            C28203u6 c28203u6 = C28203u6.f131407a;
            if (c28203u6.m141809c(str5) == null) {
                str2 = "";
            } else {
                str2 = conversation.f42894r;
            }
            if (c28203u6.m141809c(m94862C42) != null) {
                str3 = conversation.f42894r;
            }
            C19411c.a.e eVar2 = new C19411c.a.e(this.f76909N0.m95029V3(), str3, m94862C42, str2, str5, 1, null);
            aVar2.f96289c = eVar2;
            bundle.putString("STR_EXTRA_EVENT_MSG_INFO", eVar2.m101541a().toString());
        }
        m92662fJ().m93066i2(GroupReminderComposeView.class, bundle, 0, 1, true);
    }

    /* renamed from: XK */
    private SpannableStringBuilder m83575XK() {
        String m95019U3 = this.f76909N0.m95019U3();
        m83578bL(m95019U3);
        return new SpannableStringBuilder(C28652r.m143349v().m143357H(m95019U3));
    }

    /* renamed from: ZK */
    private void m83576ZK(int i11) {
        this.f76915T0 = i11;
        m83584dL();
        C17945a0 c17945a0 = this.f76909N0;
        if (c17945a0 != null && !AbstractC25495a.m132078c(c17945a0.mo95039W2())) {
            int i12 = this.f76915T0;
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                m83577aL(false);
            } else {
                m83577aL(true);
            }
        } else {
            m83577aL(false);
        }
        int i13 = this.f76915T0;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    this.f76903H0.setImageResource(AbstractC16803z.icn_form_checkbox_round_unchecked);
                    this.f76905J0.setImageResource(AbstractC16803z.ic_icn_form_checkbox_round_checked);
                    return;
                }
                return;
            }
            this.f76903H0.setImageResource(AbstractC16803z.ic_icn_form_checkbox_round_checked);
            this.f76905J0.setImageResource(AbstractC16803z.icn_form_checkbox_round_unchecked);
            return;
        }
        this.f76903H0.setImageResource(AbstractC16803z.icn_form_checkbox_round_unchecked);
        this.f76905J0.setImageResource(AbstractC16803z.icn_form_checkbox_round_unchecked);
    }

    /* renamed from: aL */
    private void m83577aL(boolean z11) {
        if (z11) {
            this.f76902G0.setVisibility(0);
            this.f76901F0.setVisibility(0);
        } else {
            this.f76902G0.setVisibility(8);
            this.f76901F0.setVisibility(8);
        }
    }

    /* renamed from: bL */
    private String m83578bL(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() > 3000) {
            str = str.substring(0, 3000);
        }
        return str.trim();
    }

    /* renamed from: eL */
    private void m83579eL(long j11) {
        RobotoTextView robotoTextView = this.f76899D0;
        if (robotoTextView != null) {
            robotoTextView.setText(AbstractC23160o0.m119219T(j11, true, true, true, true));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f88762c0.m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_MESSAGE_ID")) {
            MessageId messageId = (MessageId) m92642L3.getParcelable("EXTRA_MESSAGE_ID");
            if (messageId == null) {
                this.f88762c0.finish();
                return;
            }
            this.f76910O0 = m92642L3.getBoolean("EXTRA_MSG_IS_GROUP", true);
            this.f76911P0 = m92642L3.getBoolean("EXTRA_MSG_IS_START_REMINDER_WITH_TIME_PICKER", false);
            this.f76912Q0 = m92642L3.getString("EXTRA_MSG_STRING_TIME_SUGGESTION");
            C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
            this.f76909N0 = m2635r;
            if (m2635r == null) {
                this.f88762c0.finish();
                return;
            }
            m83570RK();
            this.f76913R0 = m92642L3.getInt("INT_EXTRA_TRACKING_SOURCE");
            this.f76916U0 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            this.f76917V0 = m92642L3.getString("STR_LOG_CHAT_TYPE", "0");
            return;
        }
        this.f88762c0.finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 5) {
            if (i11 != 6) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f88762c0.m92648SI());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invalid_date_dialog_title)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_hint_choose_time_in_1_year)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
            return aVar.m43152a();
        }
        C8009j.a aVar2 = new C8009j.a(this.f88762c0.m92648SI());
        aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_invalid_date_dialog_title)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_hint_choose_time_in_future)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f76921w0 = layoutInflater.cloneInContext(new ContextThemeWrapper(m92648SI(), R.style.Theme.Holo.Light)).inflate(AbstractC7409c0.remind_chat_message_view, (ViewGroup) null);
        m83569QK();
        C2526d.f10270a.m12709e0(this.f76909N0, -1, this.f76916U0, this.f76917V0);
        return this.f76921w0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 52);
    }

    /* renamed from: PK */
    void m83580PK() {
        if (this.f76900E0 == null) {
            DateTimePickerLayout dateTimePickerLayout = (DateTimePickerLayout) this.f76921w0.findViewById(AbstractC6918a0.date_time_picker_layout);
            this.f76900E0 = dateTimePickerLayout;
            dateTimePickerLayout.setListener(new DateTimePickerLayout.InterfaceC8002a() { // from class: com.zing.zalo.ui.zviews.qb0
                @Override // com.zing.zalo.dialog.datetimepicker.DateTimePickerLayout.InterfaceC8002a
                /* renamed from: a */
                public final void mo43126a(long j11) {
                    RemindChatMessageView.this.m83571TK(j11);
                }
            });
        }
        this.f76900E0.m43124c();
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f76920Y0;
        if (j11 <= currentTimeMillis) {
            j11 = 3600000 + System.currentTimeMillis();
        }
        this.f76900E0.setTime(j11);
    }

    /* renamed from: SK */
    boolean m83581SK(int i11) {
        return i11 != 1;
    }

    /* renamed from: YK */
    void m83582YK(long j11) {
        Conversation conversation;
        long currentTimeMillis = System.currentTimeMillis();
        long j12 = 31536000000L + currentTimeMillis;
        if (j11 < currentTimeMillis) {
            this.f88762c0.showDialog(5);
            return;
        }
        if (j11 > j12) {
            this.f88762c0.showDialog(6);
            return;
        }
        C3535c m2634q = AbstractC23306f.m120584H0().m2634q(this.f76909N0.mo95039W2());
        if (m2634q != null) {
            conversation = m2634q.m17971y0();
        } else {
            conversation = null;
        }
        if (conversation == null) {
            return;
        }
        m83583cL(true, conversation.m41013q());
        if (conversation.m41013q()) {
            C31973j5 m41001e = conversation.m41001e(true);
            if (m41001e != null) {
                m83568OK(m41001e.m153781r(), j11);
                return;
            }
            return;
        }
        m83567NK(j11);
    }

    /* renamed from: cL */
    void m83583cL(final boolean z11, boolean z12) {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.rb0
            @Override // java.lang.Runnable
            public final void run() {
                RemindChatMessageView.this.m83572UK(z11);
            }
        });
    }

    /* renamed from: dL */
    void m83584dL() {
        String str;
        boolean z11;
        CustomEditText customEditText = this.f76898C0;
        if (customEditText != null && customEditText.getText() != null) {
            str = this.f76898C0.getText().toString();
        } else {
            str = "";
        }
        String m83578bL = m83578bL(str);
        TextView textView = this.f76896A0;
        if (m83578bL.length() > 0 && this.f76918W0 > Long.MIN_VALUE && m83581SK(this.f76915T0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "RemindChatMessageView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_remind_setting_more) {
                m83574WK();
                finish();
            } else if (id2 == AbstractC6918a0.btn_remind_chat_msg) {
                m83582YK(this.f76918W0);
            } else {
                if (id2 != AbstractC6918a0.container_view && id2 != AbstractC6918a0.btn_close) {
                    if (id2 != AbstractC6918a0.cb_noti_for_only_me && id2 != AbstractC6918a0.tv_noti_for_only_me) {
                        if (id2 == AbstractC6918a0.cb_noti_for_group || id2 == AbstractC6918a0.tv_noti_for_group) {
                            m83576ZK(3);
                        }
                    }
                    m83576ZK(2);
                }
                finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (this.f76910O0 && AbstractC25495a.m132079d(this.f76909N0.mo95039W2()) && AbstractC23184q2.m119459q(AbstractC25495a.m132088m(this.f76909N0.mo95039W2()), i11, objArr)) {
                finish();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m83566MK();
        m83584dL();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 52);
    }
}
