package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.plugin.IVoipServiceRequestCallback;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import dj.C17945a0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.C23212s8;
import org.json.JSONArray;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import zm.voip.service.AbstractC32273e3;

/* loaded from: classes6.dex */
public class RatingCallView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    KeyboardAwareLinearLayout f76832P0;

    /* renamed from: R0 */
    RobotoTextView f76834R0;

    /* renamed from: S0 */
    ScrollView f76835S0;

    /* renamed from: T0 */
    String f76836T0;

    /* renamed from: U0 */
    String f76837U0;

    /* renamed from: V0 */
    MessageId f76838V0;

    /* renamed from: W0 */
    int f76839W0;

    /* renamed from: X0 */
    int f76840X0;

    /* renamed from: Y0 */
    int f76841Y0;

    /* renamed from: a1 */
    EditText f76843a1;

    /* renamed from: b1 */
    ImageView f76844b1;

    /* renamed from: c1 */
    LinearLayout f76845c1;

    /* renamed from: Q0 */
    ArrayList f76833Q0 = new ArrayList();

    /* renamed from: Z0 */
    HashSet f76842Z0 = new HashSet();

    /* renamed from: d1 */
    C17945a0 f76846d1 = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RatingCallView$a */
    /* loaded from: classes6.dex */
    public class C14919a implements TextWatcher {
        C14919a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() > 3000) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_text));
                RatingCallView.this.f76843a1.setText(RatingCallView.this.f76843a1.getText().toString().substring(0, 3000));
                RatingCallView.this.f76843a1.setSelection(3000);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            int i14;
            if ((RatingCallView.this.f76842Z0.size() == 1 && RatingCallView.this.f76842Z0.contains(100)) || RatingCallView.this.f76842Z0.size() == 0) {
                RatingCallView.this.f76834R0.setEnabled(true ^ TextUtils.isEmpty(charSequence.toString().trim()));
            }
            ImageView imageView = RatingCallView.this.f76844b1;
            if (TextUtils.isEmpty(charSequence.toString())) {
                i14 = 8;
            } else {
                i14 = 0;
            }
            imageView.setVisibility(i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RatingCallView$b */
    /* loaded from: classes6.dex */
    public class C14920b implements IVoipServiceRequestCallback {
        C14920b() {
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestComplete(String str) {
            RatingCallView.this.mo50035CK(-1, new Intent());
            RatingCallView.this.f72421L0.finish();
        }

        @Override // com.zing.zalo.plugin.IVoipServiceRequestCallback
        public void onRequestFailed(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m83501mM() {
        this.f76843a1.requestFocus();
        AbstractC2379w.m12432f(this.f76843a1);
        this.f76835S0.fullScroll(130);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m83502nM(ImageView imageView, Pair pair, View view) {
        imageView.setSelected(!imageView.isSelected());
        if (imageView.isSelected()) {
            this.f76842Z0.add((Integer) pair.first);
        } else {
            this.f76842Z0.remove(pair.first);
        }
        if (this.f76842Z0.size() == 1 && this.f76842Z0.contains(100)) {
            this.f76834R0.setEnabled(true ^ TextUtils.isEmpty(this.f76843a1.getText().toString().trim()));
        } else if (this.f76842Z0.size() != 0) {
            this.f76834R0.setEnabled(true);
        } else if (this.f76842Z0.size() == 0) {
            this.f76834R0.setEnabled(false);
        }
        if (this.f76845c1 != null && ((Integer) pair.first).intValue() == 100) {
            if (imageView.isSelected()) {
                this.f76845c1.setVisibility(0);
                this.f76835S0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ua0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RatingCallView.this.m83501mM();
                    }
                });
            } else {
                AbstractC2379w.m12430d(this.f76843a1);
                this.f76845c1.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m83503oM() {
        this.f76835S0.fullScroll(130);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m83504pM(View view) {
        this.f76843a1.requestFocus();
        AbstractC2379w.m12432f(this.f76843a1);
        this.f76835S0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.va0
            @Override // java.lang.Runnable
            public final void run() {
                RatingCallView.this.m83503oM();
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ boolean m83505qM(View view, MotionEvent motionEvent) {
        if (this.f76843a1.hasFocus()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if ((motionEvent.getAction() & 255) == 8) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m83506rM(View view) {
        this.f76843a1.setText("");
    }

    /* renamed from: tM */
    private void m83507tM(View view) {
        try {
            RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_send_rating);
            this.f76834R0 = robotoTextView;
            robotoTextView.setOnClickListener(this);
            this.f76835S0 = (ScrollView) view.findViewById(AbstractC6918a0.scroll_view);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.contentOptionRating);
            int i11 = -1;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i12 = 0;
            layoutParams.setMargins(0, 0, 0, AbstractC23136l9.m118742r(8.0f));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.f76845c1 = linearLayout2;
            linearLayout2.setLayoutParams(layoutParams);
            this.f76845c1.setMinimumHeight(AbstractC23136l9.m118742r(48.0f));
            this.f76845c1.setOrientation(0);
            LinearLayout linearLayout3 = this.f76845c1;
            linearLayout3.setBackground(AbstractC23136l9.m118665N(linearLayout3.getContext(), AbstractC16803z.edt_normal));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, AbstractC23136l9.m118742r(14.0f), 0, AbstractC23136l9.m118742r(10.0f));
            RobotoTextView robotoTextView2 = new RobotoTextView(getContext());
            robotoTextView2.setLayoutParams(layoutParams2);
            robotoTextView2.setGravity(16);
            robotoTextView2.setText(m92652XI(AbstractC8020f0.str_sub_additional_comment_rating));
            robotoTextView2.setTextSize(1, 18.0f);
            robotoTextView2.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            robotoTextView2.setTextStyleBold(true);
            linearLayout.addView(robotoTextView2);
            ArrayList arrayList = this.f76833Q0;
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f76845c1.setVisibility(8);
                Iterator it = this.f76833Q0.iterator();
                while (it.hasNext()) {
                    final Pair pair = (Pair) it.next();
                    LinearLayout linearLayout4 = new LinearLayout(getContext());
                    linearLayout4.setOrientation(0);
                    linearLayout4.setPadding(0, AbstractC23136l9.m118742r(5.0f), 0, AbstractC23136l9.m118742r(5.0f));
                    linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(i11, -2));
                    linearLayout4.setGravity(16);
                    linearLayout4.setBackground(m92651WI().getDrawable(AbstractC16803z.stencils_contact_bg));
                    final ImageView imageView = new ImageView(getContext());
                    imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    imageView.setImageDrawable(m92651WI().getDrawable(AbstractC16803z.selector_checkbox_rating_call));
                    imageView.setSelected(false);
                    linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.qa0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            RatingCallView.this.m83502nM(imageView, pair, view2);
                        }
                    });
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i11, -2);
                    RobotoTextView robotoTextView3 = new RobotoTextView(getContext());
                    robotoTextView3.setLayoutParams(layoutParams3);
                    robotoTextView3.setPadding(AbstractC23136l9.m118742r(5.0f), 0, 0, 0);
                    robotoTextView3.setGravity(16);
                    robotoTextView3.setText((CharSequence) pair.second);
                    robotoTextView3.setTextSize(1, 16.0f);
                    robotoTextView3.setTextColor(C23212s8.m119607o(robotoTextView3.getContext(), AbstractC21196a.TextColor1));
                    linearLayout4.addView(imageView);
                    linearLayout4.addView(robotoTextView3);
                    linearLayout.addView(linearLayout4);
                    i11 = -1;
                }
            }
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
            layoutParams4.weight = 1.0f;
            EditText editText = new EditText(getContext());
            this.f76843a1 = editText;
            editText.setLayoutParams(layoutParams4);
            this.f76843a1.setHint(AbstractC8020f0.str_describe_your_other_problem);
            this.f76843a1.setHintTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
            this.f76843a1.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            this.f76843a1.setBackgroundColor(m92651WI().getColor(AbstractC16801x.transparent));
            EditText editText2 = this.f76843a1;
            editText2.setInputType(editText2.getInputType() | 180224);
            this.f76843a1.setTextSize(16.0f);
            this.f76843a1.setMinHeight(AbstractC23136l9.m118742r(48.0f));
            this.f76843a1.setMaxLines(3);
            this.f76843a1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ra0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RatingCallView.this.m83504pM(view2);
                }
            });
            this.f76843a1.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.sa0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean m83505qM;
                    m83505qM = RatingCallView.this.m83505qM(view2, motionEvent);
                    return m83505qM;
                }
            });
            this.f76843a1.addTextChangedListener(new C14919a());
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(27.0f), AbstractC23136l9.m118742r(27.0f));
            layoutParams5.setMargins(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
            layoutParams5.gravity = 16;
            ImageView imageView2 = new ImageView(getContext());
            this.f76844b1 = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            this.f76844b1.setImageResource(AbstractC16803z.ic_ipt_clear);
            this.f76844b1.setLayoutParams(layoutParams5);
            ImageView imageView3 = this.f76844b1;
            if (TextUtils.isEmpty(this.f76843a1.getText().toString())) {
                i12 = 8;
            }
            imageView3.setVisibility(i12);
            this.f76844b1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ta0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RatingCallView.this.m83506rM(view2);
                }
            });
            this.f76845c1.addView(this.f76843a1);
            this.f76845c1.addView(this.f76844b1);
            linearLayout.addView(this.f76845c1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                String string = m92642L3.getString("ratingJsonType");
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    JSONArray jSONArray = jSONObject.getJSONArray("contentRating");
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        this.f76833Q0.add(new Pair(Integer.valueOf(jSONObject2.getInt("id")), jSONObject2.getString("content")));
                    }
                    this.f76839W0 = jSONObject.getInt("callId");
                    this.f76837U0 = jSONObject.getString("calleeId");
                    this.f76836T0 = jSONObject.getString("callerId");
                    this.f76840X0 = jSONObject.getInt("rating");
                    this.f76841Y0 = jSONObject.optInt("versionId");
                }
                this.f76838V0 = (MessageId) m92642L3.getParcelable("message_id");
                this.f76846d1 = AbstractC23306f.m120584H0().m2636s(this.f76838V0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        KeyboardAwareLinearLayout keyboardAwareLinearLayout = (KeyboardAwareLinearLayout) layoutInflater.inflate(AbstractC7409c0.layout_rating_call_view, viewGroup, false);
        this.f76832P0 = keyboardAwareLinearLayout;
        m83507tM(keyboardAwareLinearLayout);
        return this.f76832P0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        AbstractC2379w.m12430d(this.f76843a1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(m92651WI().getString(AbstractC8020f0.str_additional_comment_rating));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "RatingCallView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_send_rating) {
            m83508sM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC2379w.m12430d(this.f76843a1);
            AbstractC23647d.m123897g("38502");
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (m92676n2() instanceof Activity) {
            m92676n2().mo35554O(32);
        }
    }

    /* renamed from: sM */
    void m83508sM() {
        String str;
        C14920b c14920b = new C14920b();
        AbstractC32273e3 m155748Q = AbstractC32273e3.m155748Q();
        int parseInt = Integer.parseInt(this.f76837U0);
        int i11 = this.f76839W0;
        int i12 = this.f76840X0;
        HashSet hashSet = this.f76842Z0;
        EditText editText = this.f76843a1;
        if (editText != null) {
            str = editText.getText().toString().trim();
        } else {
            str = "";
        }
        m155748Q.mo155852U1(parseInt, 0, 0, i11, i12, hashSet, str, c14920b, this.f76841Y0);
    }
}
