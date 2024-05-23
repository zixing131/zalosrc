package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import ge.C19424p;
import ge.C19427s;
import me0.AbstractC23136l9;
import p159fe.ViewOnClickListenerC18891c;

/* loaded from: classes6.dex */
public class RepeatTypeBottomPicker extends BottomPickerView implements View.OnClickListener {

    /* renamed from: U0 */
    ImageView f76947U0;

    /* renamed from: V0 */
    RobotoTextView f76948V0;

    /* renamed from: W0 */
    RobotoTextView f76949W0;

    /* renamed from: X0 */
    ListView f76950X0;

    /* renamed from: Y0 */
    ViewOnClickListenerC18891c f76951Y0;

    /* renamed from: Z0 */
    boolean f76952Z0;

    /* renamed from: a1 */
    InterfaceC14937a f76953a1;

    /* renamed from: b1 */
    C19424p f76954b1;

    /* renamed from: c1 */
    boolean f76955c1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.RepeatTypeBottomPicker$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC14937a extends BottomPickerView.InterfaceC14112a {
        /* renamed from: f */
        void mo83625f(C19424p c19424p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qL */
    public /* synthetic */ void m83619qL(AdapterView adapterView, View view, int i11, long j11) {
        C19427s item = this.f76951Y0.getItem(i11);
        ViewOnClickListenerC18891c viewOnClickListenerC18891c = this.f76951Y0;
        int i12 = viewOnClickListenerC18891c.f94318r;
        if (i12 != 0 && i12 != 1) {
            if (i12 == 2) {
                if (viewOnClickListenerC18891c.f94319s.f96371b.contains(Integer.valueOf(item.f96381a))) {
                    this.f76951Y0.f94319s.f96371b.remove(Integer.valueOf(item.f96381a));
                    if (this.f76951Y0.f94319s.f96371b.size() == 0) {
                        this.f76951Y0.f94319s.f96370a = -1;
                    }
                } else {
                    this.f76951Y0.f94319s.f96371b.add(Integer.valueOf(item.f96381a));
                    this.f76951Y0.f94319s.f96370a = 4;
                }
                this.f76951Y0.notifyDataSetChanged();
            }
        } else {
            int i13 = item.f96381a;
            if (i13 == 4) {
                this.f76948V0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_picker_weekly_custom_title));
                this.f76951Y0.m99048b(2);
                this.f76951Y0.f94319s.f96370a = 4;
                m83624uL(true);
            } else {
                C19424p c19424p = viewOnClickListenerC18891c.f94319s;
                if (c19424p.f96370a != i13) {
                    c19424p.f96370a = i13;
                    viewOnClickListenerC18891c.notifyDataSetChanged();
                }
            }
        }
        m83622pL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rL */
    public /* synthetic */ boolean m83620rL(InterfaceC17463d interfaceC17463d, int i11, KeyEvent keyEvent) {
        if (i11 != 4 || keyEvent.getAction() != 1 || this.f76951Y0.f94318r != 2) {
            return false;
        }
        this.f76948V0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_picker_title));
        if (this.f76952Z0) {
            this.f76951Y0.m99048b(1);
        } else {
            this.f76951Y0.m99048b(0);
        }
        m83624uL(false);
        m83622pL();
        return true;
    }

    /* renamed from: sL */
    public static RepeatTypeBottomPicker m83621sL(C19424p c19424p, boolean z11, InterfaceC14937a interfaceC14937a) {
        Bundle m78535kL = BottomPickerView.m78535kL();
        RepeatTypeBottomPicker repeatTypeBottomPicker = new RepeatTypeBottomPicker();
        repeatTypeBottomPicker.m83623tL(interfaceC14937a);
        repeatTypeBottomPicker.mo60305zK(m78535kL);
        repeatTypeBottomPicker.f76952Z0 = z11;
        repeatTypeBottomPicker.f76954b1 = c19424p;
        return repeatTypeBottomPicker;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: Kj */
    public void mo71219Kj(View view, MotionEvent motionEvent) {
        try {
            this.f76955c1 = true;
            super.mo71219Kj(view, motionEvent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: TH */
    public void mo71235TH(View view, MotionEvent motionEvent, boolean z11) {
        try {
            this.f76955c1 = false;
            super.mo71235TH(view, motionEvent, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    public View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mo62728eL = super.mo62728eL(layoutInflater, viewGroup, bundle);
        this.f83659I0 = mo62728eL;
        ImageView imageView = (ImageView) mo62728eL.findViewById(AbstractC6918a0.repeat_picker_back);
        this.f76947U0 = imageView;
        imageView.setOnClickListener(this);
        this.f76948V0 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.repeat_picker_title);
        RobotoTextView robotoTextView = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.repeat_picker_done);
        this.f76949W0 = robotoTextView;
        robotoTextView.setOnClickListener(this);
        this.f76950X0 = (ListView) this.f83659I0.findViewById(AbstractC6918a0.repeat_type_list);
        Context context = getContext();
        boolean z11 = this.f76952Z0;
        ViewOnClickListenerC18891c viewOnClickListenerC18891c = new ViewOnClickListenerC18891c(context, z11 ? 1 : 0, this.f76954b1);
        this.f76951Y0 = viewOnClickListenerC18891c;
        this.f76950X0.setAdapter((ListAdapter) viewOnClickListenerC18891c);
        this.f76950X0.setDivider(null);
        this.f76950X0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.dc0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                RepeatTypeBottomPicker.this.m83619qL(adapterView, view, i11, j11);
            }
        });
        m92598PK(new InterfaceC17463d.f() { // from class: com.zing.zalo.ui.zviews.ec0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.f
            /* renamed from: Tx */
            public final boolean mo87296Tx(InterfaceC17463d interfaceC17463d, int i11, KeyEvent keyEvent) {
                boolean m83620rL;
                m83620rL = RepeatTypeBottomPicker.this.m83620rL(interfaceC17463d, i11, keyEvent);
                return m83620rL;
            }
        });
        return this.f83659I0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: lL */
    protected View mo78264lL() {
        return this.f76950X0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: m6 */
    public boolean mo71274m6(View view, MotionEvent motionEvent, boolean z11, float f11, float f12, boolean z12) {
        try {
            if (!this.f72450R0 && z11 && Math.abs(f12) < this.f72448P0) {
                return false;
            }
            boolean m118664M0 = AbstractC23136l9.m118664M0(mo78264lL(), motionEvent, view);
            if (!this.f72450R0) {
                if (!this.f76955c1 && m118664M0) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.repeat_type_bottom_picker_layout;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.repeat_picker_back) {
            if (this.f76951Y0.f94318r == 2) {
                this.f76948V0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_repeat_type_picker_title));
                if (this.f76952Z0) {
                    this.f76951Y0.m99048b(1);
                } else {
                    this.f76951Y0.m99048b(0);
                }
                m83624uL(false);
            }
            m83622pL();
            return;
        }
        if (id2 == AbstractC6918a0.repeat_picker_done) {
            C19424p c19424p = this.f76951Y0.f94319s;
            if (c19424p.f96370a != 4) {
                c19424p.f96371b.clear();
            }
            InterfaceC14937a interfaceC14937a = this.f76953a1;
            if (interfaceC14937a != null) {
                interfaceC14937a.mo83625f(this.f76951Y0.f94319s);
            }
            super.dismiss();
        }
    }

    /* renamed from: pL */
    void m83622pL() {
        this.f76949W0.setEnabled(this.f76951Y0.f94319s.m101570b());
    }

    /* renamed from: tL */
    public void m83623tL(InterfaceC14937a interfaceC14937a) {
        this.f76953a1 = interfaceC14937a;
        this.f72452T0 = interfaceC14937a;
    }

    /* renamed from: uL */
    void m83624uL(boolean z11) {
        int i11;
        ImageView imageView = this.f76947U0;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageView.setVisibility(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m92594JK().m92867k().m92901h().flags |= 65536;
        try {
            m92642L3();
            m83622pL();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
