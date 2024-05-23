package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.C1295c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AbstractC1579n0;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23583h;

/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: N */
    private final Chip f36214N;

    /* renamed from: O */
    private final Chip f36215O;

    /* renamed from: P */
    private final ClockHandView f36216P;

    /* renamed from: Q */
    private final ClockFaceView f36217Q;

    /* renamed from: R */
    private final MaterialButtonToggleGroup f36218R;

    /* renamed from: S */
    private final View.OnClickListener f36219S;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    /* loaded from: classes3.dex */
    class ViewOnClickListenerC6453a implements View.OnClickListener {
        ViewOnClickListenerC6453a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.m33286D(TimePickerView.this);
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    /* loaded from: classes3.dex */
    class C6454b implements MaterialButtonToggleGroup.InterfaceC6270e {
        C6454b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC6270e
        /* renamed from: a */
        public void mo31929a(MaterialButtonToggleGroup materialButtonToggleGroup, int i11, boolean z11) {
            TimePickerView.m33287E(TimePickerView.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    /* loaded from: classes3.dex */
    public class C6455c extends GestureDetector.SimpleOnGestureListener {
        C6455c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            TimePickerView.m33288F(TimePickerView.this);
            return onDoubleTap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    /* loaded from: classes3.dex */
    public class ViewOnTouchListenerC6456d implements View.OnTouchListener {

        /* renamed from: p */
        final /* synthetic */ GestureDetector f36223p;

        ViewOnTouchListenerC6456d(GestureDetector gestureDetector) {
            this.f36223p = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f36223p.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    /* loaded from: classes3.dex */
    interface InterfaceC6457e {
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    /* loaded from: classes3.dex */
    interface InterfaceC6458f {
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    /* loaded from: classes3.dex */
    interface InterfaceC6459g {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: D */
    static /* synthetic */ InterfaceC6459g m33286D(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* renamed from: E */
    static /* synthetic */ InterfaceC6458f m33287E(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* renamed from: F */
    static /* synthetic */ InterfaceC6457e m33288F(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* renamed from: G */
    private void m33289G() {
        this.f36214N.setTag(AbstractC23581f.selection_type, 12);
        this.f36215O.setTag(AbstractC23581f.selection_type, 10);
        this.f36214N.setOnClickListener(this.f36219S);
        this.f36215O.setOnClickListener(this.f36219S);
    }

    /* renamed from: H */
    private void m33290H() {
        ViewOnTouchListenerC6456d viewOnTouchListenerC6456d = new ViewOnTouchListenerC6456d(new GestureDetector(getContext(), new C6455c()));
        this.f36214N.setOnTouchListener(viewOnTouchListenerC6456d);
        this.f36215O.setOnTouchListener(viewOnTouchListenerC6456d);
    }

    /* renamed from: I */
    private void m33291I() {
        int i11;
        if (this.f36218R.getVisibility() == 0) {
            C1295c c1295c = new C1295c();
            c1295c.m6456p(this);
            if (AbstractC1579n0.m7812G(this) == 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            c1295c.m6454n(AbstractC23581f.material_clock_display, i11);
            c1295c.m6450i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m33291I();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (view == this && i11 == 0) {
            m33291I();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36219S = new ViewOnClickListenerC6453a();
        LayoutInflater.from(context).inflate(AbstractC23583h.material_timepicker, this);
        this.f36217Q = (ClockFaceView) findViewById(AbstractC23581f.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(AbstractC23581f.material_clock_period_toggle);
        this.f36218R = materialButtonToggleGroup;
        materialButtonToggleGroup.m31918g(new C6454b());
        this.f36214N = (Chip) findViewById(AbstractC23581f.material_minute_tv);
        this.f36215O = (Chip) findViewById(AbstractC23581f.material_hour_tv);
        this.f36216P = (ClockHandView) findViewById(AbstractC23581f.material_clock_hand);
        m33290H();
        m33289G();
    }
}
