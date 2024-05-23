package com.zing.zalo.uicontrol;

import android.content.Context;
import android.widget.FrameLayout;
import com.zing.zalo.uicontrol.PushToTalkControl;
import fn0.AbstractC19074t;
import p363nh.C23744a;
import th.AbstractC26683d;

/* loaded from: classes4.dex */
public abstract class AbstractPushToTalkControl extends FrameLayout {

    /* renamed from: p */
    private int f83063p;

    /* renamed from: q */
    private String f83064q;

    /* renamed from: r */
    private String f83065r;

    /* renamed from: s */
    private PushToTalkControl.InterfaceC16483d f83066s;

    /* renamed from: t */
    private boolean f83067t;

    /* renamed from: u */
    private boolean f83068u;

    /* renamed from: v */
    private boolean f83069v;

    /* renamed from: w */
    private boolean f83070w;

    /* renamed from: x */
    private boolean f83071x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPushToTalkControl(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f83064q = "";
        this.f83065r = "0";
        this.f83067t = true;
    }

    /* renamed from: a */
    public abstract void mo87648a();

    /* renamed from: b */
    public abstract void mo87649b();

    /* renamed from: c */
    public abstract void mo87650c();

    /* renamed from: d */
    public abstract void mo87651d();

    /* renamed from: e */
    public final boolean m87652e() {
        return this.f83069v;
    }

    /* renamed from: f */
    public abstract boolean mo87653f();

    /* renamed from: g */
    public final boolean m87654g() {
        return this.f83068u;
    }

    public final String getFileRecordName() {
        return this.f83064q;
    }

    public final int getMaxAmplitudeRecorder() {
        return this.f83063p;
    }

    public final PushToTalkControl.InterfaceC16483d getPttListener() {
        return this.f83066s;
    }

    public final String getTrackingLogChatType() {
        return this.f83065r;
    }

    /* renamed from: h */
    public final boolean m87655h() {
        return this.f83067t;
    }

    /* renamed from: i */
    public final boolean m87656i() {
        return this.f83070w;
    }

    /* renamed from: j */
    public final boolean m87657j() {
        return this.f83071x;
    }

    /* renamed from: k */
    public abstract void mo87658k();

    /* renamed from: l */
    public abstract void mo87659l(boolean z11);

    /* renamed from: m */
    public final void m87660m(String str) {
        if (str == null) {
            str = this.f83064q;
        }
        this.f83064q = str;
    }

    public final void setFileRecordName(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f83064q = str;
    }

    public final void setFreeHandMode(boolean z11) {
        this.f83069v = z11;
        if (z11 && AbstractC26683d.f126399r) {
            C23744a.Companion.m124119a().m124116d(4002, new Object[0]);
        }
    }

    public final void setMaxAmplitudeRecorder(int i11) {
        this.f83063p = i11;
    }

    public final void setPttListener(PushToTalkControl.InterfaceC16483d interfaceC16483d) {
        this.f83066s = interfaceC16483d;
    }

    public final void setRecordCancelled(boolean z11) {
        this.f83068u = z11;
    }

    public final void setRecordSupport(boolean z11) {
        this.f83067t = z11;
    }

    public final void setRecorderPressing(boolean z11) {
        this.f83070w = z11;
    }

    public final void setRecording(boolean z11) {
        this.f83071x = z11;
    }

    public final void setTrackingLogChatType(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f83065r = str;
    }
}
