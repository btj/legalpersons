package legalpersons.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

import legalpersons.LegalPerson;

class LegalPersonTest {

	@Test
	void test() {
		LegalPerson larryPage = new LegalPerson(null);
		assertEquals(null, larryPage.getOwner());
		assertEquals(Set.of(), larryPage.getOwnedEntities());
		
		LegalPerson alphabet = new LegalPerson(larryPage);
		assertEquals(larryPage, alphabet.getOwner());
		assertEquals(Set.of(), alphabet.getOwnedEntities());
		assertEquals(Set.of(alphabet), larryPage.getOwnedEntities());
		
		LegalPerson google = new LegalPerson(alphabet);
		assertEquals(alphabet, google.getOwner());
		assertEquals(Set.of(), google.getOwnedEntities());
		assertEquals(Set.of(google), alphabet.getOwnedEntities());
	}

}
