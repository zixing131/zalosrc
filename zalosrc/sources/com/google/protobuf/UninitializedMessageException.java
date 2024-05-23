package com.google.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: p */
    private final List f37234p;

    public UninitializedMessageException(InterfaceC6809i0 interfaceC6809i0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f37234p = null;
    }
}
