package com.zing.zalo.calls;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import org.json.JSONObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class GroupCallOngoingData {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private int f40390a;

    /* renamed from: b */
    private int f40391b;

    /* renamed from: c */
    private int f40392c;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return GroupCallOngoingData$$serializer.INSTANCE;
        }
    }

    public GroupCallOngoingData() {
    }

    /* renamed from: d */
    public static final /* synthetic */ void m37672d(GroupCallOngoingData groupCallOngoingData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || groupCallOngoingData.f40390a != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, groupCallOngoingData.f40390a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || groupCallOngoingData.f40391b != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, groupCallOngoingData.f40391b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || groupCallOngoingData.f40392c != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 2, groupCallOngoingData.f40392c);
        }
    }

    /* renamed from: a */
    public final int m37673a() {
        return this.f40390a;
    }

    /* renamed from: b */
    public final int m37674b() {
        return this.f40391b;
    }

    /* renamed from: c */
    public final int m37675c() {
        return this.f40392c;
    }

    public /* synthetic */ GroupCallOngoingData(int i11, int i12, int i13, int i14, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f40390a = 0;
        } else {
            this.f40390a = i12;
        }
        if ((i11 & 2) == 0) {
            this.f40391b = 0;
        } else {
            this.f40391b = i13;
        }
        if ((i11 & 4) == 0) {
            this.f40392c = 0;
        } else {
            this.f40392c = i14;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupCallOngoingData(JSONObject jSONObject) {
        this();
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        try {
            if (jSONObject.has("callId")) {
                this.f40390a = jSONObject.optInt("callId");
            }
            if (jSONObject.has("groupId")) {
                this.f40391b = jSONObject.optInt("groupId");
            }
            if (jSONObject.has("hostId")) {
                this.f40392c = jSONObject.optInt("hostId");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
