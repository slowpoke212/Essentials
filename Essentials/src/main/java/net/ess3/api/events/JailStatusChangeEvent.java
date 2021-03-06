package net.ess3.api.events;

import net.ess3.api.IUser;

/**
 * Fired when a player's jail status changes.
 * <p>
 * Note: when a user is about to be jailed, you currently can't access which jail the user is being put into until after the /togglejail command finishes executing.
 * You <i>can</i>, however, access the player's current jail when they are about to be unjailed by calling {@link IUser#getJail()}.
 */
public class JailStatusChangeEvent extends StatusChangeEvent {
    public JailStatusChangeEvent(final IUser affected, final IUser controller, final boolean value) {
        super(affected, controller, value);
    }
}
